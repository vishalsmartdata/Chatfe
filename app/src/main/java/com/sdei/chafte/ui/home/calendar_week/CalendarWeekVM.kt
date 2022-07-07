package com.sdei.chafte.ui.home.calendar_week

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.JoinRoomData
import com.sdei.chafte.model.JoinedRoomModel
import com.sdei.chafte.model.MyProfileData
import com.sdei.chafte.model.MyProfileModel
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CalendarWeekVM (application: Application) : BaseVM(application) {
    val progressObservable = ObservableField<Boolean>()
    var joinRoomReponse: MutableLiveData<ArrayList<JoinRoomData>>? = null
    var app: Application? = null

    init {
        app = application
        progressObservable.set(true)
    }

    fun observerJoinRoomResponse(): MutableLiveData<ArrayList<JoinRoomData>>? {
        joinRoomReponse = null
        joinRoomReponse = MutableLiveData()
        return joinRoomReponse
    }

    fun getJoinRoom(authentication: String?) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getJoinRoom(authentication)?.enqueue(object :
            Callback<JoinedRoomModel> {
            override fun onFailure(call: Call<JoinedRoomModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<JoinedRoomModel>,
                response: Response<JoinedRoomModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                joinRoomReponse?.value = response.body()!!.data
                            } else {
                                errorResponse?.value =
                                    app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    401 -> {
                        tokenExpireResponse?.value= "token is Expire"
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

}