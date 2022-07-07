package com.sdei.chafte.ui.authentication.registration

import android.util.Log
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentRegistrationSixthBinding
import com.sdei.chafte.model.DrinkModel
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager

class RegistrationAllowNotificationFragment  : BaseFragment<FragmentRegistrationSixthBinding, RegistrationVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_registration_sixth
    override var viewModel: RegistrationVM
        get() = setUpVM(activity as RegistrationActivity, RegistrationVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentRegistrationSixthBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {
        binding.vm = viewModel
    }

    override fun initListeners() {
        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })


        viewModel.observerRegistrationResponse()?.observe (this, Observer {
            Log.e("response_id",""+it._id)
            navigateActivity(CompleteRegistrationActivity(),null)

        })
    }
}