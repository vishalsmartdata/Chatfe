package com.sdei.chafte.ui.authentication.forgot_password

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentLoginBinding
import com.sdei.chafte.databinding.FragmentOtpForgotPasswordBinding
import com.sdei.chafte.ui.authentication.login.LoginVM
import com.sdei.chafte.ui.authentication.registration.GenericKeyEvent
import com.sdei.chafte.ui.authentication.registration.GenericTextWatcher
import com.sdei.chafte.ui.authentication.registration.RegistrationActivity
import com.sdei.chafte.utils.base.BaseFragment

class OTPVerificationFragment : BaseFragment<FragmentOtpForgotPasswordBinding, ForgotPasswordVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_otp_forgot_password
    override var viewModel: ForgotPasswordVM
        get() = setUpVM(activity as ForgotPasswordActivity, ForgotPasswordVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentOtpForgotPasswordBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {

        binding.vm = viewModel

        viewModel.observerVerifyOtpResponse()?.observe (this, Observer {
            Log.e("otp_response",""+it)
            openFragmentReplaceNoAnim(R.id.flForgotPassword, ChangePasswordFragment(), "", false)
        })

        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })

        binding.edFirstDigit.addTextChangedListener(GenericTextWatcher(binding.edFirstDigit, binding.edSecondDigit))
        binding.edSecondDigit.addTextChangedListener(GenericTextWatcher(binding.edSecondDigit, binding.edthirdDigit))
        binding.edthirdDigit.addTextChangedListener(GenericTextWatcher( binding.edthirdDigit,  binding.edfourthDigit))
        binding.edfourthDigit.addTextChangedListener(GenericTextWatcher(binding.edfourthDigit, null))

        binding.edFirstDigit.setOnKeyListener(GenericKeyEvent(binding.edFirstDigit, null))
        binding.edSecondDigit.setOnKeyListener(GenericKeyEvent(binding.edSecondDigit, binding.edFirstDigit))
        binding.edthirdDigit.setOnKeyListener(GenericKeyEvent( binding.edthirdDigit, binding.edSecondDigit))
        binding.edfourthDigit.setOnKeyListener(GenericKeyEvent(binding.edfourthDigit, binding.edthirdDigit))

    }

    override fun initListeners() {
        binding.imageBack.setOnClickListener { baseActivity.onBackPressed() }
    }
}
