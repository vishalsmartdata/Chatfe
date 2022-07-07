package com.sdei.chafte.ui.home.profile

import android.R.attr
import android.app.Application
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.*
import com.sdei.chafte.pojoclasses.*
import com.sdei.chafte.pojoclasses.Dating
import com.sdei.chafte.pojoclasses.Dob
import com.sdei.chafte.pojoclasses.Gender
import com.sdei.chafte.pojoclasses.Hometown
import com.sdei.chafte.pojoclasses.ProfileImg
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File
import java.lang.Exception
import android.R.attr.data




class ProfileVM (application: Application,authentication: String?) : BaseVM(application) {
    var authentication_token=""
    val firstNameObservable = ObservableField<String>()
    val lastNameObservable = ObservableField<String>()
    val aboutYourselfObservable = ObservableField<String>()
    var myProfileReponse: MutableLiveData<MyProfileData>? = null
    var drinkResponse: MutableLiveData<ArrayList<DrinkModel>>? = null
    var drinkObserver = ObservableField<String>()

    var mPhotoFile: File? = null
    var imageUploadResponse: MutableLiveData<ArrayList<String>>? = null
    var imagePath: String= ""
    var registrationReponse: MutableLiveData<String>? = null

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

    fun observerDrinkResponse(): MutableLiveData<ArrayList<DrinkModel>>? {
        drinkResponse = null
        drinkResponse = MutableLiveData()
        return drinkResponse
    }

    fun observerImageUploadResponse(): MutableLiveData<ArrayList<String>>? {
        imageUploadResponse = null
        imageUploadResponse = MutableLiveData()
        return imageUploadResponse
    }

    fun observerMyProfileResponse(): MutableLiveData<MyProfileData>? {
        myProfileReponse = null
        myProfileReponse = MutableLiveData()
        return myProfileReponse
    }

    fun getUpdateProfile() {
        var first_name=""
        var last_name=""
        var about_yourself=""

        firstNameObservable.get()?.let {
                val separated: List<String> = it.split(" ")
            if(separated.size>0)
                first_name= separated[0]
            if(separated.size>1)
                last_name= separated[1]

        }
        /*lastNameObservable.get()?.let {
            last_name = it
        }*/
        aboutYourselfObservable.get()?.let {
            about_yourself = it
        }

        var profileImg= UpdateProfileImg(imagePath)
        var registrationPojo = UpdateProfilePojo(
            first_name,
            last_name,
            about_yourself,
            profileImg,
        )
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getUpdateProfile(authentication_token,registrationPojo)
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
                        401 -> {
                            tokenExpireResponse?.value = "token is Expire"
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

    fun getUpdateDrink() {
        var drink_id=""
        drinkObserver.get()?.let {
            drink_id = it
        }

        var registrationPojo = UpdateDrinkPojo(
            drink_id
        )
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getUpdateDrink(authentication_token,registrationPojo)
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
                        401 -> {
                            tokenExpireResponse?.value = "token is Expire"
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

    fun getAllDrink() {
         progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getDrinkAll()?.enqueue(object :
            Callback<DrinkBaseModel> {
            override fun onFailure(call: Call<DrinkBaseModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<DrinkBaseModel>,
                response: Response<DrinkBaseModel>
            ) {
                when (response.code()) {
                    200 -> {
                         progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                drinkResponse?.value = response.body()!!.data
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
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun getProfile(authentication: String?) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getProfile(authentication)?.enqueue(object :
            Callback<MyProfileModel> {
            override fun onFailure(call: Call<MyProfileModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<MyProfileModel>,
                response: Response<MyProfileModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                myProfileReponse?.value = response.body()!!.data
                            } else {
                                errorResponse?.value = app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    401 -> {
                        tokenExpireResponse?.value = "token is Expire"
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun uploadImage() {
        progressObserver?.value = true
        if (mPhotoFile != null ) {
            if(mPhotoFile!!.exists()) {
                progressObserver?.value = true
                val fbody = RequestBody.create(MediaType.parse("multipart/form-data"), mPhotoFile)
                var image = MultipartBody.Part.createFormData("", mPhotoFile?.name, fbody)
                NetworkAdapter.getInstance().getNetworkServices()?.getUpload(image)
                    ?.enqueue(object :
                        Callback<ImageUploadModel> {
                        override fun onFailure(call: Call<ImageUploadModel>, t: Throwable) {
                            progressObserver?.value = false
                            errorResponse?.value = t.message
                        }

                        override fun onResponse(
                            call: Call<ImageUploadModel>,
                            response: Response<ImageUploadModel>
                        ) {
                            when (response.code()) {
                                200 -> {
                                    progressObserver?.value = false
                                    response.body()?.let {
                                        imageUploadResponse?.value = response.body()!!.files
                                        /*if (it.code.equals(200)) {
                                        //if (response.body()?.data?.size!! > 0)
                                        //drinkResponse?.value = response.body()!!.data
                                    } else {
                                        errorResponse?.value =
                                            app?.baseContext?.getString(R.string.data_not_found)
                                    }*/
                                    }
                                }
                                401 -> {
                                    tokenExpireResponse?.value = "token is Expire"
                                }
                                else -> {
                                    progressObserver?.value = false
                                    errorResponse?.value = response.message()
                                }
                            }
                        }
                    })
            }else{
                errorResponse?.value= app?.baseContext?.getString(R.string.Please_select_profile_image)
            }
        }
        else{
            errorResponse?.value= app?.baseContext?.getString(R.string.Please_select_profile_image)
        }
    }

}