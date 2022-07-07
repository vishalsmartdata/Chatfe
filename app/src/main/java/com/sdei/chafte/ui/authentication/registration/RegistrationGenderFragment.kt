package com.sdei.chafte.ui.authentication.registration

import android.view.View
import android.widget.TextView
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentRegistrationThirdpageBinding
import com.sdei.chafte.utils.base.BaseFragment

class RegistrationGenderFragment  : BaseFragment<FragmentRegistrationThirdpageBinding, RegistrationVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_registration_thirdpage
    override var viewModel: RegistrationVM
        get() = setUpVM(activity as RegistrationActivity, RegistrationVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentRegistrationThirdpageBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {
        binding.vm = viewModel
        binding.txMale.setOnClickListener {
            viewModel.genderObservers.set("Male")
            changeTextAndBackground( binding.txMale,binding.txFemale,binding.txTransgenderFemale,
            binding.txTransgenderMale,binding.txVariant,binding.txNotListed,binding.txPreferNotAnswer)
        }
        binding.txFemale.setOnClickListener {
            viewModel.genderObservers.set("Female")
            changeTextAndBackground(
                binding.txFemale,
                binding.txMale,
                binding.txTransgenderFemale,
                binding.txTransgenderMale,
                binding.txVariant,
                binding.txNotListed,
                binding.txPreferNotAnswer
            )
        }
        binding.txTransgenderFemale.setOnClickListener {
            viewModel.genderObservers.set("Transgender Female")
            changeTextAndBackground(
                binding.txTransgenderFemale,
                binding.txMale,
                binding.txFemale,
                binding.txTransgenderMale,
                binding.txVariant,
                binding.txNotListed,
                binding.txPreferNotAnswer
            )
        }
        binding.txTransgenderMale.setOnClickListener {
            viewModel.genderObservers.set("Transgender Male")
            changeTextAndBackground(
                binding.txTransgenderMale,
                binding.txMale,
                binding.txFemale,
                binding.txTransgenderFemale,
                binding.txVariant,
                binding.txNotListed,
                binding.txPreferNotAnswer
            )
        }
        binding.txVariant.setOnClickListener {
            viewModel.genderObservers.set("Gender Variant/Non-Conforming")
            changeTextAndBackground(
                binding.txVariant,
                binding.txMale,
                binding.txFemale,
                binding.txTransgenderFemale,
                binding.txTransgenderMale,
                binding.txNotListed,
                binding.txPreferNotAnswer
            )
        }
        binding.txNotListed.setOnClickListener {
            viewModel.genderObservers.set("Not Listed")
            changeTextAndBackground(
                binding.txNotListed,
                binding.txMale,
                binding.txFemale,
                binding.txTransgenderFemale,
                binding.txTransgenderMale,
                binding.txVariant,
                binding.txPreferNotAnswer
            )
        }
        binding.txPreferNotAnswer.setOnClickListener {
            viewModel.genderObservers.set("Prefer Not to Answer")
            changeTextAndBackground(
                binding.txPreferNotAnswer,
                binding.txMale,
                binding.txFemale,
                binding.txTransgenderFemale,
                binding.txTransgenderMale,
                binding.txVariant,
                binding.txNotListed
            )
        }

        viewModel.genderObservers.get()?.let {
            if(it.equals("Male")){
                changeTextAndBackground(
                    binding.txMale,
                    binding.txFemale,
                    binding.txTransgenderFemale,
                    binding.txTransgenderMale,
                    binding.txVariant,
                    binding.txNotListed,
                    binding.txPreferNotAnswer
                )
            }else if(it.equals("Female")){
                changeTextAndBackground(
                    binding.txFemale,
                    binding.txMale,
                    binding.txTransgenderFemale,
                    binding.txTransgenderMale,
                    binding.txVariant,
                    binding.txNotListed,
                    binding.txPreferNotAnswer
                )
            }else if(it.equals("Transgender Female")){
                changeTextAndBackground(
                    binding.txTransgenderFemale,
                    binding.txMale,
                    binding.txFemale,
                    binding.txTransgenderMale,
                    binding.txVariant,
                    binding.txNotListed,
                    binding.txPreferNotAnswer
                )
            }else if(it.equals("Transgender Male")){
                changeTextAndBackground(
                    binding.txTransgenderMale,
                    binding.txMale,
                    binding.txFemale,
                    binding.txTransgenderFemale,
                    binding.txVariant,
                    binding.txNotListed,
                    binding.txPreferNotAnswer
                )
            }else if(it.equals("Gender Variant/Non-Conforming")){
                changeTextAndBackground(
                    binding.txVariant,
                    binding.txMale,
                    binding.txFemale,
                    binding.txTransgenderFemale,
                    binding.txTransgenderMale,
                    binding.txNotListed,
                    binding.txPreferNotAnswer
                )
            }else if(it.equals("Not Listed")){
                changeTextAndBackground(
                    binding.txNotListed,
                    binding.txMale,
                    binding.txFemale,
                    binding.txTransgenderFemale,
                    binding.txTransgenderMale,
                    binding.txVariant,
                    binding.txPreferNotAnswer
                )
            }else if(it.equals("Prefer Not to Answer")){
                changeTextAndBackground(
                    binding.txPreferNotAnswer,
                    binding.txMale,
                    binding.txFemale,
                    binding.txTransgenderFemale,
                    binding.txTransgenderMale,
                    binding.txVariant,
                    binding.txNotListed
                )
            }
        }
    }

    override fun initListeners() {

    }

    fun changeTextAndBackground(
        txChange: TextView,
        txNotChangefirst: TextView,
        txNotChangeSecond: TextView,
        txTransgenderMale: TextView,
        txVariant: TextView,
        txNotListed: TextView,
        txPreferNotAnswer: TextView
    ) {
        txChange.setBackgroundResource(R.drawable.button_bg);
        txChange.setTextColor(resources.getColor(R.color.white))

        txNotChangefirst.setBackgroundResource(R.drawable.outborder_bg);
        txNotChangefirst.setTextColor(resources.getColor(R.color.black));

        txNotChangeSecond.setBackgroundResource(R.drawable.outborder_bg);
        txNotChangeSecond.setTextColor(resources.getColor(R.color.black))

        txTransgenderMale.setBackgroundResource(R.drawable.outborder_bg);
        txTransgenderMale.setTextColor(resources.getColor(R.color.black))

        txVariant.setBackgroundResource(R.drawable.outborder_bg);
        txVariant.setTextColor(resources.getColor(R.color.black))

        txNotListed.setBackgroundResource(R.drawable.outborder_bg);
        txNotListed.setTextColor(resources.getColor(R.color.black))

        txPreferNotAnswer.setBackgroundResource(R.drawable.outborder_bg);
        txPreferNotAnswer.setTextColor(resources.getColor(R.color.black))

        viewModel.genderObservers.get()?.let {
            if(it.equals("Not Listed")){
                binding.edNotListed.visibility= View.VISIBLE
            }else{
                binding.edNotListed.visibility= View.GONE
                viewModel.notListedObservers.set("")
            }
        }
    }
}