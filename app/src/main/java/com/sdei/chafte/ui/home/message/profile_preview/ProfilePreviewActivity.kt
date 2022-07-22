package com.sdei.chafte.ui.home.message.profile_preview

import android.content.Context
import android.view.MenuInflater
import android.view.View
import android.widget.PopupMenu
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityProfilePreviewBinding
import com.sdei.chafte.utils.base.BaseActivity

class ProfilePreviewActivity : BaseActivity<ActivityProfilePreviewBinding, ProfilePreviewVM>() {
    override val binding: ActivityProfilePreviewBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_profile_preview
    override var viewModel: ProfilePreviewVM
        get() = setUpVM(this, ProfilePreviewVM(application,initialSocket()))
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