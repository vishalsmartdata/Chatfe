package com.sdei.chafte.ui.authentication.intro

import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentFirstSlideBinding
import com.sdei.chafte.databinding.FragmentIntroBinding
import com.sdei.chafte.ui.authentication.AuthenticationActivity
import com.sdei.chafte.ui.authentication.registration.RegistrationActivity
import com.sdei.chafte.utils.base.BaseFragment

class FirstSlideFragment : BaseFragment<FragmentFirstSlideBinding, IntroVm>() {
    override val layoutId: Int
        get() = R.layout.fragment_first_slide
    override var viewModel: IntroVm
        get() = setUpVM(activity as AuthenticationActivity, IntroVm(baseActivity.application))
        set(value) {}
    override var binding: FragmentFirstSlideBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {

        binding.listener = viewModel

    }

    override fun initListeners() {

    }

}