package com.sdei.chafte.ui.authentication.registration

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.MotionEvent
import androidx.lifecycle.Observer
import androidx.viewpager.widget.ViewPager
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentRegistrationBinding
import com.sdei.chafte.utils.base.BaseActivity

class RegistrationActivity : BaseActivity<FragmentRegistrationBinding, RegistrationVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_registration
    override var viewModel: RegistrationVM
        get() = setUpVM(this, RegistrationVM(application))
        set(value) {}
    override var binding: FragmentRegistrationBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {
        binding.vm = viewModel
        val adapter = FragmentPagerItemAdapter(
            supportFragmentManager, FragmentPagerItems.with(this)
                .add( "",RegistrationUsernamePasswordFragment::class.java) .add( "",RegistrationFirstLastNameFragment::class.java).
                add( "",OtpSelectOptionFragment::class.java).add( "",RegistrationOTPVerificationFragment::class.java).add( "",RegistrationDateOfBirthFragment::class.java).
                add( "",RegistrationGenderFragment::class.java).add( "",RegistrationDatingFragment::class.java).
                add( "",RegistrationHometownFragment::class.java).add( "",RegistrationFavoriteDrinkFragment::class.java).
                add( "",RegistrationProfilePictureFragment::class.java).add( "",RegistrationAllowNotificationFragment::class.java)
                .create()
        )
        binding.viewpagerRegistration.adapter=adapter
        binding.indicatorRegistration.setupWithViewPager(binding.viewpagerRegistration,true)

        viewModel.observerNextButtonResponse()?.observe(this, Observer {
            binding.viewpagerRegistration.setCurrentItem(getItem(+1), true);
        })

        viewModel.observerBackButtonClickResponse()?.observe(this, Observer {
            binding.viewpagerRegistration.setCurrentItem(getBackItem(1), true);
        })

        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })

    }

    override fun initListeners() {

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return false
    }

    private fun getItem(i: Int): Int {
        return binding.viewpagerRegistration.getCurrentItem() + i
    }
    private fun getBackItem(i: Int): Int {
        return binding.viewpagerRegistration.getCurrentItem() - i
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
            finish()
        }
    }

    override val context: Context
        get() = this

   /* override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }*/
}