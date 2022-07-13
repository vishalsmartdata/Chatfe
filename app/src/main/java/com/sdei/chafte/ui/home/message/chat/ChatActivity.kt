package com.sdei.chafte.ui.home.message.chat

import android.content.Context
import android.util.Log
import android.view.View
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityChatBinding
import com.sdei.chafte.databinding.ActivitySettingBinding
import com.sdei.chafte.model.ReceiveMessageModelItem
import com.sdei.chafte.model.RecentSuggestion
import com.sdei.chafte.ui.home.setting.SettingFragment
import com.sdei.chafte.ui.home.setting.SettingVm
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.chafte.utils.socket.MessageEvent
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.json.JSONArray
import org.json.JSONObject

class ChatActivity : BaseActivity<ActivityChatBinding, ChatVm>(), RecyclerCallback {
    override val binding: ActivityChatBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_chat
    override var viewModel: ChatVm
        get() = setUpVM(this, ChatVm(application,initialSocket()))
        set(value) {}
    override val context: Context
        get() = this

    val receiverMessageModelItem = ArrayList<ReceiveMessageModelItem>()
    private val bindList = RecyclerBindingList<ReceiveMessageModelItem>()

    var callgetAllMessage=false
    var callgetChatHeaderId=false


    override fun bindData() {
        binding.cvm = viewModel
        binding.title.setText(getIntent().getStringExtra("user_name")!!)
        viewModel.receiver_id=  getIntent().getStringExtra("userId")!!
        viewModel.chatHeadID=  getIntent().getStringExtra("chatheadId")!!
        viewModel.sender_id= getData(SessionManager.USER_ID)!!
        if(viewModel.chatHeadID.equals("")){
            callgetChatHeaderId=true
            viewModel.getChatHeadsId(getData(SessionManager.USER_ID)!!,viewModel.receiver_id)
        }else{
            callgetAllMessage=true
            viewModel.getMessage()
        }
    }

    override fun initListeners() {
        EventBus.getDefault().register(this)

        binding.imageBack.setOnClickListener {
            finish()
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onMessageEvent(event: MessageEvent) {
        if (event.type.equals("getChatHeadId")) {
            try {
                if (callgetChatHeaderId){
                    callgetChatHeaderId = false
                var jsonObject = JSONObject(event.message)
                viewModel.chatHeadID = jsonObject.getString("_id")
                callgetAllMessage = true
                viewModel.getMessage()
            }
            } catch (ex: Exception) {
                Log.v("TEST", "Exception1: " + ex.message)
            }
        }
        else if (event.type.equals("getMessage")) {
            try {
                if(callgetAllMessage) {
                    callgetAllMessage = false
                    val receiverMessageMode = ArrayList<ReceiveMessageModelItem>()
                    var jsonArray = JSONArray(event.message)
                    if (jsonArray != null) {
                        val mapper = ObjectMapper().registerModule(KotlinModule())
                        try {
                            val message: ArrayList<ReceiveMessageModelItem> =
                                mapper.readValue(jsonArray.toString())
                            println("The message are:\n $message")
                            receiverMessageMode.addAll(message)
                        } catch (e: java.lang.Exception) {
                            e.printStackTrace()
                        }

                        for (item in receiverMessageMode) {
                            var messageData: ReceiveMessageModelItem = item
                            messageData._me = sessionManager.getvalue(SessionManager.USER_ID)!!
                            receiverMessageModelItem.add(messageData)
                        }

                        bindList.itemsList = receiverMessageModelItem
                        binding?.list = bindList
                        binding?.click = this
                        Log.e("receiverMessageModelItem", "total " + receiverMessageModelItem.size)
                    }
                }
            } catch (ex: Exception) {
                Log.v("TEST", "Exception1: " + ex.message)
            }
        }
        else if (event.type.equals("receiveMessage")) {
            try {
                if(viewModel.callSendMessage) {
                    viewModel.callSendMessage = false
                    var jsonObject = JSONObject(event.message)
                    var messageData= ReceiveMessageModelItem(jsonObject.getString("__v").toInt(),jsonObject.getString("_id"),
                            jsonObject.getString("chatHeadId"),jsonObject.getString("createdAt"),jsonObject.getString("message"),
                        jsonObject.getString("messageType"), jsonObject.getString("receiverId"),jsonObject.getString("senderId"),
                        jsonObject.getString("status"), jsonObject.getString("updatedAt"),sessionManager.getvalue(SessionManager.USER_ID)!!)

                    receiverMessageModelItem.add(messageData)
                    bindList.notifyDataChange()
                }
            } catch (ex: Exception) {
                Log.v("TEST", "Exception1: " + ex.message)
            }
        }

}

    override fun onItemClick(view: View?, position: Int) {

    }

    override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {

    }

    override fun itemAction(type: String?, position: Int) {

    }
}
