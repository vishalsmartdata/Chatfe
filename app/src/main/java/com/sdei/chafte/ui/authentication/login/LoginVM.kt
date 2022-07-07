package com.sdei.chafte.ui.authentication.login

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.*
import com.sdei.chafte.pojoclasses.GmailLoginPojo
import com.sdei.chafte.pojoclasses.LoginPojo
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

/**
 * Created by Vishal Sharma on 2019-12-06.
 */
class LoginVM(application: Application) : BaseVM(application) {
    val usernameObservable = ObservableField<String>()
    val passwordObservable = ObservableField<String>()
    val progressObservable = ObservableField<Boolean>()
    var loginReponse: MutableLiveData<LoginData>? = null
    var gmailLoginReponse: MutableLiveData<GmailData>? = null

    var app: Application? = null

    init {
        app = application
        progressObservable.set(true)
    }

    fun observerGmailLoginResponse(): MutableLiveData<GmailData>? {
        gmailLoginReponse = null
        gmailLoginReponse = MutableLiveData()
        return gmailLoginReponse
    }

    fun observerLoginResponse(): MutableLiveData<LoginData>? {
        loginReponse = null
        loginReponse = MutableLiveData()
        return loginReponse
    }

    fun observerProgress(): MutableLiveData<Boolean>? {
        progressObserver = null
        progressObserver = MutableLiveData()
        return progressObserver
    }

    fun doLoginProcess() {

        Log.e("doLoginProcess", "dfsakdjgfaksdjkfasd")
        var username = ""
        var password = ""
        usernameObservable.get()?.let {
            username = it
        }

        passwordObservable.get()?.let {
            password = it
        }

        when (username.isNotEmpty() && password.isNotEmpty()) {
            true -> {
                progressObserver?.value = true
                var loginPojo= LoginPojo(username,password)
                NetworkAdapter.getInstance().getNetworkServices()?.getLogin(loginPojo)
                    ?.enqueue(object :
                        Callback<LoginModel> {
                        override fun onFailure(call: Call<LoginModel>, t: Throwable) {
                            progressObserver?.value = false
                            errorResponse?.value = t.message
                        }

                        override fun onResponse(
                            call: Call<LoginModel>,
                            response: Response<LoginModel>
                        ) {
                            when (response.code()) {
                                200 -> {
                                    progressObserver?.value = false
                                    response.body()?.let {
                                        if (it.code.equals(200)) {
                                            //if (response.body()?.data?.size!! > 0)
                                            loginReponse?.value = response.body()!!.data
                                        } else {
                                            errorResponse?.value =
                                                app?.baseContext?.getString(R.string.data_not_found)
                                        }
                                    }
                                }
                                else -> {
                                    progressObserver?.value = false
                                    errorResponse?.value=response.body()?.message
                                }
                            }
                        }
                    })
            }
            else -> {
                when {
                    username.isEmpty() -> errorResponse?.value = app?.baseContext?.getString(R.string.user_name_field_not_empty)
                    password.isEmpty() -> errorResponse?.value = app?.baseContext?.getString(R.string.password_con_not_empty)
                }
            }
        }
    }

    fun doGmailLoginProcess(
        designation: String,
        googleEmail: String,
        googleFirstName: String,
        googleId: String,
        googleLastName: String,
        username: String,
        facebookId:String,
        profile:String,
        loginType:String
    ) {
                var profile= ProfileImg(profile,"All")
                var loginPojo= GmailLoginPojo(designation,googleEmail,googleFirstName,googleId,googleLastName,username,facebookId,profile,loginType)
                NetworkAdapter.getInstance().getNetworkServices()?.getGmailLogin(loginPojo)
                    ?.enqueue(object :
                        Callback<GmailLoginModel> {
                        override fun onFailure(call: Call<GmailLoginModel>, t: Throwable) {
                            progressObserver?.value = false
                            errorResponse?.value = t.message
                        }

                        override fun onResponse(
                            call: Call<GmailLoginModel>,
                            response: Response<GmailLoginModel>
                        ) {
                            when (response.code()) {
                                200 -> {
                                    progressObserver?.value = false
                                    response.body()?.let {
                                        if (it.code.equals(200)) {
                                            //if (response.body()?.data?.size!! > 0)
                                            gmailLoginReponse?.value = response.body()!!.data
                                        } else {
                                            errorResponse?.value =
                                                app?.baseContext?.getString(R.string.data_not_found)
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
        progressObserver?.value = true
    }

}

