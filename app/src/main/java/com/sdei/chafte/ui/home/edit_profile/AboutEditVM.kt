package com.sdei.chafte.ui.home.edit_profile

import android.app.Application
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.EditProfileModel
import com.sdei.chafte.model.SendOtpResponse
import com.sdei.chafte.pojoclasses.*
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class AboutEditVM (application: Application,authentication: String?) : BaseVM(application) {
    val notListedObservers = ObservableField<String>()
    val howeTownObserver = ObservableField<String>()
    val genderObservers = ObservableField<String>()
    var interestedDatingObserver = ObservableField<String>()
    var registrationReponse: MutableLiveData<String>? = null
    var authentication_token=""

    var app: Application? = null

    init {
        app = application
        authentication_token=authentication!!
    }

    fun observerRegistrationResponse(): MutableLiveData<String>? {
        registrationReponse = null
        registrationReponse = MutableLiveData()
        return registrationReponse
    }

    fun getUpdateProfile() {
        var hometown=""
        var gender=""
        var interested=""
        howeTownObserver.get()?.let {
            hometown = it
        }
        genderObservers.get()?.let {
            gender = it
        }
        interestedDatingObserver.get()?.let {
            interested = it
        }

         var dating= UpdateDating(interested)
         var gender_pojo= updateGender(gender)
         var hometown_pojo= UpdateHometown(hometown)
        var registrationPojo = AboutUpdatePojo(
            gender_pojo,
            hometown_pojo,
            dating
        )
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getAboutUpdateProfile(authentication_token,registrationPojo)
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
}