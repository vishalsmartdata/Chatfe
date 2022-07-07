package com.sdei.chafte.ui.home.message.vote_for_kick_out

import android.content.Context
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityProfilePreviewBinding
import com.sdei.chafte.databinding.ActivityVoteToRemoveBinding
import com.sdei.chafte.ui.home.message.MessageVM
import com.sdei.chafte.ui.home.message.profile_preview.ProfilePreviewVM
import com.sdei.chafte.utils.base.BaseActivity

class VoteToRemoveActivity : BaseActivity<ActivityVoteToRemoveBinding, MessageVM>() {
    override val binding: ActivityVoteToRemoveBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_vote_to_remove
    override var viewModel: MessageVM
        get() = setUpVM(this, MessageVM(application))
        set(value) {}
    override val context: Context
        get() = this


    override fun bindData() {

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