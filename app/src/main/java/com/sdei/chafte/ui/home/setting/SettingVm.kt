package com.sdei.chafte.ui.home.setting

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.*
import com.sdei.chafte.pojoclasses.*
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class SettingVm (application: Application,authentication: String?) : BaseVM(application) {

    var authentication_token=""
    var app: Application? = null
    var logoutResponse: MutableLiveData<String>? = null
    var sendRequestResponse: MutableLiveData<String>? = null
    var unFriendResponse: MutableLiveData<String>? = null
    var roomResponse: MutableLiveData<ArrayList<MyEventData>>? = null
    var userProfileReponse: MutableLiveData<UserProfileData>? = null
    var registrationReponse: MutableLiveData<String>? = null
    var accountVisibilityReponse: MutableLiveData<AccountVisibilityData>? = null

    init {
        app = application

        authentication_token=authentication!!
    }
    fun observerLogoutResponse(): MutableLiveData<String>? {
        logoutResponse = null
        logoutResponse = MutableLiveData()
        return logoutResponse
    }

    fun observerAccpuntVisibilityResponse(): MutableLiveData<AccountVisibilityData>? {
        accountVisibilityReponse = null
        accountVisibilityReponse = MutableLiveData()
        return accountVisibilityReponse
    }
    fun observerPrivacyResponse(): MutableLiveData<String>? {
        registrationReponse = null
        registrationReponse = MutableLiveData()
        return registrationReponse
    }

    fun observerUnfriendResponse(): MutableLiveData<String>? {
        unFriendResponse = null
        unFriendResponse = MutableLiveData()
        return unFriendResponse
    }

    fun observerFriendRequestResponse(): MutableLiveData<String>? {
        sendRequestResponse = null
        sendRequestResponse = MutableLiveData()
        return sendRequestResponse
    }

    fun observerUserProfileResponse(): MutableLiveData<UserProfileData>? {
        userProfileReponse = null
        userProfileReponse = MutableLiveData()
        return userProfileReponse
    }

    fun observerRoomResponse(): MutableLiveData<ArrayList<MyEventData>>? {
        roomResponse = null
        roomResponse = MutableLiveData()
        return roomResponse
    }

    fun doLogoutProcess() {
                progressObserver?.value = true
                NetworkAdapter.getInstance().getNetworkServices()?.getLogout(authentication_token)
                    ?.enqueue(object :
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
                                            logoutResponse?.value = response.body()!!.status
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

    fun addprivacyInfo(accountVisibilityBinding: AccountVisibilityPojo) {

        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getProfilePrivacy(authentication_token,accountVisibilityBinding)
            ?.enqueue(object :
                Callback<EditProfileModel> {
                override fun onFailure(call: Call<EditProfileModel>, t: Throwable) {
                    progressObserver?.value = false
                    errorResponse?.value = t.message
                }

                override fun onResponse(call: Call<EditProfileModel>, response: Response<EditProfileModel>) {
                    when (response.code()) {
                        200 -> {
                            progressObserver?.value = false
                            response.body()?.let {
                                if (it.code.equals(200)) {
                                    //if (response.body()?.data?.size!! > 0)
                                    registrationReponse?.value = response.body()!!.data
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

    fun getPrivacyInfo() {

        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getProfilePrivacy(authentication_token)
            ?.enqueue(object :
                Callback<AccountVisibilityModel> {
                override fun onFailure(call: Call<AccountVisibilityModel>, t: Throwable) {
                    progressObserver?.value = false
                    errorResponse?.value = t.message
                }

                override fun onResponse(call: Call<AccountVisibilityModel>, response: Response<AccountVisibilityModel>) {
                    when (response.code()) {
                        200 -> {
                            progressObserver?.value = false
                            response.body()?.let {
                                if (it.code.equals(200)) {
                                    //if (response.body()?.data?.size!! > 0)
                                    accountVisibilityReponse?.value = response.body()!!.data
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

    fun getMyEventRoom(authentication: String?,user_id: String?) {
        progressObserver?.value = true
        var filterPojo= MyEventPojo(user_id!!)
        NetworkAdapter.getInstance().getNetworkServices()?.getMyEventRoom(authentication,filterPojo)?.enqueue(object :
            Callback<MyEventModel> {
            override fun onFailure(call: Call<MyEventModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<MyEventModel>,
                response: Response<MyEventModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                roomResponse?.value = response.body()!!.data
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

    fun getProfile(authentication: String?, user_id: String) {
        progressObserver?.value = true
        var pojo= DetailPojo(user_id)
        NetworkAdapter.getInstance().getNetworkServices()?.getUserProfile(authentication,pojo)?.enqueue(object :
            Callback<UserProfileModel> {
            override fun onFailure(call: Call<UserProfileModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<UserProfileModel>,
                response: Response<UserProfileModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                userProfileReponse?.value = response.body()!!.data[0]
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

}