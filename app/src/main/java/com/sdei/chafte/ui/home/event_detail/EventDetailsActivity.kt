package com.sdei.chafte.ui.home.event_detail

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityEventDetailsBinding
import com.sdei.chafte.databinding.SelectRoomLayoutBinding
import com.sdei.chafte.model.UserData
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.ui.home.create_event.CreateEventActivity
import com.sdei.chafte.ui.home.setting.my_events.ViewUserProfileActivity
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.chafte.utils.setDateInterval
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import com.squareup.picasso.Picasso

class EventDetailsActivity : BaseActivity<ActivityEventDetailsBinding, EventDetailVm>() , RecyclerCallback {
    override val binding: ActivityEventDetailsBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_event_details
    override var viewModel: EventDetailVm
        get() = setUpVM(
            this,
            EventDetailVm(application)
        )
        set(value) {}
    override val context: Context
        get() = this

    var room_type=""
    var room_id=""
    val userList = ArrayList<UserData>()
    var hasRoomJoin=false

    private val bindList = RecyclerBindingList<UserData>()

    override fun bindData() {
        binding.dvm=viewModel
        binding.ImgBack.setOnClickListener { onBackPressed() }
    }

    override fun initListeners() {
         room_id= getIntent().getStringExtra("room_id")!!

        viewModel.observerAddRoomResponse()?.observe (this, Observer {
            showSnackBar(binding.root, getString(R.string.joined_room_successfully), false)
            binding.imgAdd.setImageDrawable(getDrawable(R.drawable.ic_added_in_room))
        })

        viewModel.observerCancelRoomResponse()?.observe (this, Observer {
            showSnackBar(binding.root, getString(R.string.cancel_joined_room_successfully), false)
            binding.imgAdd.setImageDrawable(getDrawable(R.drawable.ic_add_in_room))
        })

        viewModel.observerDeleteRoomResponse()?.observe (this, Observer {
            showSnackBar(binding.root, getString(R.string.delete_room_successfully), false)
            val bundle = Bundle()
            bundle.putString("key", "login")
            navigateActivity(HomeActivity(),bundle)
            finish()
        })

        viewModel.observerEventDetailResponse()?.observe (this, Observer {
            Log.e("response_id",""+it._id)
            Picasso.get()
                //  .load(url)
                .load(it.image)
                .error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.imgbanner)

            binding.txHeader.setText(it.roomName)
            binding.txAboutText.setText(it.about)
            binding.txdate.setText(setDateInterval(it.startTime,it.duration,it.date))
             hasRoomJoin=it.hasRoomJoined
            if(it.hasRoomJoined){
                binding.imgAdd.setImageDrawable(resources.getDrawable(R.drawable.ic_added_in_room))
            }else{
                binding.imgAdd.setImageDrawable(resources.getDrawable(R.drawable.ic_add_in_room))
            }

            userList.clear()
            it.userData.forEachIndexed { index, item ->
                if(!item._id.equals(getData(SessionManager.USER_ID))){
                    userList.add(item)
                }
            }
            Log.e("room_list", "" + userList.size)
            bindList.itemsList = userList
            binding?.list = bindList
            binding?.click = this
        })

        viewModel.observerMyEventDetailResponse()?.observe (this, Observer {
            var roomdetail=it.roomData
            Log.e("response_id",""+roomdetail._id)

             room_type=roomdetail.roomType
            if(room_type.equals("Private")) {
                binding.imgDelete.visibility=View.VISIBLE
            }else{
                binding.imgDelete.visibility=View.GONE
            }
            Picasso.get()
                //  .load(url)
                .load(roomdetail.image)
                .error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.imgbanner)

            binding.txHeader.setText(roomdetail.roomName)
            binding.txAboutText.setText(roomdetail.about)
            binding.txdate.setText(setDateInterval(roomdetail.startTime,roomdetail.duration,roomdetail.date))

            userList.clear()
            it.userData.forEachIndexed { index, item ->
                if(!item._id.equals(getData(SessionManager.USER_ID))){
                    userList.add(item)
                }
            }
            Log.e("room_list", "" + userList.size)
            bindList.itemsList = userList
            binding?.list = bindList
            binding?.click = this
        })

        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->   showProgress()
                false ->   hideProgress()
            }
        })

        if(getIntent().getStringExtra("key").equals("setting")){
            binding.imgAdd.visibility=View.GONE
            viewModel.getMyRoomDetails(getData(SessionManager.AUTHENTICATION)!!,room_id)
          //  binding.imgDelete.visibility=View.VISIBLE
        }else{
           // binding.imgAdd.visibility=View.GONE
          //     binding.imgDelete.visibility=View.GONE
            viewModel.getRoomDetails(getData(SessionManager.AUTHENTICATION)!!,room_id)
        }

        binding.imgAdd.setOnClickListener {
            if(hasRoomJoin){
                viewModel.getCancelRoom(
                    getData(SessionManager.AUTHENTICATION),
                    getData(SessionManager.USER_ID),
                    room_id
                )
            }else {
                viewModel.getAddRoom(
                    getData(SessionManager.AUTHENTICATION),
                    getData(SessionManager.USER_ID),
                    room_id
                )
            }
        }

        binding.imgDelete.setOnClickListener {
            setSelectionOption()
        }
    }

    private fun setSelectionOption() {
        val binding: SelectRoomLayoutBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.select_room_layout, null, false)
        binding?.svm = viewModel
        var selectRoomDialog = Dialog(this, R.style.DialogTheme)
        selectRoomDialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        selectRoomDialog?.setContentView(binding.getRoot())
        selectRoomDialog?.window!!.setGravity(Gravity.BOTTOM)
        selectRoomDialog?.window!!.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        binding.txHeader.setText(getString(R.string.select_option))
        binding.txPublic.setText(getString(R.string.edit_room))
        binding.txPrivate.setText(getString(R.string.delete_room))

        binding.imgCancel.setOnClickListener {
            selectRoomDialog.dismiss()
        }
        binding.txPrivate.setOnClickListener {
            AlertDialog.Builder(context)
                .setTitle(getString(R.string.delete_room))
                .setMessage(getString(R.string.are_you_sure_to_delete_this_room)) // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(android.R.string.yes,
                    { dialog, which ->
                        dialog.dismiss()
                        viewModel.getDeleteRoom(getData(SessionManager.AUTHENTICATION)!!,room_id)
                    })
                .setNegativeButton(android.R.string.no,
                    { dialog, which ->
                       dialog.dismiss()
                    })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show()
        }
        binding.txPublic.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("key", "Private")
            bundle.putString("room_id",room_id)
            navigateActivity(CreateEventActivity(),bundle)
            selectRoomDialog.dismiss()
        }
        selectRoomDialog?.window!!.setBackgroundDrawableResource(R.color.black)
        selectRoomDialog.show()
    }

    override fun onItemClick(view: View?, position: Int) {
        if(view?.id== R.id.clUserList) {
            val bundle = Bundle()
            bundle.putString("user_id", userList[position]._id)
            navigateActivity(ViewUserProfileActivity(),bundle)
        }
    }

    override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {

    }

    override fun itemAction(type: String?, position: Int) {

    }
}