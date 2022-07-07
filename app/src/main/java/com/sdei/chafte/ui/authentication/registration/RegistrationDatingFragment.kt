package com.sdei.chafte.ui.authentication.registration

import android.widget.TextView
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentRegistrationAfterFouthPageBinding
import com.sdei.chafte.databinding.FragmentRegistrationFirstpageBinding
import com.sdei.chafte.utils.base.BaseFragment

class RegistrationDatingFragment: BaseFragment<FragmentRegistrationAfterFouthPageBinding, RegistrationVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_registration_after_fouth_page
    override var viewModel: RegistrationVM
        get() = setUpVM(activity as RegistrationActivity, RegistrationVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentRegistrationAfterFouthPageBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {

        binding.vm = viewModel
        binding.txYes.setOnClickListener {
            viewModel.interestedDatingObserver.set("Yes")
            changeTextAndBackground( binding.txYes,binding.txNO,binding.txOther)
        }
        binding.txNO.setOnClickListener {
            viewModel.interestedDatingObserver.set("No")
            changeTextAndBackground( binding.txNO,binding.txYes,binding.txOther)
        }
        binding.txOther.setOnClickListener {
            viewModel.interestedDatingObserver.set("other")
            changeTextAndBackground( binding.txOther,binding.txYes,binding.txNO)
        }

        viewModel.interestedDatingObserver.get()?.let {
            if(it.equals("Yes")){
                changeTextAndBackground( binding.txYes,binding.txNO,binding.txOther)
            }else if(it.equals("No")){
                changeTextAndBackground( binding.txNO,binding.txYes,binding.txOther)
            }else if(it.equals("other")){
                changeTextAndBackground( binding.txOther,binding.txYes,binding.txNO)
            }
        }

    }

    override fun initListeners() {


    }

    fun changeTextAndBackground(
        txChange: TextView,
        txNotChangefirst: TextView,
        txNotChangeSecond: TextView
    ) {
        txChange.setBackgroundResource(R.drawable.button_bg);
        txChange.setTextColor(resources.getColor(R.color.white))

        txNotChangefirst.setBackgroundResource(R.drawable.outborder_bg);
        txNotChangefirst.setTextColor(resources.getColor(R.color.black));

        txNotChangeSecond.setBackgroundResource(R.drawable.outborder_bg);
        txNotChangeSecond.setTextColor(resources.getColor(R.color.black))
    }
}