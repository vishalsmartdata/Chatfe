package com.sdei.chafte.ui.authentication.forgot_password

import android.app.Application
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.SendOtpResponse
import com.sdei.chafte.pojoclasses.ChangePasswordPojo
import com.sdei.chafte.pojoclasses.SendOtpPojo
import com.sdei.chafte.pojoclasses.VerifyEmailPhonePojo
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class ForgotPasswordVM(application: Application) : BaseVM(application) {

    val passwordObserver = ObservableField<String>()
    val confirmPasswordObserver = ObservableField<String>()
    val emailOrPhoneNumber = ObservableField<String>()
    var optionEmail: MutableLiveData<Boolean>? = null
    var optionPhonenumber: MutableLiveData<Boolean>? = null

    val progressObservable = ObservableField<Boolean>()
    var sendOtpResponse: MutableLiveData<String>? = null
    var VerifyOtpResponse: MutableLiveData<String>? = null
    var changePasswordRespose: MutableLiveData<String>? = null

    var otpFirstObserver = ObservableField<String>()
    var otpSecondObserver = ObservableField<String>()
    var otpThirdObserver = ObservableField<String>()
    var otpFouthObserver = ObservableField<String>()

    var email = ""
    var phoneNumber = ""
    var optionEmailSelected = false
    var optionPhoneNumberSelected = false

    var app: Application? = null

    init {
        app = application
        progressObservable.set(true)
    }

    fun observerOptionEmail(): MutableLiveData<Boolean>? {
        optionEmail = null
        optionEmail = MutableLiveData()
        return optionEmail
    }
    fun observerPhonenumber(): MutableLiveData<Boolean>? {
        optionPhonenumber = null
        optionPhonenumber = MutableLiveData()
        return optionPhonenumber
    }

    fun observerVerifyOtpResponse(): MutableLiveData<String>? {
        VerifyOtpResponse = null
        VerifyOtpResponse = MutableLiveData()
        return VerifyOtpResponse
    }

    fun observerchangePassword(): MutableLiveData<String>? {
        changePasswordRespose = null
        changePasswordRespose = MutableLiveData()
        return changePasswordRespose
    }

    fun observerOtpResponse(): MutableLiveData<String>? {
        sendOtpResponse = null
        sendOtpResponse = MutableLiveData()
        return sendOtpResponse
    }

    fun sendOtpVerification() {

                emailOrPhoneNumber.get()?.let {
                    email = it
                }
                emailOrPhoneNumber.get()?.let {
                    phoneNumber = it
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
        }
    }

    private fun callSendOtpWithPhoneNumber(sendOtpPojo: SendOtpPojo) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()
            ?.getSendOtpWithPhoneForgotPassword(sendOtpPojo)?.enqueue(object :
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
                                    sendOtpResponse?.value = it.message
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
    }

    private fun callSendOtp(sendOtpPojo: SendOtpPojo) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getSendOTPForgotPassword(sendOtpPojo)
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
                                    sendOtpResponse?.value = it.message
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
    }

    fun OtpVerification() {
        var firstLetter = ""
        var secondLetter = ""
        var thirdLetter = ""
        var fouthLetter = ""

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

        when (firstLetter.isNotEmpty() && secondLetter.isNotEmpty() && thirdLetter.isNotEmpty() && fouthLetter.isNotEmpty()) {
            true -> {
                if (optionEmailSelected) {
                    var verifyEmailPhonePojo = VerifyEmailPhonePojo(email, "",firstLetter+secondLetter+thirdLetter+fouthLetter)
                    callVerifyOtpEmail(verifyEmailPhonePojo)
                } else if (optionPhoneNumberSelected) {
                    var verifyEmailPhonePojo = VerifyEmailPhonePojo("", phoneNumber,firstLetter+secondLetter+thirdLetter+fouthLetter)
                    callVerifyOtpWithPhoneNumber(verifyEmailPhonePojo)
                }
            }
            false -> {
                errorResponse?.value=app?.baseContext?.getString(R.string.please_fill_four_digits_otpn)
            }

        }
    }

    private fun callVerifyOtpWithPhoneNumber(verifyEmailPhonePojo: VerifyEmailPhonePojo) {
        NetworkAdapter.getInstance().getNetworkServices()
            ?.getVerfityOtpWithEmailPhoneForForgot(verifyEmailPhonePojo)?.enqueue(object :
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
    }

    private fun callVerifyOtpEmail(verifyEmailPhonePojo: VerifyEmailPhonePojo) {
        NetworkAdapter.getInstance().getNetworkServices()
            ?.getVerfityOtpWithEmailPhoneForForgot(verifyEmailPhonePojo)?.enqueue(object :
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
                                    VerifyOtpResponse?.value = it.message
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
    }

    fun changePassword() {
        var firstLetter = ""
        var secondLetter = ""
        var thirdLetter = ""
        var fouthLetter = ""
        var password = ""
        var confirm_password = ""
        emailOrPhoneNumber.get()?.let {
            email = it
        }
        emailOrPhoneNumber.get()?.let {
            phoneNumber = it
        }

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
        passwordObserver.get()?.let {
            password = it
        }
        confirmPasswordObserver.get()?.let {
            confirm_password = it
        }

        when (password.isNotEmpty() && confirm_password.isNotEmpty() && password.equals(confirm_password)) {
            true -> {
                if (optionEmailSelected) {
                    var changePasswordPojo = ChangePasswordPojo(
                        firstLetter + secondLetter + thirdLetter + fouthLetter,
                        password,
                        "",
                        email
                    )
                    callChangePassword(changePasswordPojo)
                } else if (optionPhoneNumberSelected) {
                    var changePasswordPojo = ChangePasswordPojo(
                        firstLetter + secondLetter + thirdLetter + fouthLetter,
                        password,
                        phoneNumber,
                        ""
                    )
                    callChangePassword(changePasswordPojo)
                } else {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.please_select_option)
                }
            }
            false -> {
                when {
                    password.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.password_con_not_empty)
                    confirm_password.isEmpty() -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.confirm_password_con_not_empty)
                    !password.equals(confirm_password) -> errorResponse?.value =
                        app?.baseContext?.getString(R.string.password_match_confirmpassword)
                }
            }
        }
    }

    private fun callChangePassword(changePasswordPojo: ChangePasswordPojo) {
        NetworkAdapter.getInstance().getNetworkServices()
            ?.getchangePassword(changePasswordPojo)?.enqueue(object :
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
                                    changePasswordRespose?.value = it.status
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
    }


}