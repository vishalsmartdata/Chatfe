package com.sdei.chafte.ui.home.message.profile_preview

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.PopupMenu
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityProfileForIndivitualChatBinding
import com.sdei.chafte.databinding.SelectFriendsLayoutBinding
import com.sdei.chafte.ui.home.message.chat.ChatActivity
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.getDateWithServerTimeStamp
import com.sdei.chafte.utils.socket.MessageEvent
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import com.squareup.picasso.Picasso
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.json.JSONObject

class ProfileForIndivitualChatActivity : BaseActivity<ActivityProfileForIndivitualChatBinding, ProfilePreviewVM>() {
    override val binding: ActivityProfileForIndivitualChatBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_profile_for_indivitual_chat
    override var viewModel: ProfilePreviewVM
        get() = setUpVM(this, ProfilePreviewVM(application,initialSocket()))
        set(value) {}
    override val context: Context
        get() = this

    var recentUserId=""
    var requestStatus=""
    var user_name=""
    var user_image=""


    override fun bindData() {
        binding.ppVM=viewModel
        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })
        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    showProgress()
                false ->   hideProgress()
            }
        })

        viewModel.observerUnfriendResponse()?.observe (this, Observer {
            showSnackBar(binding.root, it.toString(), false)
            viewModel.getProfile(getData(SessionManager.AUTHENTICATION), getData(SessionManager.USER_ID)!!, recentUserId)
        })

        viewModel.observerRequestResponse()?.observe(this,{
            showSnackBar(binding.root, it, false)
            viewModel.getProfile(getData(SessionManager.AUTHENTICATION), getData(SessionManager.USER_ID)!!, recentUserId)
        })

        viewModel.observerBlockResponse()?.observe(this,{
            showSnackBar(binding.root, it, false)
            finish()
        })

        viewModel.observerFriendRequestResponse()?.observe (this, Observer {
            showSnackBar(binding.root, it.toString(), false)
            viewModel.getProfile(getData(SessionManager.AUTHENTICATION), getData(SessionManager.USER_ID)!!, recentUserId)
        })

        viewModel.observerUserProfileResponse()?.observe (this, Observer {
            Picasso.get()
                .load(it.profileImg)
                .error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.imProfile)

            user_name=it.fname+" "+it.lname
            user_image=it.profileImg

            requestStatus=it.requestStatus
            binding.title.setText(it.fname+" "+it.lname)
            binding.txName.setText(it.fname+" "+it.lname)
            binding.txHeading.setText(it.connectedAt)
            binding.txDate.setText(getDateWithServerTimeStamp(it.joinedDate))

        })

        recentUserId= getIntent().getStringExtra("recentUserId")!!
        viewModel.getProfile(getData(SessionManager.AUTHENTICATION), getData(SessionManager.USER_ID)!!, recentUserId)

        viewModel.receiver_id=recentUserId
        viewModel.sender_id=getData(SessionManager.USER_ID)!!

        binding.imgMoreOption.setOnClickListener {
            showPopup(binding.imgMoreOption)
        }
    }

    override fun initListeners() {
        EventBus.getDefault().register(this)
        binding.txAddFriend.setOnClickListener {
            if(requestStatus.equals("")) {
                viewModel.getSendRequest(
                    getData(SessionManager.AUTHENTICATION),
                    recentUserId,
                    getData(SessionManager.USER_ID)!!
                )
            }else if(requestStatus.equals("Confirmed")){
                setSelectionType(true)
            }
            else if(requestStatus.equals("PendingTOAccept")){
                setSelectionType(false)
            }
        }
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }

    fun showPopup(v : View){
        val popup = PopupMenu(this, v)
        val inflater: MenuInflater = popup.menuInflater
        inflater.inflate(R.menu.block_menu, popup.menu)
        popup.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId){
                 R.id.block-> {
                     viewModel.getBlockUser(getData(SessionManager.AUTHENTICATION),recentUserId)
                 }

            }
            true
        }
        popup.show()
    }

    private fun setSelectionType(type: Boolean) {
        val binding: SelectFriendsLayoutBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.select_friends_layout, null, false)
        binding?.svm = viewModel
        var selectRoomDialog = Dialog(this, R.style.DialogTheme)
        selectRoomDialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        selectRoomDialog?.setContentView(binding.getRoot())
        selectRoomDialog?.window!!.setGravity(Gravity.BOTTOM)
        selectRoomDialog?.window!!.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        if(type){
            binding.txPublic.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_unfriend, 0, 0, 0);
            binding.txPublic.setText(resources.getString(R.string.unfriend))
        }else{
            binding.txPublic.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_add_friend_white, 0, 0, 0);
            binding.txPublic.setText(resources.getString(R.string.accept_request))
            binding.txPrivate.setText(resources.getString(R.string.reject_request))
        }
        binding.imgCancel.setOnClickListener {
            selectRoomDialog.dismiss()
        }
        binding.txPrivate.setOnClickListener {
            selectRoomDialog.dismiss()
            if(!type){
                viewModel.getRejectRequest(getData(SessionManager.AUTHENTICATION),recentUserId,getData(SessionManager.USER_ID)!!)
            }else{
                viewModel.getBlockUser(getData(SessionManager.AUTHENTICATION),recentUserId)
            }
        }
        binding.txPublic.setOnClickListener {
            selectRoomDialog.dismiss()
            if(!type){
                viewModel.getAcceptRequest(getData(SessionManager.AUTHENTICATION),recentUserId,getData(SessionManager.USER_ID)!!)
            }else{
                viewModel.getUnFriendRequest(
                    getData(SessionManager.AUTHENTICATION),
                    recentUserId,
                    getData(SessionManager.USER_ID)!!
                )
            }
        }
        selectRoomDialog?.window!!.setBackgroundDrawableResource(R.color.black)
        selectRoomDialog.show()
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onMessageEvent(event: MessageEvent) {
        if (event.type.equals("getChatHeadId")) {

            try {
                if (viewModel.callgetChatHeaderId) {
                    viewModel.callgetChatHeaderId = false
                    var jsonObject = JSONObject(event.message)
                    viewModel.chatHeadID = jsonObject.getString("_id")
                    viewModel.sendMessage()
                }
            } catch (ex: Exception) {
                Log.v("TEST", "Exception1: " + ex.message)
            }
        }
        else if (event.type.equals("receiveMessage")) {
            if(viewModel.callSendMessage) {
                viewModel.callSendMessage=false
                finish()
                val bundle = Bundle()
                bundle.putString("userId", recentUserId)
                bundle.putString("chatheadId", viewModel.chatHeadID)
                bundle.putString("user_name", user_name)
                bundle.putString("user_image", user_image)
                navigateActivity(ChatActivity(), bundle)
            }
        }

    }
}