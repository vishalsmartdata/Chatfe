package com.sdei.chafte.ui.home.setting

import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentSettingBinding
import com.sdei.chafte.ui.home.setting.accountVisibility.AccountVisibilityFragment
import com.sdei.chafte.ui.home.setting.my_events.MyEventsFragmemt
import com.sdei.chafte.ui.home.setting.settingActivity.ActivitySettingFragment
import com.sdei.chafte.ui.home.setting.webview.WebViewActivity
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager

class SettingFragment : BaseFragment<FragmentSettingBinding, SettingVm>() {
    override val layoutId: Int
        get() = R.layout.fragment_setting
    override var viewModel: SettingVm
        get() = setUpVM(activity as SettingActivity, SettingVm(baseActivity.application,baseActivity.getData(
            SessionManager.AUTHENTICATION)))
        set(value) {}
    override var binding: FragmentSettingBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {
        binding.svm = viewModel
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
        /*binding.txSignOut.setOnClickListener {
            baseActivity.logout(activity)
        }*/
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
        binding.txMyEvents.setOnClickListener {
            openFragmentReplaceNoAnim(R.id.settingContainer, MyEventsFragmemt(), "", false)
        }
        binding.txAccountVisibility.setOnClickListener {
            openFragmentReplaceNoAnim(R.id.settingContainer, AccountVisibilityFragment(), "", false)
        }
        binding.txActivity.setOnClickListener {
            openFragmentReplaceNoAnim(R.id.settingContainer, ActivitySettingFragment(), "", false)
        }
        binding.txCommunityRules.setOnClickListener {
            baseActivity.navigateActivity(WebViewActivity(),null)
          //  openFragmentReplaceNoAnim(R.id.settingContainer, AccountVisibilityFragment(), "", false)
        }
    }
}