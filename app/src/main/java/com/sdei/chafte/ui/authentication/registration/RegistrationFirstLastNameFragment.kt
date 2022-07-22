package com.sdei.chafte.ui.authentication.registration

import android.content.Context
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentRegistrationFirstpageBinding
import com.sdei.chafte.ui.authentication.login.LoginVM
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.chafte.utils.hideSoftKey

class RegistrationFirstLastNameFragment: BaseFragment<FragmentRegistrationFirstpageBinding, RegistrationVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_registration_firstpage
    override var viewModel: RegistrationVM
        get() = setUpVM((activity as RegistrationActivity), RegistrationVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentRegistrationFirstpageBinding
        get() = setUpBinding()
        set(value) {}


    override fun bindData() {
        binding.vm = viewModel

        binding.parent.setOnClickListener{
            hideSoftKey(requireActivity())
        }
        binding.firstNamePage.setOnClickListener{
            hideSoftKey(requireActivity())
        }

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })
    }


    override fun initListeners() {

        viewModel.observerVerifyEmailPhoneResponse()?.observe (this, Observer {
            // viewModel.buttonClickForNext(0)
            viewModel.click_Button?.value = 1
        })
        /*viewModel.observerHistoryResponse()?.observe(this, Observer {
            Log.e("text","priya");
        })*/

       // (activity as RegistrationActivity).binding.viewpagerRegistration.setCurrentItem(getItem(+1), true);
    }

}