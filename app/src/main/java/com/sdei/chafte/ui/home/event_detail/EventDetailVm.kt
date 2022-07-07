package com.sdei.chafte.ui.home.event_detail

import android.app.Application
import android.widget.Toast
import androidx.databinding.ObservableField
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

class EventDetailVm (application: Application) : BaseVM(application) {
    val progressObservable = ObservableField<Boolean>()
    var eventDetailReponse: MutableLiveData<EventDetailData>? = null
    var myeventDetailReponse: MutableLiveData<MyEventDetailData>? = null
    var addRoomResponse: MutableLiveData<JoinData>? = null
    var app: Application? = null
    var cancelRoomResponse: MutableLiveData<String>? = null
    var deleteRoomResponse: MutableLiveData<String>? = null

    init {
        app = application
        progressObservable.set(true)
    }

    fun observerCancelRoomResponse(): MutableLiveData<String>? {
        cancelRoomResponse = null
        cancelRoomResponse = MutableLiveData()
        return cancelRoomResponse
    }
    fun observerDeleteRoomResponse(): MutableLiveData<String>? {
        deleteRoomResponse = null
        deleteRoomResponse = MutableLiveData()
        return deleteRoomResponse
    }

    fun observerAddRoomResponse(): MutableLiveData<JoinData>? {
        addRoomResponse = null
        addRoomResponse = MutableLiveData()
        return addRoomResponse
    }

    fun observerEventDetailResponse(): MutableLiveData<EventDetailData>? {
        eventDetailReponse = null
        eventDetailReponse = MutableLiveData()
        return eventDetailReponse
    }

    fun observerMyEventDetailResponse(): MutableLiveData<MyEventDetailData>? {
        myeventDetailReponse = null
        myeventDetailReponse = MutableLiveData()
        return myeventDetailReponse
    }

    fun getRoomDetails(authe:String,room_id: String?) {
        progressObserver?.value = true
        var detailPojo= DetailPojo(room_id!!)
        NetworkAdapter.getInstance().getNetworkServices()?.getRoomDetails(authe,detailPojo)?.enqueue(object :
            Callback<DetailEventModel> {
            override fun onFailure(call: Call<DetailEventModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<DetailEventModel>,
                response: Response<DetailEventModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                eventDetailReponse?.value = response.body()!!.data
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

    fun getDeleteRoom(authe:String,room_id: String?) {
        progressObserver?.value = true
        var detailPojo= DetailPojo(room_id!!)
        NetworkAdapter.getInstance().getNetworkServices()?.getDeleteRoom(authe,detailPojo)?.enqueue(object :
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
                                deleteRoomResponse?.value = response.body()!!.data
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

    fun getMyRoomDetails(authe:String,room_id: String?) {
        progressObserver?.value = true
        var detailPojo= DetailPojo(room_id!!)
        NetworkAdapter.getInstance().getNetworkServices()?.getMyRoomDetails(authe,detailPojo)?.enqueue(object :
            Callback<MyEventDetailModel> {
            override fun onFailure(call: Call<MyEventDetailModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<MyEventDetailModel>,
                response: Response<MyEventDetailModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                myeventDetailReponse?.value = response.body()!!.data
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
        var filterPojo= JoinRoomPojo(room_id,user_id!!)
        NetworkAdapter.getInstance().getNetworkServices()?.getJoinRoom(header,filterPojo)?.enqueue(object :
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

    fun getCancelRoom(header: String?, user_id: String?, room_id: String) {
        progressObserver?.value = true
        var filterPojo= DetailPojo(room_id)
        NetworkAdapter.getInstance().getNetworkServices()?.getCancelRoom(header,filterPojo)?.enqueue(object :
            Callback<EditProfileModel> {
            override fun onFailure(call: Call<EditProfileModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<EditProfileModel>,
                response: Response<EditProfileModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                cancelRoomResponse?.value = response.body()!!.data
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

}