package com.sdei.chafte.ui.authentication.registration

import android.content.Context
import android.os.Bundle
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentCompleteRegistrationBinding
import com.sdei.chafte.databinding.FragmentLoginBinding
import com.sdei.chafte.databinding.FragmentRegistrationSixthBinding
import com.sdei.chafte.ui.authentication.AuthenticationActivity
import com.sdei.chafte.ui.authentication.login.LoginVM
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.base.BaseFragment

class CompleteRegistrationActivity  : BaseActivity<FragmentCompleteRegistrationBinding, RegistrationVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_complete_registration
    override var viewModel: RegistrationVM
        get() = setUpVM(this, RegistrationVM(application))
        set(value) {}
    override var binding: FragmentCompleteRegistrationBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {
        binding.vm = viewModel
    }

    override fun initListeners() {
        binding.txContinue.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("key", "login")
            navigateActivity(AuthenticationActivity(),bundle)
        }

    }

    override val context: Context
        get() = this
}