package com.sdei.chafte.ui.home.message.chat

import android.content.Context
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityChatBinding
import com.sdei.chafte.databinding.ActivitySettingBinding
import com.sdei.chafte.ui.home.setting.SettingFragment
import com.sdei.chafte.ui.home.setting.SettingVm
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager

class ChatActivity : BaseActivity<ActivityChatBinding, ChatVm>() {
    override val binding: ActivityChatBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_chat
    override var viewModel: ChatVm
        get() = setUpVM(this, ChatVm(application))
        set(value) {}
    override val context: Context
        get() = this


    override fun bindData() {
     //   openFragmentReplaceNoAnim(R.id.settingContainer, SettingFragment(), "", false)
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
