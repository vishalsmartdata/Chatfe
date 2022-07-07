package com.sdei.chafte.ui.authentication.forgot_password

import android.content.Context
import android.util.Log
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityAuthenticationBinding
import com.sdei.chafte.databinding.FragmentChangePasswordBinding
import com.sdei.chafte.databinding.FragmentCompleteForgotPasswordBinding
import com.sdei.chafte.databinding.FragmentLoginBinding
import com.sdei.chafte.ui.authentication.intro.IntroFragment
import com.sdei.chafte.ui.authentication.login.LoginVM
import com.sdei.chafte.ui.authentication.registration.RegistrationActivity
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.chafte.utils.base.BaseVM

class ChangePasswordFragment : BaseFragment<FragmentChangePasswordBinding, ForgotPasswordVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_change_password
    override var viewModel: ForgotPasswordVM
        get() = setUpVM(activity as ForgotPasswordActivity, ForgotPasswordVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentChangePasswordBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {

        binding.vm = viewModel

        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when(it) {
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })

        viewModel.observerchangePassword()?.observe (this, Observer {
            Log.e("change_password",""+it)
            openFragmentReplaceNoAnim(R.id.flForgotPassword, PasswordChangedFragment(), "", false)
        })
    }

    override fun initListeners() {
        binding.imageBack.setOnClickListener { baseActivity.onBackPressed() }
    }
}