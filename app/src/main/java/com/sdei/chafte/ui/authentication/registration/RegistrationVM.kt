package com.sdei.chafte.ui.authentication.registration

import android.app.Application
import android.util.Patterns
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
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File
import android.widget.Toast

import retrofit2.adapter.rxjava2.Result.response

import org.json.JSONObject
import java.lang.Exception


class RegistrationVM(application: Application) : BaseVM(application) {

    var click_Button: MutableLiveData<Int>? = null
    var backbuttonClick: MutableLiveData<Int>? = null

    val usernameObserver = ObservableField<String>()
    val passwordObserver = ObservableField<String>()
    val confirmPasswordObserver = ObservableField<String>()
    val firstnameObserver = ObservableField<String>()
    val lastnameObserver = ObservableField<String>()
    val emailObserver = ObservableField<String>()
    val phoneNumberObserver = ObservableField<String>()
    val dateOfBirthObserver = ObservableField<String>()
    val genderObservers = ObservableField<String>()
    val notListedObservers = ObservableField<String>()
    val howeTownObserver = ObservableField<String>()
    val isVerifiedObserver = ObservableField<Boolean>()
    var drinkObserver = ObservableField<String>()
    var interestedDatingObserver = ObservableField<String>()

    var otpFirstObserver = ObservableField<String>()
    var otpSecondObserver = ObservableField<String>()
    var otpThirdObserver = ObservableField<String>()
    var otpFouthObserver = ObservableField<String>()
    var optionEmail = ObservableField<Boolean>()
    var optionPhonenumber = ObservableField<Boolean>()

    var mPhotoFile: File? = null
    var imagePath: String = ""

    var imageUploadResponse: MutableLiveData<ArrayList<String>>? = null
    var drinkResponse: MutableLiveData<ArrayList<DrinkModel>>? = null
    var registrationReponse: MutableLiveData<RegistrationReponseData>? = null
    var sendOtpResponse: MutableLiveData<String>? = null
    var VerifyOtpResponse: MutableLiveData<String>? = null
    var VerifyUsernameResponse: MutableLiveData<String>? = null
    var VerifyEmailNumberResponse: MutableLiveData<String>? = null

    val progressObservable = ObservableField<Boolean>()

    var username = ""
    var password = ""
    var confirmPassword = ""
    var firstName = ""
    var lastName = ""
    var email = ""
    var phoneName = ""
    var date_of_birth = ""
    var hometown = ""
    var drink_id = ""
    var gender = ""
    var not_listed = ""
    var interestedDating = ""
    var isVerified = false

    var birthDateVisiblity = ""
    var genderVisiblity = ""
    var datingVisibility = ""
    var homeTownVisibilty = ""

    var app: Application? = null

    init {
        app = application
        progressObservable.set(true)
        isVerifiedObserver.set(false)
        birthDateVisiblity = app!!.baseContext!!.getString(R.string.friend)
        genderVisiblity = app!!.baseContext!!.getString(R.string.friend)
        datingVisibility = app!!.baseContext!!.getString(R.string.friend)
        homeTownVisibilty = app!!.baseContext!!.getString(R.string.friend)
    }

    fun observerNextButtonResponse(): MutableLiveData<Int>? {
        click_Button = null
        click_Button = MutableLiveData()
        return click_Button
    }

    fun observerBackButtonClickResponse(): MutableLiveData<Int>? {
        backbuttonClick = null
        backbuttonClick = MutableLiveData()
        return backbuttonClick
    }

    fun observerImageUploadResponse(): MutableLiveData<ArrayList<String>>? {
        imageUploadResponse = null
        imageUploadResponse = MutableLiveData()
        return imageUploadResponse
    }

    fun observerDrinkResponse(): MutableLiveData<ArrayList<DrinkModel>>? {
        drinkResponse = null
        drinkResponse = MutableLiveData()
        return drinkResponse
    }

