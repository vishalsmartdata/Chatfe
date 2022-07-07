package com.sdei.chafte.ui.home.message.the_blizzard

import android.content.Context
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityProfilePreviewBinding
import com.sdei.chafte.ui.home.message.profile_preview.ProfilePreviewVM
import com.sdei.chafte.utils.base.BaseActivity

class TheBlizzardActvity : BaseActivity<ActivityProfilePreviewBinding, ProfilePreviewVM>() {
    override val binding: ActivityProfilePreviewBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_profile_preview
    override var viewModel: ProfilePreviewVM
        get() = setUpVM(this, ProfilePreviewVM(application))
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