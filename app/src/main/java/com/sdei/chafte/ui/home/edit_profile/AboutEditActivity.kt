package com.sdei.chafte.ui.home.edit_profile

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityAboutEditBinding
import com.sdei.chafte.databinding.ActivityAuthenticationBinding
import com.sdei.chafte.ui.authentication.intro.IntroFragment
import com.sdei.chafte.ui.authentication.login.LoginFragment
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.ui.home.profile.ProfileFragment
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.base.BaseVM
import com.sdei.chafte.utils.checkMyPermission
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager

class AboutEditActivity : BaseActivity<ActivityAboutEditBinding, AboutEditVM>() {
    override val binding: ActivityAboutEditBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_about_edit
    override var viewModel: AboutEditVM
        get() = setUpVM(
            this,
            AboutEditVM(application,getData(SessionManager.AUTHENTICATION))
        )
        set(value) {}
    override val context: Context
        get() = this

    override fun bindData() {
        binding.vm = viewModel
    }

    override fun initListeners() {

        viewModel.observerRegistrationResponse()?.observe (this, Observer {
            Log.e("response_id",""+it)
            val bundle = Bundle()
            bundle.putString("key", "About")
            navigateActivity(HomeActivity(),bundle)
            finish()
        })

        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->   showProgress()
                false ->   hideProgress()
            }
        })

        binding.imageBack.setOnClickListener { finish() }

        viewModel.genderObservers.set(getIntent().getStringExtra("indentify"))
        viewModel.interestedDatingObserver.set(getIntent().getStringExtra("interesting"))
        viewModel.howeTownObserver.set(getIntent().getStringExtra("hometown"))
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
            if(it.equals("Male",ignoreCase = true)){
                changeTextAndBackground(
                    binding.txMale,
                    binding.txFemale,
                    binding.txTransgenderFemale,
                    binding.txTransgenderMale,
                    binding.txVariant,
                    binding.txNotListed,
                    binding.txPreferNotAnswer
                )
            }else if(it.equals("Female",ignoreCase = true)){
                changeTextAndBackground(
                    binding.txFemale,
                    binding.txMale,
                    binding.txTransgenderFemale,
                    binding.txTransgenderMale,
                    binding.txVariant,
                    binding.txNotListed,
                    binding.txPreferNotAnswer
                )
            }else if(it.equals("Transgender Female",ignoreCase = true)){
                changeTextAndBackground(
                    binding.txTransgenderFemale,
                    binding.txMale,
                    binding.txFemale,
                    binding.txTransgenderMale,
                    binding.txVariant,
                    binding.txNotListed,
                    binding.txPreferNotAnswer
                )
            }else if(it.equals("Transgender Male",ignoreCase = true)){
                changeTextAndBackground(
                    binding.txTransgenderMale,
                    binding.txMale,
                    binding.txFemale,
                    binding.txTransgenderFemale,
                    binding.txVariant,
                    binding.txNotListed,
                    binding.txPreferNotAnswer
                )
            }else if(it.equals("Gender Variant/Non-Conforming",ignoreCase = true)){
                changeTextAndBackground(
                    binding.txVariant,
                    binding.txMale,
                    binding.txFemale,
                    binding.txTransgenderFemale,
                    binding.txTransgenderMale,
                    binding.txNotListed,
                    binding.txPreferNotAnswer
                )
            }else if(it.equals("Not Listed",ignoreCase = true)){
                changeTextAndBackground(
                    binding.txNotListed,
                    binding.txMale,
                    binding.txFemale,
                    binding.txTransgenderFemale,
                    binding.txTransgenderMale,
                    binding.txVariant,
                    binding.txPreferNotAnswer
                )
            }else if(it.equals("Prefer Not to Answer",ignoreCase = true)){
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