package com.sdei.chafte.ui.home.setting.accountVisibility

import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentAccountVisibilityBinding
import com.sdei.chafte.pojoclasses.*
import com.sdei.chafte.ui.home.setting.SettingActivity
import com.sdei.chafte.ui.home.setting.SettingVm
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager

class AccountVisibilityFragment : BaseFragment<FragmentAccountVisibilityBinding, SettingVm>() {
    override val layoutId: Int
        get() = R.layout.fragment_account_visibility
    override var viewModel: SettingVm
        get() = setUpVM(activity as SettingActivity, SettingVm(baseActivity.application,baseActivity.getData(
            SessionManager.AUTHENTICATION))
        )
        set(value) {}
    override var binding: FragmentAccountVisibilityBinding
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
           viewModel.getPrivacyInfo()
        })

        viewModel.observerAccpuntVisibilityResponse()?.observe (this, Observer {
           if(it.profileImg.privacy.equals("All")){
               binding.rbAll.isChecked=true
           }else{
               binding.rbFriend.isChecked=true
           }
            if(it.dating.privacy.equals("All")){
               binding.rbInterestAll.isChecked=true
           }else{
               binding.rbInterestFriend.isChecked=true
           }
            if(it.gender.privacy.equals("All")){
               binding.rbIndentifyAll.isChecked=true
           }else{
               binding.rbIndentifyFriend.isChecked=true
           }
            if(it.hometown.privacy.equals("All")){
               binding.rbHomeTownAll.isChecked=true
           }else{
               binding.rbHomeTownFriend.isChecked=true
           }
            if(it.dob.privacy.equals("All")){
               binding.rbAgeAll.isChecked=true
           }else{
               binding.rbAgeFriend.isChecked=true
           }
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

        viewModel.getPrivacyInfo()

        binding.txSubmit.setOnClickListener {
            var profile = ""
            if(binding.rbAll.isChecked){
                profile="All"
            }else{
                profile="Friends"
            }

            var age = ""
            if(binding.rbAgeAll.isChecked){
                age="All"
            }else{
                age="Friends"
            }
            var interestAll = ""
            if(binding.rbInterestAll.isChecked){
                interestAll="All"
            }else{
                interestAll="Friends"
            }
            var indentifyAll = ""
            if(binding.rbIndentifyAll.isChecked){
                indentifyAll="All"
            }else{
                indentifyAll="Friends"
            }

            var hometown = ""
            if(binding.rbHomeTownAll.isChecked){
                hometown="All"
            }else{
                hometown="Friends"
            }

            var profileAv= ProfileImgAV(profile)
            var dobAv= DobAV(age)
            var interestAv= DatingAV(interestAll)
            var indentify= GenderAV(indentifyAll)
            var hometownav= HometownAV(hometown)

            var accountVisibilityBinding= AccountVisibilityPojo(interestAv,dobAv,indentify,hometownav,profileAv)
            viewModel.addprivacyInfo(accountVisibilityBinding)
        }
    }
}