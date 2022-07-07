package com.sdei.chafte.ui.home.setting

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.util.Log
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityAuthenticationBinding
import com.sdei.chafte.databinding.ActivitySettingBinding
import com.sdei.chafte.ui.authentication.intro.IntroFragment
import com.sdei.chafte.ui.authentication.login.LoginFragment
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.base.BaseVM
import com.sdei.chafte.utils.checkMyPermission
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

class SettingActivity : BaseActivity<ActivitySettingBinding, SettingVm>() {
    override val binding: ActivitySettingBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_setting
    override var viewModel: SettingVm
        get() = setUpVM(
            this,
            SettingVm(application,getData(SessionManager.AUTHENTICATION))
        )
        set(value) {}
    override val context: Context
        get() = this


    override fun bindData() {
        openFragmentReplaceNoAnim(R.id.settingContainer, SettingFragment(), "", false)
    }

    override fun initListeners() {

    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStack()
        } else {
          super.onBackPressed()
        }
    }
}