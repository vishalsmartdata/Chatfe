package com.sdei.chafte.ui.authentication.registration

import android.app.DatePickerDialog
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentLoginBinding
import com.sdei.chafte.databinding.FragmentRegistrationFirstpageBinding
import com.sdei.chafte.databinding.FragmentRegistrationSecondpageBinding
import com.sdei.chafte.ui.authentication.login.LoginVM
import com.sdei.chafte.utils.base.BaseFragment
import java.util.*

class RegistrationDateOfBirthFragment :  BaseFragment<FragmentRegistrationSecondpageBinding, RegistrationVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_registration_secondpage
    override var viewModel: RegistrationVM
        get() = setUpVM(activity as RegistrationActivity, RegistrationVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentRegistrationSecondpageBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {

        binding.vm = viewModel

    }

    override fun initListeners() {

        val calendar= Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        binding.edBirth.setOnClickListener {
            val datePickerDialog = DatePickerDialog(requireContext(), DatePickerDialog.OnDateSetListener
            { view, year, monthOfYear, dayOfMonth ->
                binding.edBirth.setText("" + (monthOfYear+1) + "/" + dayOfMonth + "/" + year)
            }, year, month, day)
            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis() - 1000);
            datePickerDialog.show()
        }
    }
}