package com.sdei.chafte.ui.home

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentHomeBinding
import com.sdei.chafte.model.CategoryData
import com.sdei.chafte.model.RoomData
import com.sdei.chafte.ui.home.event_detail.EventDetailsActivity
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.chafte.utils.getCalendarData
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import java.util.*
import kotlin.collections.ArrayList
import android.provider.CalendarContract

import android.content.ContentValues

import android.content.ContentResolver
import android.content.DialogInterface
import android.net.Uri
import android.provider.Settings
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.DexterError
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import com.sdei.chafte.model.CreateRoomData
import com.sdei.chafte.model.JoinData
import com.sdei.chafte.utils.getLocalToUTCTimezoneString

import com.sdei.chafte.utils.localToUTC
import java.text.SimpleDateFormat

/**
 * Created by Vishal Sharma on 2020-01-24.
 */
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeVM>(), RecyclerCallback {
    override val layoutId: Int
        get() = R.layout.fragment_home
    override var viewModel: HomeVM
        get() = setUpVM(activity as HomeActivity, HomeVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentHomeBinding
        get() = setUpBinding()
        set(value) {}

    val categorylist = ArrayList<CategoryData>()
    val roomList = ArrayList<RoomData>()

    private val bindList = RecyclerBindingList<CategoryData>()
    private val bindRoomList = RecyclerBindingList<RoomData>()
    var selected_category_id =""
    var selected_start_time =""
    var selected_sort_by =""
    var free_on_calenndar =""
    var selected_date=""

    override fun bindData() {
        binding.fhVM = viewModel
        val bundle = arguments
        if(bundle!=null) {
            selected_category_id = bundle?.getString("category_id")!!
            selected_start_time = bundle?.getString("start_time")!!
            selected_sort_by = bundle?.getString("sort_id")!!
            free_on_calenndar = bundle?.getString("free_on_Calendar")!!
            selected_date = bundle?.getString("date")!!
            Log.e("SELECTED_Data",selected_category_id+" "+selected_sort_by+" "+selected_date+" "+selected_start_time+" "+free_on_calenndar)
        }
    }

    override fun initListeners() {

      var text  = localToUTC("2022-07-21 06:00PM")
        Log.e("localUTC",text!!)
        var change=getLocalToUTCTimezoneString(text)
        Log.e("changeinlocal",change!!)
        viewModel.tokenObserve()?.observe(this, Observer {
            baseActivity.logout(activity)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when(it) {
                true ->   baseActivity.showProgress()
                false ->  baseActivity.hideProgress()
            }
        })

        viewModel.observerError()?.observe (this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })

        viewModel.getAllCategory()
        viewModel.observerCategoryResponse()?.observe (this, Observer {
            viewModel.getAllRoom(baseActivity.getData(SessionManager.AUTHENTICATION),selected_category_id,selected_start_time,selected_sort_by,selected_date,free_on_calenndar)
            categorylist.addAll(it)
            bindList.itemsList = categorylist
            binding?.list = bindList
            binding?.click = this
            binding.recyclerView.layoutManager = LinearLayoutManager(baseActivity.mContext, LinearLayoutManager.HORIZONTAL ,false)
            binding.recyclerView.isHorizontalScrollBarEnabled=true
        })

        viewModel.observerRoomResponse()?.observe (this, Observer {
            roomList.clear()
            roomList.addAll(it)
            if(roomList.size==0){
                binding.txNodataFound.visibility=View.VISIBLE
            }else{
                binding.txNodataFound.visibility=View.GONE
            }
            bindRoomList.itemsList = roomList
            binding?.listItems = bindRoomList
            binding?.click = this
        })


        viewModel.observerAddRoomResponse()?.observe (this, Observer {
            showSnackBar(binding.root, getString(R.string.joined_room_successfully), false)
            requestCalendarPermission(it)
        })

        viewModel.observerCancelRoomResponse()?.observe (this, Observer {
            showSnackBar(binding.root, getString(R.string.cancel_joined_room_successfully), false)
            viewModel.getAllRoom(baseActivity.getData(SessionManager.AUTHENTICATION),selected_category_id,selected_start_time,selected_sort_by,selected_date,free_on_calenndar)
        })
    }

    override fun onItemClick(view: View?, position: Int) {
        if(view?.id== R.id.parentItem) {
            for (i in categorylist.indices) {
                if(position==i){
                    categorylist[i].selected=true
                }else {
                    categorylist[i].selected=false
                }
            }
            bindList.notifyDataChange()
            selected_category_id = categorylist[position]._id
            viewModel.getAllRoom(baseActivity.getData(SessionManager.AUTHENTICATION),selected_category_id,selected_start_time,selected_sort_by,selected_date,free_on_calenndar)
        }
        if(view?.id== R.id.clParent) {
            val bundle = Bundle()
            bundle.putString("key", "home")
            bundle.putString("room_id", roomList[position]._id)
            baseActivity.navigateActivity(EventDetailsActivity(),bundle)
        }
        if(view?.id== R.id.imgJoin) {
            if(roomList[position].hasRoomJoined){
                viewModel.getCancelRoom(
                    baseActivity.getData(SessionManager.AUTHENTICATION),
                    baseActivity.getData(SessionManager.USER_ID),
                    roomList[position]._id
                )
            }else {
                viewModel.getAddRoom(
                    baseActivity.getData(SessionManager.AUTHENTICATION),
                    baseActivity.getData(SessionManager.USER_ID),
                    roomList[position]._id
                )
            }
        }
    }

    override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {

    }

    override fun itemAction(type: String?, position: Int) {

    }

    private fun requestCalendarPermission(it: JoinData) {
        Dexter.withActivity(activity)
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

                        val cr: ContentResolver = baseActivity.mContext.getContentResolver()
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
                        viewModel.getAllRoom(baseActivity.getData(SessionManager.AUTHENTICATION),selected_category_id,selected_start_time,selected_sort_by,selected_date,free_on_calenndar)

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
                Toast.makeText(baseActivity.mContext, "Error occurred! ", Toast.LENGTH_SHORT)
                    .show()
            }
            .onSameThread()
            .check()
    }

    private fun showSettingsDialog() {
        val builder =
            AlertDialog.Builder(baseActivity.mContext)
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
        val uri = Uri.fromParts("package", baseActivity.mContext.packageName, null)
        intent.data = uri
        startActivityForResult(intent, 101)
    }

}