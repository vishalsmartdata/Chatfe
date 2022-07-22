package com.sdei.chafte.ui.home.message.profile_preview

import android.app.Application
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.*
import com.sdei.chafte.pojoclasses.*
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import com.sdei.chafte.utils.socket.SocketManager
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class ProfilePreviewVM(application: Application,socketManager: SocketManager) : BaseVM(application) {
    val progressObservable = ObservableField<Boolean>()
    var userProfileReponse: MutableLiveData<RecentConnectData>? = null
    var sendRequestResponse: MutableLiveData<String>? = null
    var app: Application? = null
    var socketMng: SocketManager? = null

    var requestResponse: MutableLiveData<String>? = null
    var blockResponse: MutableLiveData<String>? = null
    var unFriendResponse: MutableLiveData<String>? = null

    val messageObservable = ObservableField<String>()
    var callSendMessage=false
    var chatHeadID=""
    var receiver_id=""
    var sender_id=""


    var callgetChatHeaderId=false

    init {
        app = application
        progressObservable.set(true)
        socketMng = socketManager
    }

    fun observerUnfriendResponse(): MutableLiveData<String>? {
        unFriendResponse = null
        unFriendResponse = MutableLiveData()
        return unFriendResponse
    }

    fun observerRequestResponse(): MutableLiveData<String>? {
        requestResponse = null
        requestResponse = MutableLiveData()
        return requestResponse
    }

    fun observerBlockResponse(): MutableLiveData<String>? {
        blockResponse = null
        blockResponse = MutableLiveData()
        return blockResponse
    }

    fun observerFriendRequestResponse(): MutableLiveData<String>? {
        sendRequestResponse = null
        sendRequestResponse = MutableLiveData()
        return sendRequestResponse
    }

    fun observerUserProfileResponse(): MutableLiveData<RecentConnectData>? {
        userProfileReponse = null
        userProfileReponse = MutableLiveData()
        return userProfileReponse
    }

    fun getProfile(authentication: String?, user_id: String, recent_user_id: String) {
        progressObserver?.value = true
        var pojo= RecentUserProfile(recent_user_id,user_id)
        NetworkAdapter.getInstance().getNetworkServices()?.getRecentUserProfile(authentication,pojo)?.enqueue(object :
            Callback<RecentSuggestionModel> {
            override fun onFailure(call: Call<RecentSuggestionModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<RecentSuggestionModel>,
                response: Response<RecentSuggestionModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                userProfileReponse?.value = response.body()!!.data
                            } else {
                                errorResponse?.value =
                                    app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun getSendRequest(authentication: String?, user_id: String,own_id: String) {
        progressObserver?.value = true
        var pojo= SendFriendRequestPojo(user_id,own_id!!)
        NetworkAdapter.getInstance().getNetworkServices()?.getSendRequest(authentication,pojo)?.enqueue(object :
            Callback<ShowDataAndMessageModel> {
            override fun onFailure(call: Call<ShowDataAndMessageModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<ShowDataAndMessageModel>,
                response: Response<ShowDataAndMessageModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                sendRequestResponse?.value = response.body()!!.data
                            } else {
                                errorResponse?.value =
                                    app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun getBlockUser(authentication: String?,user_id: String) {

        progressObserver?.value = true
        var detailPojo= UserBlockPojo(user_id!!)
        NetworkAdapter.getInstance().getNetworkServices()?.getBlockUser(authentication,detailPojo)
            ?.enqueue(object :
                Callback<SendOtpResponse> {
                override fun onFailure(call: Call<SendOtpResponse>, t: Throwable) {
                    progressObserver?.value = false
                    errorResponse?.value = t.message
                }

                override fun onResponse(call: Call<SendOtpResponse>, response: Response<SendOtpResponse>) {
                    when (response.code()) {
                        200 -> {
                            progressObserver?.value = false
                            response.body()?.let {
                                if (it.code.equals(200)) {
                                    //if (response.body()?.data?.size!! > 0)
                                    blockResponse?.value = response.body()!!.data
                                } else {
                                    errorResponse?.value = app?.baseContext?.getString(R.string.data_not_found)
                                }
                            }
                        }
                        else -> {
                            progressObserver?.value = false
                            try {
                                val jObjError = JSONObject(response.errorBody()!!.string())
                                errorResponse?.value = jObjError.getString("message")
                            } catch (e: Exception) {
                                Toast.makeText(app?.baseContext, e.message, Toast.LENGTH_LONG).show()
                            }
                        }
                    }
                }
            })
    }

    fun getRejectRequest(authentication: String?, user_id: String,own_id: String) {
        progressObserver?.value = true
        var detail= AcceptRejectPojo("",own_id,user_id)
        NetworkAdapter.getInstance().getNetworkServices()?.getRejectRequest(authentication,detail)?.enqueue(object :
            Callback<SendOtpResponse> {
            override fun onFailure(call: Call<SendOtpResponse>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<SendOtpResponse>,
                response: Response<SendOtpResponse>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                requestResponse?.value = response.body()!!.data
                            } else {
                                errorResponse?.value =
                                    app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun getAcceptRequest(authentication: String?, user_id: String,own_id: String) {
        progressObserver?.value = true
        var detail= AcceptRejectPojo("",own_id,user_id)
        NetworkAdapter.getInstance().getNetworkServices()?.getAcceptRequest(authentication,detail)?.enqueue(object :
            Callback<SendOtpResponse> {
            override fun onFailure(call: Call<SendOtpResponse>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<SendOtpResponse>,
                response: Response<SendOtpResponse>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                requestResponse?.value = response.body()!!.data
                            } else {
                                errorResponse?.value =
                                    app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun getUnFriendRequest(authentication: String?, user_id: String,own_id: String) {
        progressObserver?.value = true
        var pojo= UnfriendPojo(user_id,own_id!!)
        NetworkAdapter.getInstance().getNetworkServices()?.getUnfriend(authentication,pojo)?.enqueue(object :
            Callback<ShowDataAndMessageModel> {
            override fun onFailure(call: Call<ShowDataAndMessageModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<ShowDataAndMessageModel>,
                response: Response<ShowDataAndMessageModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                unFriendResponse?.value = response.body()!!.message
                            } else {
                                errorResponse?.value =
                                    app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun getChatHeadsId() {
        callgetChatHeaderId=true
        val jsonObject = JSONObject()
        try {
            jsonObject.put("senderId", sender_id)
            jsonObject.put("receiverId", receiver_id)
            socketMng?.emitKeyValue("createChatHead", jsonObject)
        } catch (e: JSONException) {
            e.printStackTrace()
        }

    }

    fun sendMessage(){
        var message = ""
        messageObservable.get()?.let {
            message = it
        }
        if (message.isNotEmpty()) {
            callSendMessage = true
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
