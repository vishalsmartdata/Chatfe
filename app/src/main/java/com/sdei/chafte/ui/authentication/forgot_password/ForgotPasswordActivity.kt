package com.sdei.chafte.ui.authentication.forgot_password

import android.content.Context
import androidx.lifecycle.Observer
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityAuthenticationBinding
import com.sdei.chafte.databinding.FragmentForgotPasswordBinding
import com.sdei.chafte.databinding.FragmentRegistrationBinding
import com.sdei.chafte.ui.authentication.intro.IntroFragment
import com.sdei.chafte.ui.authentication.registration.*
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.base.BaseVM
import com.sdei.chafte.utils.checkMyPermission

class ForgotPasswordActivity : BaseActivity<FragmentForgotPasswordBinding, ForgotPasswordVM>() {
    override val binding: FragmentForgotPasswordBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.fragment_forgot_password
    override var viewModel: ForgotPasswordVM
        get() = setUpVM(
            this,
            ForgotPasswordVM(application)
        )
        set(value) {}
    override val context: Context
        get() = this


    override fun bindData() {
        openFragmentReplaceNoAnim(R.id.flForgotPassword, ForgotPasswordFragment(), "", true)
    }

    override fun initListeners() {

    }
    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
            finish()
        }
    }

}