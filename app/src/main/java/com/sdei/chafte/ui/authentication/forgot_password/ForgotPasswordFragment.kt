package com.sdei.chafte.ui.authentication.forgot_password

import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentFirstForgotPasswordBinding
import com.sdei.chafte.databinding.FragmentFirstSlideBinding
import com.sdei.chafte.databinding.FragmentLoginBinding
import com.sdei.chafte.pojoclasses.SendOtpPojo
import com.sdei.chafte.ui.authentication.AuthenticationActivity
import com.sdei.chafte.ui.authentication.intro.IntroVm
import com.sdei.chafte.ui.authentication.login.LoginFragment
import com.sdei.chafte.ui.authentication.registration.RegistrationActivity

import com.sdei.chafte.utils.base.BaseFragment

class ForgotPasswordFragment : BaseFragment<FragmentFirstForgotPasswordBinding, ForgotPasswordVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_first_forgot_password
    override var viewModel: ForgotPasswordVM
        get() = setUpVM(activity as ForgotPasswordActivity, ForgotPasswordVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentFirstForgotPasswordBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {

        binding.vm = viewModel

        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })

        viewModel.observerOptionEmail()?.observe (this, Observer {
            viewModel.optionEmailSelected = it
            if(it){
                binding.edEmailPhone.setText("")
                binding.edEmailPhone.visibility=View.VISIBLE
                binding.edEmailPhone.inputType= InputType.TYPE_CLASS_TEXT
            }
        })
        viewModel.observerPhonenumber()?.observe (this, Observer {
            viewModel.optionPhoneNumberSelected = it
            if(it){
                binding.edEmailPhone.setText("")
                binding.edEmailPhone.visibility=View.VISIBLE
                binding.edEmailPhone.inputType= InputType.TYPE_CLASS_NUMBER
            }
        })

        /*viewModel.optionEmail.get()?.let {
            if(it){
                binding.edEmailPhone.visibility=View.VISIBLE
                binding.edEmailPhone.inputType= InputType.TYPE_CLASS_TEXT
            }
        }
        viewModel.optionPhonenumber.get()?.let {
            if(it){
                binding.edEmailPhone.visibility=View.VISIBLE
                binding.edEmailPhone.inputType= InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }*/

        viewModel.observerOtpResponse()?.observe (this, Observer {
            openFragmentReplaceNoAnim(R.id.flForgotPassword, OTPVerificationFragment(), "", false)
        })

    }

    override fun initListeners() {

        binding.imageBack.setOnClickListener { baseActivity.onBackPressed() }
    }

}