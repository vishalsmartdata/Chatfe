package com.sdei.chafte.ui.home.notification

import android.Manifest
import android.content.*
import android.net.Uri
import android.os.Bundle
import android.provider.CalendarContract
import android.provider.Settings
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.DexterError
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityNotificationBinding
import com.sdei.chafte.model.FriendRequestData
import com.sdei.chafte.model.FriendResult
import com.sdei.chafte.model.JoinData
import com.sdei.chafte.model.PrivateRoomResult
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.chafte.utils.getCalendarData
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import java.util.*
import kotlin.collections.ArrayList

class NotificationActivity : BaseActivity<ActivityNotificationBinding, NotificationVM>(), RecyclerCallback {
    override val binding: ActivityNotificationBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_notification
    override var viewModel: NotificationVM
        get() = setUpVM(
            this,
            NotificationVM(application)
        )
        set(value) {}
    override val context: Context
        get() = this

    private val bindList = RecyclerBindingList<FriendResult>()
    val userList = ArrayList<FriendResult>()

    private val bindPrivateRoomList = RecyclerBindingList<PrivateRoomResult>()
    val privateRoomList = ArrayList<PrivateRoomResult>()


    override fun bindData() {
       binding.nvm=viewModel

        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->   showProgress()
                false ->   hideProgress()
            }
        })

        viewModel.observerAddRoomResponse()?.observe (this, Observer {
            showSnackBar(binding.root, getString(R.string.joined_room_successfully), false)
            requestCalendarPermission(it)
        })

        viewModel.observerUserRequestResponse()?.observe (this, Observer {
            userList.clear()
            userList.addAll(it.friendResult)
            bindList.itemsList = userList
            binding?.list = bindList
            binding?.click = this

            privateRoomList.clear()
            privateRoomList.addAll(it.privateRoomResult)
            bindPrivateRoomList.itemsList = privateRoomList
            binding?.privateRoomlist = bindPrivateRoomList
            binding?.click = this

            if(userList.size==0){
                binding.txFriendRequest.visibility=View.GONE
            }else{
                binding.txFriendRequest.visibility=View.VISIBLE
            }

            if(privateRoomList.size==0){
                binding.txInvites.visibility=View.GONE
            }else{
                binding.txInvites.visibility=View.VISIBLE
            }

            if(privateRoomList.size==0 && userList.size==0){
                binding.txNodataFound.visibility=View.VISIBLE
            }
        })

        viewModel.observerRequestResponse()?.observe(this,{
            showSnackBar(binding.root, it, false)
            viewModel.getUserRequets(getData(SessionManager.AUTHENTICATION))
        })

        viewModel.getUserRequets(getData(SessionManager.AUTHENTICATION))
    }

    override fun initListeners() {
        binding.imgCancel.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("key", "login")
            navigateActivity(HomeActivity(),bundle)
            finish()
        }
    }

    override fun onItemClick(view: View?, position: Int) {
        if(view?.id == R.id.txAccept){
            viewModel.getAcceptRequest(getData(SessionManager.AUTHENTICATION),userList[position]._id)
        }
        if(view?.id == R.id.txReject){
            viewModel.getRejectRequest(getData(SessionManager.AUTHENTICATION),userList[position]._id)
        }
        if(view?.id == R.id.txjoin){
            viewModel.getAddRoom(
                getData(SessionManager.AUTHENTICATION),
                getData(SessionManager.USER_ID),
                privateRoomList[position].roomId
            )
        }
    }

    override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {

    }

    override fun itemAction(type: String?, position: Int) {

    }

    private fun requestCalendarPermission(it: JoinData) {
        Dexter.withActivity(this)
            .withPermissions(
                Manifest.permission.READ_CALENDAR,
                Manifest.permission.WRITE_CALENDAR,
            )
            .withListener(object : MultiplePermissionsListener {
                override fun onPermissionsChecked(report: MultiplePermissionsReport) {
                    if (report.areAllPermissionsGranted()) {
                        var startTime = getCalendarData(it.roomId.startTime,it.roomId.date)
                        var endTime = startTime.clone() as Calendar
                        if(!it.roomId.duration.toString().contains(".")) {
                            endTime.add(Calendar.HOUR_OF_DAY, it.roomId.duration.toInt())
                        }
                        else {
                            var hours = it.roomId.duration - 0.5
                            endTime.add(Calendar.HOUR_OF_DAY, hours.toInt())
                            endTime.add(Calendar.MINUTE, 30)
                        }
                        // endTime.add(Calendar.HOUR_OF_DAY, it.roomId.duration.toInt())

                        val cr: ContentResolver = mContext.getContentResolver()
                        val timeZone = TimeZone.getDefault()
                        val values = ContentValues().apply {
                            put(CalendarContract.Events.DTSTART, startTime.timeInMillis)
                            put(CalendarContract.Events.DTEND, endTime.timeInMillis)
                            put(CalendarContract.Events.TITLE, it.roomId.roomName)
                            put(CalendarContract.Events.DESCRIPTION, it.roomId.about)
                            put(CalendarContract.Events.CALENDAR_ID, 1)
                            put(CalendarContract.Events.EVENT_TIMEZONE, timeZone.id)
                        }
                        val uri: Uri? = cr.insert(CalendarContract.Events.CONTENT_URI, values)
                        val eventID: Long = uri?.lastPathSegment!!.toLong()
                        Log.e("eventID",eventID.toString())
                        viewModel.getUserRequets(getData(SessionManager.AUTHENTICATION))
                    }
                    if (report.isAnyPermissionPermanentlyDenied) {
                        showSettingsDialog()
                    }
                }

                override fun onPermissionRationaleShouldBeShown(
                    permissions: List<PermissionRequest>,
                    token: PermissionToken
                ) {
                    token.continuePermissionRequest()
                }
            })
            .withErrorListener { error: DexterError? ->
                Toast.makeText(mContext, "Error occurred! ", Toast.LENGTH_SHORT)
                    .show()
            }
            .onSameThread()
            .check()
    }

    private fun showSettingsDialog() {
        val builder = AlertDialog.Builder(mContext)
        builder.setTitle("Need Permissions")
        builder.setMessage(
            "This app needs permission to use this feature. You can grant them in app settings."
        )
        builder.setPositiveButton(
            "GOTO SETTINGS"
        ) { dialog: DialogInterface, which: Int ->
            dialog.cancel()
            openSettings()
        }
        builder.setNegativeButton(
            "Cancel"
        ) { dialog: DialogInterface, which: Int -> dialog.cancel() }
        builder.show()
    }

    private fun openSettings() {
        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
        val uri = Uri.fromParts("package", mContext.packageName, null)
        intent.data = uri
        startActivityForResult(intent, 101)
    }

}