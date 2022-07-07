package com.sdei.chafte.ui.authentication.registration

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentLoginBinding
import com.sdei.chafte.databinding.FragmentOtpForgotPasswordBinding
import com.sdei.chafte.databinding.FragmentOtpForgotPasswordRegistrationBinding
import com.sdei.chafte.ui.authentication.login.LoginVM
import com.sdei.chafte.ui.authentication.registration.RegistrationActivity
import com.sdei.chafte.utils.base.BaseFragment

class RegistrationOTPVerificationFragment : BaseFragment<FragmentOtpForgotPasswordRegistrationBinding, RegistrationVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_otp_forgot_password_registration
    override var viewModel: RegistrationVM
        get() = setUpVM(activity as RegistrationActivity, RegistrationVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentOtpForgotPasswordRegistrationBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {

        binding.vm = viewModel

        viewModel.observerVerifyOtpResponse()?.observe (this, Observer {
            Log.e("otp_response",""+it)
            viewModel.buttonClickForNext(3)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })
        binding.edFirstDigit.addTextChangedListener(GenericTextWatcher(binding.edFirstDigit, binding.edSecondDigit))
        binding.edSecondDigit.addTextChangedListener(GenericTextWatcher(binding.edSecondDigit, binding.edthirdDigit))
        binding.edthirdDigit.addTextChangedListener(GenericTextWatcher( binding.edthirdDigit,  binding.edfourthDigit))
        binding.edfourthDigit.addTextChangedListener(GenericTextWatcher(binding.edfourthDigit, null))

        binding.edFirstDigit.setOnKeyListener(GenericKeyEvent(binding.edFirstDigit, null))
        binding.edSecondDigit.setOnKeyListener(GenericKeyEvent(binding.edSecondDigit, binding.edFirstDigit))
        binding.edthirdDigit.setOnKeyListener(GenericKeyEvent( binding.edthirdDigit, binding.edSecondDigit))
        binding.edfourthDigit.setOnKeyListener(GenericKeyEvent(binding.edfourthDigit, binding.edthirdDigit))

    }

    override fun initListeners() {

    }
}

class GenericKeyEvent internal constructor(private val currentView: EditText, private val previousView: EditText?) : View.OnKeyListener{
    override fun onKey(p0: View?, keyCode: Int, event: KeyEvent?): Boolean {
        if(event!!.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_DEL && currentView.id != R.id.edFirstDigit && currentView.text.isEmpty()) {
            //If current is empty then previous EditText's number will also be deleted
            previousView!!.text = null
            previousView.requestFocus()
            return true
        }
        return false
    }

}

class GenericTextWatcher internal constructor(private val currentView: View, private val nextView: View?) : TextWatcher {
    override fun afterTextChanged(editable: Editable) { // TODO Auto-generated method stub
        val text = editable.toString()
        when (currentView.id) {
            R.id.edFirstDigit -> if (text.length == 1) nextView!!.requestFocus()
            R.id.edSecondDigit -> if (text.length == 1) nextView!!.requestFocus()
            R.id.edthirdDigit -> if (text.length == 1) nextView!!.requestFocus()
            //You can use EditText4 same as above to hide the keyboard
        }
    }

    override fun beforeTextChanged(
        arg0: CharSequence,
        arg1: Int,
        arg2: Int,
        arg3: Int
    ) { // TODO Auto-generated method stub
    }

    override fun onTextChanged(
        arg0: CharSequence,
        arg1: Int,
        arg2: Int,
        arg3: Int
    ) { // TODO Auto-generated method stub
    }

}