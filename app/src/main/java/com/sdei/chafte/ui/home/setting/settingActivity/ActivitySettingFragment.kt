package com.sdei.chafte.ui.home.setting.settingActivity

import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentAccountActivityBinding
import com.sdei.chafte.databinding.FragmentAccountVisibilityBinding
import com.sdei.chafte.pojoclasses.*
import com.sdei.chafte.ui.home.setting.SettingActivity
import com.sdei.chafte.ui.home.setting.SettingVm
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager

class ActivitySettingFragment : BaseFragment<FragmentAccountActivityBinding, SettingVm>() {
    override val layoutId: Int
        get() = R.layout.fragment_account_activity
    override var viewModel: SettingVm
        get() = setUpVM(activity as SettingActivity, SettingVm(baseActivity.application,baseActivity.getData(
            SessionManager.AUTHENTICATION))
        )
        set(value) {}
    override var binding: FragmentAccountActivityBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {
        binding.avVM = viewModel
        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })
        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })
    }

    override fun initListeners() {
        viewModel.observerPrivacyResponse()?.observe (this, Observer {

        })

        viewModel.observerAccpuntVisibilityResponse()?.observe (this, Observer {

        })

        viewModel.observerLogoutResponse()?.observe (this, Observer {
            baseActivity.logout(activity)
        })

        binding.imgCancel.setOnClickListener {
            if (baseActivity.supportFragmentManager.backStackEntryCount > 1) {
                baseActivity.supportFragmentManager.popBackStack()
            } else {
                super.onBackPressed()
                // baseActivity.finish()
            }
        }

       // viewModel.getPrivacyInfo()

        binding.txSubmit.setOnClickListener {

        }
    }
}