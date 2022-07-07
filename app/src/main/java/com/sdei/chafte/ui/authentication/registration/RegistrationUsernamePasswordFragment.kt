package com.sdei.chafte.ui.authentication.registration

import android.text.method.HideReturnsTransformationMethod
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentRegistrationFirstpageBinding
import com.sdei.chafte.databinding.FragmentRegistrationFrontPageBinding
import com.sdei.chafte.utils.base.BaseFragment
import android.text.method.PasswordTransformationMethod
import android.util.Log

class RegistrationUsernamePasswordFragment: BaseFragment<FragmentRegistrationFrontPageBinding, RegistrationVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_registration_front_page
    override var viewModel: RegistrationVM
        get() = setUpVM((activity as RegistrationActivity), RegistrationVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentRegistrationFrontPageBinding
        get() = setUpBinding()
        set(value) {}


    override fun bindData() {
        binding.vm = viewModel

        viewModel.observerVerifyUsernameResponse()?.observe (this, Observer {
           // viewModel.buttonClickForNext(0)
            viewModel.click_Button?.value = 0
        })

        binding.edPassword.setTransformationMethod(PasswordTransformationMethod())
        binding.imgShowHidePassword.setOnClickListener {
            if(binding.imgShowHidePassword.drawable.constantState!!.equals(resources.getDrawable(R.drawable.show_button).constantState)){
                binding.edPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
                binding.imgShowHidePassword.setImageDrawable(resources.getDrawable(R.drawable.ic_full_eye))
        } else{
                binding.edPassword.transformationMethod = PasswordTransformationMethod.getInstance()
                binding.imgShowHidePassword.setImageDrawable(resources.getDrawable(R.drawable.show_button))
        }}
        binding.imgShowHideConfirm.setOnClickListener {
            if(binding.imgShowHideConfirm.drawable.constantState!!.equals(resources.getDrawable(R.drawable.show_button).constantState)){
            binding.edConfirmPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
            binding.imgShowHideConfirm.setImageDrawable(resources.getDrawable(R.drawable.ic_full_eye))
        } else{
            binding.edConfirmPassword.transformationMethod = PasswordTransformationMethod.getInstance()
            binding.imgShowHideConfirm.setImageDrawable(resources.getDrawable(R.drawable.show_button))
        }
        }

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })

    }

    override fun initListeners() {

    }

}