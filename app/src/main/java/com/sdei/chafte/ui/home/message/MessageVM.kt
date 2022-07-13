package com.sdei.chafte.ui.home.message

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.utils.base.BaseVM
import com.sdei.chafte.utils.socket.SocketManager
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import org.json.JSONException
import org.json.JSONObject

class MessageVM(application: Application,socketManager: SocketManager) : BaseVM(application) {
    val progressObservable = ObservableField<Boolean>()
    var socketMng: SocketManager? = null
    var app: Application? = null

    init {
        app = application
        socketMng = socketManager
        progressObservable.set(true)
    }

    fun getAllChatHeads(userid:String) {

            val jsonObject = JSONObject()
            try {
                jsonObject.put("userId", userid)
                socketMng?.emitKeyValue("getAllChatHeads", jsonObject)
            } catch (e: JSONException) {
                e.printStackTrace()
            }

    }
}