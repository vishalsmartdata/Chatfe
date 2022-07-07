package com.sdei.chafte.utils.socket

import android.app.Activity
import android.content.Context
import android.util.Log
import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket
import org.greenrobot.eventbus.EventBus

import org.json.JSONObject
import java.net.URISyntaxException

class SocketManager(var user_id: String?) {
    var mSocket: Socket? = null
    fun connectUser() {
        if (!mSocket!!.connected()){
            mSocket!!.connect()
            mSocket!!.on(
                Socket.EVENT_CONNECT
            ) { Log.e("CONNECT", "CONNECT") }.on(
                "join"
            ) { args ->
                val obj = args[0] as JSONObject
                Log.e("join", obj.toString())
            }
            mSocket!!.emit("join", user_id)
        }
        manageEvents()
    }

    fun manageEvents() {

            mSocket!!.on("isConnected") { args ->
                val obj = args[0] as JSONObject
                Log.e("isConnected", obj.toString() + "")
            }.on("rideRequestStatus") { args ->
                val obj = args[0] as JSONObject
                Log.e("rideRequestStatus", obj.toString() + "")
                EventBus.getDefault().post(MessageEvent(obj.toString(), "AcceptandReject"))
            }.on("driverStatus") { args ->
                val obj = args[0] as String
                Log.e("driverStatus", obj.toString() + "")
            }.on("getMessage") { args ->
                val obj = args[0]  as JSONObject
                Log.e("getMessage", obj.toString() + "")
                EventBus.getDefault().post(MessageEvent(obj.toString(), "getMessage"))
            }.on("driverCurrentLocation") { args ->
                Log.e("driverCurrentLocation", args.toString() + "")
                val obj = args[0]  as JSONObject
                Log.e("CurrentLocationRiderSide", obj.toString() + "")
                EventBus.getDefault().post(MessageEvent(obj.toString(), "driverCurrentLocation"))
            }.on("tripstatus") { args ->
                val obj = args[0]  as JSONObject
                Log.e("tripstatus_newTest", obj.toString() + "")
                EventBus.getDefault().post(MessageEvent(obj.toString(), "ridestatus"))
            }.on("Ongoingdata")

            { args ->
                val obj = args[0]  as JSONObject
                Log.e("Ongoingdata", obj.toString() + "")
                EventBus.getDefault().post(MessageEvent(obj.toString(), "Ongoingdata"))
            }.on("riderOngoingdata")
            { args ->
                val obj = args[0]  as JSONObject
                Log.e("riderOngoingdata", obj.toString() + "")
                EventBus.getDefault().post(MessageEvent(obj.toString(), "riderOngoingdata"))
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
            mSocket = IO.socket("http://54.190.192.105:6172?userId="+user_id)
        } catch (e: URISyntaxException) {
            e.printStackTrace()
        }
        connectUser()
    }
}