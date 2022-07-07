package com.sdei.chafte.ui.home.message

import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentMessageBinding
import com.sdei.chafte.databinding.FragmentSearchBinding
import com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordActivity
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.ui.home.search.SearchVm
import com.sdei.chafte.utils.base.BaseFragment

class MessageFragment : BaseFragment<FragmentMessageBinding, MessageVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_message
    override var viewModel: MessageVM
        get() = setUpVM(activity as HomeActivity, MessageVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentMessageBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {
        binding.mvm = viewModel
    }

    override fun initListeners() {

    }
}