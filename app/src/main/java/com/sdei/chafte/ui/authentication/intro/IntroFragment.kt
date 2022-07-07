package com.sdei.chafte.ui.authentication.intro
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentIntroBinding
import com.sdei.chafte.ui.authentication.AuthenticationActivity
import com.sdei.chafte.ui.authentication.login.LoginFragment
import com.sdei.chafte.utils.base.BaseFragment


class IntroFragment : BaseFragment<FragmentIntroBinding, IntroVm>() {
    override val layoutId: Int
        get() = R.layout.fragment_intro
    override var viewModel: IntroVm
        get() = setUpVM(activity as AuthenticationActivity, IntroVm(baseActivity.application))
        set(value) {}
    override var binding: FragmentIntroBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {

        binding.listener = viewModel

    }

    override fun initListeners() {

        val adapter = FragmentPagerItemAdapter(
            activity?.supportFragmentManager, FragmentPagerItems.with(activity)
                .add( "",FirstSlideFragment::class.java).add( "",SecondSlideFragment::class.java).
                add( "",ThirdSlideFragment::class.java).add( "",FourthSlideFragment::class.java)
                .create()
        )
        binding.viewpager.adapter=adapter
        binding.textviewToAnimate.setupWithViewPager(binding.viewpager,true)

        binding.viewpager.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {}
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

                if(position==3){
                    openFragmentReplaceNoAnim(R.id.authContainer, LoginFragment(), "", true)
                }
            }

            override fun onPageSelected(position: Int) {
                // Check if this is the page you want.
            }
        })

    }
}