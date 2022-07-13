package com.sdei.chafte.ui.home.message.chat

import android.app.Application
import android.util.Log
import androidx.databinding.ObservableField
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import com.sdei.chafte.model.RecentSuggestion
import com.sdei.chafte.utils.base.BaseVM
import com.sdei.chafte.utils.socket.MessageEvent
import com.sdei.chafte.utils.socket.SocketManager
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.json.JSONException
import org.json.JSONObject

class ChatVm(application: Application,socketManager: SocketManager) : BaseVM(application) {
    val progressObservable = ObservableField<Boolean>()
    var socketMng: SocketManager? = null
    var app: Application? = null
    val messageObservable = ObservableField<String>()
    var chatHeadID=""
    var receiver_id=""
    var sender_id=""
    var callSendMessage=false

    init {
        app = application
        socketMng = socketManager
        progressObservable.set(true)
    }

    fun getChatHeadsId(senderId:String,receiverId:String) {

        val jsonObject = JSONObject()
        try {
            jsonObject.put("senderId", senderId)
            jsonObject.put("receiverId", receiverId)
            socketMng?.emitKeyValue("createChatHead", jsonObject)
        } catch (e: JSONException) {
            e.printStackTrace()
        }

    }

    fun getMessage() {

        val jsonObject = JSONObject()
        try {
            jsonObject.put("chatHeadId", chatHeadID)
            socketMng?.emitKeyValue("getMessage", jsonObject)
        } catch (e: JSONException) {
            e.printStackTrace()
        }

    }

    fun sendMessage() {
        var message = ""
        messageObservable.get()?.let {
            message = it
        }

        if(message.isNotEmpty()) {
            callSendMessage=true
            messageObservable.set("")
            val jsonObject = JSONObject()
            try {
                jsonObject.put("senderId", sender_id)
                jsonObject.put("chatHeadId", chatHeadID)
                jsonObject.put("message", message)
                jsonObject.put("messageType", "message")
                jsonObject.put("receiverId", receiver_id)
                socketMng?.emitKeyValue("sendMessage", jsonObject)
            } catch (e: JSONException) {
                e.printStackTrace()
            }
        }
    }




}
