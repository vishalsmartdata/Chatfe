package com.sdei.chafte.utils.socket

import android.app.Activity
import android.content.Context
import android.util.Log
import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket


import org.greenrobot.eventbus.EventBus
import org.json.JSONArray
import org.json.JSONException

import org.json.JSONObject
import java.net.URISyntaxException

 class SocketManager(var user_id: String?) {
     var mSocket: Socket? = null
    fun connectUser() {
        if (!mSocket!!.connected()){
            mSocket!!.connect()
            mSocket!!.on(
                Socket.EVENT_CONNECT
            ) {
                Log.e("CONNECTWithSocket", "CONNECT")
            }
                .on(
                "join"
            ) { args ->
                val obj = args[0] as JSONObject
                Log.e("join", obj.toString())
            }
            val jsonObject = JSONObject()
            try {
                jsonObject.put("userId", user_id)
               // emitKeyValue("join", jsonObject)
                mSocket!!.emit("join", jsonObject)
            } catch (e: JSONException) {
                e.printStackTrace()
            }
            Log.e("join_event", user_id+"")

        }
        manageEvents()
    }

    fun manageEvents() {

            mSocket!!.on("isConnected") { args ->
                val obj = args[0] as JSONObject
                Log.e("isConnected", obj.toString() + "")
            }.once("getAllChatHeads") { args ->
                val obj = args[0] as JSONObject
                Log.e("getAllChatHeads", obj.toString() + "")
                EventBus.getDefault().post(MessageEvent(obj.toString(), "getAllChatHeads"))
            }.once("getMessage") { args ->
                val obj = args[0]  as JSONArray
                Log.e("getMessage", obj.toString() + "")
                EventBus.getDefault().post(MessageEvent(obj.toString(), "getMessage"))
            }.once("getChatHeadId") { args ->
                Log.e("getChatHeadId", args.toString() + "")
                val obj = args[0]  as JSONObject
                Log.e("getChatHeadId", obj.toString() + "")
                EventBus.getDefault().post(MessageEvent(obj.toString(), "getChatHeadId"))
            }.on("receiveMessage") { args ->
                val obj = args[0]  as JSONObject
                Log.e("receiveMessage", obj.toString() + "")
                EventBus.getDefault().post(MessageEvent(obj.toString(), "receiveMessage"))
            }.on("typingStatus"){ args ->
                val obj = args[0]  as JSONObject
                Log.e("typingStatus", obj.toString() + "")
                EventBus.getDefault().post(MessageEvent(obj.toString(), "typingStatus"))
            }.on("workingStatus"){ args ->
                val obj = args[0]  as JSONObject
                Log.e("workingStatus", obj.toString() + "")
                EventBus.getDefault().post(MessageEvent(obj.toString(), "workingStatus"))
            }
    }

    fun emitKeyValue(key: String?, jsonObject: JSONObject?) {
        if (!mSocket!!.connected()) {
            connectUser()
            mSocket!!.emit(key, jsonObject)
        } else {
            mSocket!!.emit(key, jsonObject)
        }
    }

    fun disconnect() {
        if (mSocket!!.connected()) {
            mSocket!!.disconnect()
                .off(
                    Socket.EVENT_DISCONNECT
                ) { Log.e("DISCONNECT", "DISCONNECT") }
        }
    }

    init {
        try {
            mSocket = IO.socket("http://54.190.192.105:6172")
        } catch (e: URISyntaxException) {
            e.printStackTrace()
        }

        connectUser()
    }
}