package com.sdei.chafte.ui.authentication.forgot_password

import com.facebook.login.LoginFragment
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentCompleteForgotPasswordBinding
import com.sdei.chafte.databinding.FragmentFirstForgotPasswordBinding
import com.sdei.chafte.ui.authentication.registration.RegistrationActivity
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.utils.base.BaseFragment

class PasswordChangedFragment  : BaseFragment<FragmentCompleteForgotPasswordBinding, ForgotPasswordVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_complete_forgot_password
    override var viewModel: ForgotPasswordVM
        get() = setUpVM(activity as ForgotPasswordActivity, ForgotPasswordVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentCompleteForgotPasswordBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {

        binding.vm = viewModel
        binding.txSignIn.setOnClickListener {
            openFragmentReplaceNoAnim(R.id.flForgotPassword, LoginFragment(), "", false)

        }

    }

    override fun initListeners() {
        binding.imageBack.setOnClickListener { baseActivity.onBackPressed() }
    }

}