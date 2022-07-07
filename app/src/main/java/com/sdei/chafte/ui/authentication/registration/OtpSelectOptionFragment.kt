package com.sdei.chafte.ui.authentication.registration

import android.util.Log
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentFirstForgotPasswordBinding
import com.sdei.chafte.databinding.FragmentFirstSlideBinding
import com.sdei.chafte.databinding.FragmentLoginBinding
import com.sdei.chafte.databinding.FragmentOtpSelectOptionBinding
import com.sdei.chafte.ui.authentication.AuthenticationActivity
import com.sdei.chafte.ui.authentication.intro.IntroVm
import com.sdei.chafte.ui.authentication.login.LoginFragment
import com.sdei.chafte.ui.authentication.registration.RegistrationActivity

import com.sdei.chafte.utils.base.BaseFragment

class OtpSelectOptionFragment : BaseFragment<FragmentOtpSelectOptionBinding, RegistrationVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_otp_select_option
    override var viewModel: RegistrationVM
        get() = setUpVM(activity as RegistrationActivity, RegistrationVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentOtpSelectOptionBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {

        binding.vm = viewModel

        viewModel.emailObserver.get()?.let {
            viewModel.emailObserver.set(it)
        }
        viewModel.phoneNumberObserver.get()?.let {
            viewModel.phoneNumberObserver.set(it)
        }
        viewModel.observerOtpResponse()?.observe (this, Observer {
            Log.e("otp_response",""+it)
            viewModel.buttonClickForNext(2)
        })


        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })

       /* binding.txContinue.setOnClickListener {
            openFragmentReplaceNoAnim(R.id.flForgotPassword, OTPVerificationFragment(), "", true)
        }*/

    }

    override fun initListeners() {

    }

}