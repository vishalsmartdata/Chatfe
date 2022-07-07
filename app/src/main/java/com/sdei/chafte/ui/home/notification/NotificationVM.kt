package com.sdei.chafte.ui.home.notification

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.*

import com.sdei.chafte.pojoclasses.DetailPojo
import com.sdei.chafte.pojoclasses.JoinRoomPojo
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class NotificationVM(application: Application) : BaseVM(application) {
    var userFriendRequest: MutableLiveData<NotificationData>? = null
    var requestResponse: MutableLiveData<String>? = null
    var app: Application? = null
    var addRoomResponse: MutableLiveData<JoinData>? = null

    init {
        app = application
    }

    fun observerAddRoomResponse(): MutableLiveData<JoinData>? {
        addRoomResponse = null
        addRoomResponse = MutableLiveData()
        return addRoomResponse
    }

    fun observerRequestResponse(): MutableLiveData<String>? {
        requestResponse = null
        requestResponse = MutableLiveData()
        return requestResponse
    }
    fun observerUserRequestResponse(): MutableLiveData<NotificationData>? {
        userFriendRequest = null
        userFriendRequest = MutableLiveData()
        return userFriendRequest
    }

    fun getUserRequets(authentication: String?) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getUserNotification(authentication)?.enqueue(object :
            Callback<NotificationModel> {
            override fun onFailure(call: Call<NotificationModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<NotificationModel>,
                response: Response<NotificationModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                userFriendRequest?.value = response.body()!!.data
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

    fun getAcceptRequest(authentication: String?, _id: String) {
        progressObserver?.value = true
        var detail= DetailPojo(_id)
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

    fun getRejectRequest(authentication: String?, _id: String) {
        progressObserver?.value = true
        var detail= DetailPojo(_id)
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

    fun getAddRoom(header: String?, user_id: String?, room_id: String) {
        progressObserver?.value = true
        var filterPojo = JoinRoomPojo(room_id, user_id!!)
        NetworkAdapter.getInstance().getNetworkServices()?.getJoinRoom(header, filterPojo)
            ?.enqueue(object :
                Callback<JoinRoomResponse> {
                override fun onFailure(call: Call<JoinRoomResponse>, t: Throwable) {
                    progressObserver?.value = false
                    errorResponse?.value = t.message
                }

                override fun onResponse(
                    call: Call<JoinRoomResponse>,
                    response: Response<JoinRoomResponse>
                ) {
                    when (response.code()) {
                        200 -> {
                            progressObserver?.value = false
                            response.body()?.let {
                                if (it.code.equals(200)) {
                                    //if (response.body()?.data?.size!! > 0)
                                    addRoomResponse?.value = response.body()!!.data
                                } else {
                                    errorResponse?.value =
                                        app?.baseContext?.getString(R.string.data_not_found)
                                }
                            }
                        }
                        401 -> {
                            tokenExpireResponse?.value = "token is Expire"
                        }
                        else -> {
                            progressObserver?.value = false
                            try {
                                val jObjError = JSONObject(response.errorBody()!!.string())
                                errorResponse?.value = jObjError.getString("message")
                            } catch (e: Exception) {
                                Toast.makeText(app?.baseContext, e.message, Toast.LENGTH_LONG)
                                    .show()
                            }
                        }
                    }
                }
            })

    }
}