    fun observerRegistrationResponse(): MutableLiveData<RegistrationReponseData>? {
        registrationReponse = null
        registrationReponse = MutableLiveData()
        return registrationReponse
    }

    fun observerOtpResponse(): MutableLiveData<String>? {
        sendOtpResponse = null
        sendOtpResponse = MutableLiveData()
        return sendOtpResponse
    }

    fun observerVerifyUsernameResponse(): MutableLiveData<String>? {
        VerifyUsernameResponse = null
        VerifyUsernameResponse = MutableLiveData()
        return VerifyUsernameResponse
    }

    fun observerVerifyEmailPhoneResponse(): MutableLiveData<String>? {
        VerifyEmailNumberResponse = null
        VerifyEmailNumberResponse = MutableLiveData()
        return VerifyEmailNumberResponse
    }

    fun observerVerifyOtpResponse(): MutableLiveData<String>? {
        VerifyOtpResponse = null
        VerifyOtpResponse = MutableLiveData()
        return VerifyOtpResponse
    }

    fun buttonClickForNext(position: Int) {
        usernameObserver.get()?.let {
            username = it
        }
        passwordObserver.get()?.let {
            password = it
        }
        confirmPasswordObserver.get()?.let {
            confirmPassword = it
        }
        firstnameObserver.get()?.let {
            firstName = it
        }
        lastnameObserver.get()?.let {
            lastName = it
        }
        emailObserver.get()?.let {
            email = it
        }
        phoneNumberObserver.get()?.let {
            phoneName = it
        }
        dateOfBirthObserver.get()?.let {
            date_of_birth = it
        }
        howeTownObserver.get()?.let {
            hometown = it
        }

        drinkObserver.get()?.let {
            drink_id = it
        }
        genderObservers.get()?.let {
            gender = it
            if (it.equals("Not Listed")) {
                notListedObservers.get()?.let {
                    gender = it
                }
            }
        }
        interestedDatingObserver.get()?.let {
            interestedDating = it
        }
        isVerifiedObserver.get()?.let {
            isVerified = it
        }

        /*when (username.isNotEmpty() &&  password.isNotEmpty() && confirmPassword.isNotEmpty() &&  password.equals(confirmPassword) && firstName.isNotEmpty() && lastName.isNotEmpty()
                 && email.isNotEmpty() &&  phoneName.isNotEmpty() && date_of_birth.isNotEmpty() &&  gender.isNotEmpty()  &&  hometown.isNotEmpty()
                && drink_id.isNotEmpty() && imagePath!=null )*/
        if (position == 0 && username.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()) {
            if (!password.equals(confirmPassword)) {
                errorResponse?.value =
                    app?.baseContext?.getString(R.string.password_match_confirmpassword)
            } else {
                callVerifyUserName(username)
                // click_Button?.value = position
            }
        } else if (position == 1 && username.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty() && password.equals(confirmPassword
            ) && firstName.isNotEmpty() && lastName.isNotEmpty() && email.isNotEmpty() && phoneName.isNotEmpty()
        ) {
           // click_Button?.value = position
            callVerifyEmailNumber(email,phoneName)
        } else if (position == 2 && username.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty() && password.equals(
                confirmPassword
            ) && firstName.isNotEmpty() && lastName.isNotEmpty() && email.isNotEmpty() && phoneName.isNotEmpty()
        ) {
            click_Button?.value = position
        } else if (position == 3 && username.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty() && password.equals(
                confirmPassword
            ) && firstName.isNotEmpty() && lastName.isNotEmpty() && email.isNotEmpty() && phoneName.isNotEmpty()
        ) {
            click_Button?.value = position
        } else if (position == 4 && username.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty() && password.equals(
                confirmPassword
            ) && firstName.isNotEmpty() && lastName.isNotEmpty() && email.isNotEmpty() && phoneName.isNotEmpty()
            && date_of_birth.isNotEmpty() && birthDateVisiblity.isNotEmpty()
        ) {
            if (!isVerified) {
                errorResponse?.value =
                    app?.baseContext?.getString(R.string.please_verify_your_number_or_email)
            } else {
                click_Button?.value = position
            }
        } else if (position == 5 && username.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty() && password.equals(
                confirmPassword
            ) && firstName.isNotEmpty() && lastName.isNotEmpty() && email.isNotEmpty() && phoneName.isNotEmpty()
            && date_of_birth.isNotEmpty() && gender.isNotEmpty() && birthDateVisiblity.isNotEmpty() && genderVisiblity.isNotEmpty()
        ) {
            if (!isVerified) {
                errorResponse?.value =
                    app?.baseContext?.getString(R.string.please_verify_your_number_or_email)
            } else {
                click_Button?.value = position
            }
        } else if (position == 6 && username.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty() && password.equals(
                confirmPassword
            ) && firstName.isNotEmpty() && lastName.isNotEmpty() && email.isNotEmpty() && phoneName.isNotEmpty()
            && date_of_birth.isNotEmpty() && gender.isNotEmpty() && interestedDating.isNotEmpty() && birthDateVisiblity.isNotEmpty() && genderVisiblity.isNotEmpty() && datingVisibility.isNotEmpty()
        ) {
            if (!isVerified) {
                errorResponse?.value =
                    app?.baseContext?.getString(R.string.please_verify_your_number_or_email)
            } else {
                click_Button?.value = position
            }
        } else if (position == 7 && username.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty() && password.equals(
                confirmPassword
            ) && firstName.isNotEmpty() && lastName.isNotEmpty() && email.isNotEmpty() && phoneName.isNotEmpty()
            && date_of_birth.isNotEmpty() && gender.isNotEmpty() && interestedDating.isNotEmpty() && hometown.isNotEmpty()
            && birthDateVisiblity.isNotEmpty() && genderVisiblity.isNotEmpty() && datingVisibility.isNotEmpty() && homeTownVisibilty.isNotEmpty()
        ) {
            if (!isVerified) {
                errorResponse?.value =
                    app?.baseContext?.getString(R.string.please_verify_your_number_or_email)
            } else {
                click_Button?.value = position
            }
        } else if (position == 8 && username.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty() && password.equals(
                confirmPassword
            ) && firstName.isNotEmpty() && lastName.isNotEmpty() && email.isNotEmpty() && phoneName.isNotEmpty()
            && date_of_birth.isNotEmpty() && gender.isNotEmpty() && interestedDating.isNotEmpty() && hometown.isNotEmpty() && drink_id.isNotEmpty()

        ) {
            if (!isVerified) {
                errorResponse?.value =
                    app?.baseContext?.getString(R.string.please_verify_your_number_or_email)
            } else {
                click_Button?.value = position
            }
        } else {
            if (position == 0) {
                if (username.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.username_con_not_empty)
                    return
                }
                if (password.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.password_con_not_empty)
                    return
                }
                if (confirmPassword.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.confirm_password_con_not_empty)
                    return
                }
                if (password.equals(confirmPassword)) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.password_match_confirmpassword)
                    return
                }
            }
            if (position == 1) {
                if (firstName.isEmpty()){
                    errorResponse?.value = app?.baseContext?.getString(R.string.firstname_cannot_be_empty)
                    return
                }
                if (lastName.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.lastname_cannot_be_empty)
                    return
                }
                if (email.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.email_cannot_be_empty)
                    return
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.please_enter_correct_email)
                    return
                }
                if (phoneName.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.phonenumber_cannot_be_empty)
                    return
                }
            }
            if (position == 3) {
                if (!isVerified) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.you_need_to_verify_your_email_or_phonenumber)
                    return
                }
            }
            if (position == 4) {
                if (date_of_birth.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.Birthdate_cannot_be_empty)
                    return
                }
                if (birthDateVisiblity!!.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.please_select_previous_dob)
                    return
                }
            }
            if (position == 5) {
                if (gender.isEmpty()) {
                    errorResponse?.value = app?.baseContext?.getString(R.string.select_gender)
                    return
                }
                if (genderVisiblity!!.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.please_select_previous_gendar)
                    return
                }
            }
            if (position == 6) {
                if (interestedDating.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.select_interesting_dating)
                    return
                }
                if (datingVisibility!!.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.please_select_previous_interesting_date)
                    return
                }

            }
            if (position == 7) {
                if (hometown.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.please_enter_your_hometown)
                    return
                }
                if (homeTownVisibilty!!.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.please_select_previous_hometown)
                    return
                }
            }
            if (position == 8) {
                if (drink_id.isEmpty()) {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.select_favouite_drink)
                    return
                }
            }
            if (position == 9) {
                if (imagePath!!.isEmpty()) {
                    errorResponse?.value = app?.baseContext?.getString(R.string.select_prfile_image)
                    return
                }
            }
        }

    }

    fun backButtonClick(position: Int) {
        backbuttonClick?.value = position
    }

    fun sendOtpVerification() {

        var email = ""
        var phoneNumber = ""
        var optionEmailSelected = false
        var optionPhoneNumberSelected = false
        emailObserver.get()?.let {
            email = it
        }
        phoneNumberObserver.get()?.let {
            phoneNumber = it
        }

        optionEmail.get()?.let {
            optionEmailSelected = it
        }
        optionPhonenumber.get()?.let {
            optionPhoneNumberSelected = it
        }

        if (optionEmailSelected && email.isNotEmpty()) {
            var sendOtpPojo = SendOtpPojo(email, "")
            callSendOtp(sendOtpPojo)
        } else if (optionPhoneNumberSelected && phoneNumber.isNotEmpty()) {
            var sendOtpPojo = SendOtpPojo("", phoneNumber)
            callSendOtpWithPhoneNumber(sendOtpPojo)
        } else {
            when {
                (optionEmailSelected && email.isEmpty()) -> errorResponse?.value =
                    app?.baseContext?.getString(R.string.email_cannot_be_empty)
                (optionPhoneNumberSelected && phoneNumber.isEmpty()) -> errorResponse?.value =
                    app?.baseContext?.getString(R.string.phonenumber_cannot_be_empty)
                (!optionEmailSelected && !optionPhoneNumberSelected) -> errorResponse?.value =
                    app?.baseContext?.getString(R.string.please_select_option)
            }
            //errorResponse?.value = app?.baseContext?.getString(R.string.please_select_option)
        }
    }

    private fun callSendOtp(sendOtpPojo: SendOtpPojo) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getSendOtpRegistration(sendOtpPojo)
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
                                    sendOtpResponse?.value = it.status
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

    private fun callSendOtpWithPhoneNumber(sendOtpPojo: SendOtpPojo) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()
            ?.getSendOtpWithPhoneRegistration(sendOtpPojo)?.enqueue(object :
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
                                    sendOtpResponse?.value = it.status
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

    fun OtpVerification() {
        var firstLetter = ""
        var secondLetter = ""
        var thirdLetter = ""
        var fouthLetter = ""
        var optionEmailSelected = false
        var optionPhoneNumberSelected = false

        otpFirstObserver.get()?.let {
            firstLetter = it
        }
        otpSecondObserver.get()?.let {
            secondLetter = it
        }
        otpThirdObserver.get()?.let {
            thirdLetter = it
        }
        otpFouthObserver.get()?.let {
            fouthLetter = it
        }
        optionEmail.get()?.let {
            optionEmailSelected = it
        }
        optionPhonenumber.get()?.let {
            optionPhoneNumberSelected = it
        }

        when (firstLetter.isNotEmpty() && secondLetter.isNotEmpty() && thirdLetter.isNotEmpty() && fouthLetter.isNotEmpty()) {
            true -> {
                if (optionEmailSelected && email.isNotEmpty()) {
                    var verifyEmailPhonePojo = VerifyEmailPhonePojo(
                        email,
                        "",
                        firstLetter + secondLetter + thirdLetter + fouthLetter
                    )
                    callVerifyOtpEmail(verifyEmailPhonePojo)
                } else if (optionPhoneNumberSelected && phoneName.isNotEmpty()) {
                    var verifyEmailPhonePojo = VerifyEmailPhonePojo(
                        "",
                        phoneName,
                        firstLetter + secondLetter + thirdLetter + fouthLetter
                    )
                    callVerifyOtpWithPhoneNumber(verifyEmailPhonePojo)
                }
            }
            false -> {
                errorResponse?.value =
                    app?.baseContext?.getString(R.string.please_fill_four_digits_otpn)
            }

        }
    }

    private fun callVerifyEmailNumber(email: String,phonenumber: String) {
        progressObserver?.value = false
        var emailAndPhone = SendOtpPojo(email,phonenumber)
        NetworkAdapter.getInstance().getNetworkServices()
            ?.getVerfityEmailPhone(emailAndPhone)?.enqueue(object :
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
                                    VerifyEmailNumberResponse?.value = it.status
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
                                Toast.makeText(app?.baseContext, e.message, Toast.LENGTH_LONG)
                                    .show()
                            }
                        }
                    }
                }
            })
    }

    private fun callVerifyUserName(username: String) {
        progressObserver?.value = false
        var username = CheckUsernamePojo(username)
        NetworkAdapter.getInstance().getNetworkServices()
            ?.getVerfityUsername(username)?.enqueue(object :
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
                                    VerifyUsernameResponse?.value = it.status
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
                                Toast.makeText(app?.baseContext, e.message, Toast.LENGTH_LONG)
                                    .show()
                            }
                        }
                    }
                }
            })
    }


    private fun callVerifyOtpWithPhoneNumber(verifyEmailPhonePojo: VerifyEmailPhonePojo) {
        progressObserver?.value = false
        NetworkAdapter.getInstance().getNetworkServices()
            ?.getVerfityOtpWithPhone(verifyEmailPhonePojo)?.enqueue(object :
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
                                    VerifyOtpResponse?.value = it.status
                                    isVerifiedObserver.set(true)
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
                                Toast.makeText(app?.baseContext, e.message, Toast.LENGTH_LONG)
                                    .show()
                            }
                        }
                    }
                }
            })
    }

    private fun callVerifyOtpEmail(verifyEmailPhonePojo: VerifyEmailPhonePojo) {
        progressObserver?.value = false
        NetworkAdapter.getInstance().getNetworkServices()
            ?.getVerfityOtpWithEmail(verifyEmailPhonePojo)?.enqueue(object :
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
                                    VerifyOtpResponse?.value = it.status
                                    isVerifiedObserver?.set(true)
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
                                Toast.makeText(app?.baseContext, e.message, Toast.LENGTH_LONG)
                                    .show()
                            }
                        }
                    }
                }
            })
    }

    fun uploadImage() {

        if (mPhotoFile != null) {
            if (mPhotoFile!!.exists()) {
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
                                else -> {
                                    progressObserver?.value = false
                                    try {
                                        val jObjError = JSONObject(response.errorBody()!!.string())
                                        errorResponse?.value = jObjError.getString("message")
                                    } catch (e: Exception) {
                                        Toast.makeText(
                                            app?.baseContext,
                                            e.message,
                                            Toast.LENGTH_LONG
                                        ).show()
                                    }
                                }
                            }
                        }
                    })
            } else {
                errorResponse?.value =
                    app?.baseContext?.getString(R.string.Please_select_profile_image)
            }
        } else {
            errorResponse?.value = app?.baseContext?.getString(R.string.Please_select_profile_image)
        }
    }

    fun getAllDrink() {
        // progressObserver?.value = true
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
                        // progressObserver?.value = false
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
                    else -> {
                        // progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun checkBirthDate(text: String) {
        birthDateVisiblity = text

    }

    fun checkGender(text: String) {
        genderVisiblity = text
    }

    fun checkDating(text: String) {
        datingVisibility = text
    }

    fun checkHomeTown(text: String) {
        homeTownVisibilty = text
    }

    fun doRegistrationProcess(notification: Boolean) {

        when (username.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty() && password.equals(
            confirmPassword
        ) && firstName.isNotEmpty() && lastName.isNotEmpty()
                && email.isNotEmpty() && phoneName.isNotEmpty() && isVerified && date_of_birth.isNotEmpty() && gender.isNotEmpty() && interestedDating.isNotEmpty() && hometown.isNotEmpty()
                && drink_id.isNotEmpty() && imagePath != null
                && birthDateVisiblity.isNotEmpty() && genderVisiblity.isNotEmpty() && datingVisibility.isNotEmpty() && homeTownVisibilty.isNotEmpty()) {
            true -> {
                var dating = Dating(interestedDating, datingVisibility)
                var dob = Dob(date_of_birth, birthDateVisiblity)
                var gender = Gender(gender, genderVisiblity)
                var hometown = Hometown(hometown, homeTownVisibilty)
                var profileImg = ProfileImg(imagePath!!, "All")
                var registrationPojo = RegistrationPojo(
                    dating,
                    "User",
                    dob,
                    drink_id,
                    email,
                    firstName,
                    gender,
                    hometown,
                    false,
                    lastName,
                    password,
                    phoneName,
                    profileImg,
                    notification,
                    username
                )
                progressObserver?.value = true
                NetworkAdapter.getInstance().getNetworkServices()?.getRegistration(registrationPojo)
                    ?.enqueue(object :
                        Callback<RegistrationReponse> {
                        override fun onFailure(call: Call<RegistrationReponse>, t: Throwable) {
                            progressObserver?.value = false
                            errorResponse?.value = t.message
                        }

                        override fun onResponse(
                            call: Call<RegistrationReponse>,
                            response: Response<RegistrationReponse>
                        ) {
                            when (response.code()) {
                                200 -> {
                                    progressObserver?.value = false
                                    response.body()?.let {
                                        if (it.code.equals(200)) {
                                            //if (response.body()?.data?.size!! > 0)
                                            registrationReponse?.value = response.body()!!.data
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
                                        Toast.makeText(
                                            app?.baseContext,
                                            e.message,
                                            Toast.LENGTH_LONG
                                        ).show()
                                    }
                                }
                            }
                        }
                    })
            }
            false -> {
                when {
                    username.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.username_con_not_empty)
                    password.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.password_con_not_empty)
                    confirmPassword.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.confirm_password_con_not_empty)
                    !password.equals(confirmPassword) -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.password_match_confirmpassword)
                    firstName.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.firstname_cannot_be_empty)
                    lastName.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.lastname_cannot_be_empty)
                    email.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.email_cannot_be_empty)
                    !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.please_enter_correct_email)
                    phoneName.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.phonenumber_cannot_be_empty)
                    !isVerified -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.you_need_to_verify_your_email_or_phonenumber)
                    date_of_birth.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.Birthdate_cannot_be_empty)
                    gender.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.select_gender)
                    interestedDating.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.select_interesting_dating)
                    drink_id.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.select_favouite_drink)
                    imagePath!!.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.select_prfile_image)
                    birthDateVisiblity!!.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.please_select_previous_visibilties)
                    genderVisiblity!!.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.please_select_previous_visibilties)
                    datingVisibility!!.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.please_select_previous_visibilties)
                    homeTownVisibilty!!.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.please_select_previous_visibilties)
                }
            }

        }

    }

}