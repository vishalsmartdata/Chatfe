package com.sdei.chafte.ui.authentication.registration

import android.Manifest
import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.net.Uri
import android.os.Environment
import android.provider.MediaStore
import android.provider.Settings
import android.util.Log
import android.view.ContextThemeWrapper
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.FileProvider
import androidx.exifinterface.media.ExifInterface
import androidx.lifecycle.Observer
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.DexterError
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentRegistrationAfterInsideFouthPageBinding
import com.sdei.chafte.databinding.FragmentRegistrationFirstpageBinding
import com.sdei.chafte.utils.ImageFilepath
import com.sdei.chafte.utils.base.BaseFragment
import com.squareup.picasso.Picasso
import java.io.File
import java.io.IOException

class RegistrationHometownFragment: BaseFragment<FragmentRegistrationAfterInsideFouthPageBinding, RegistrationVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_registration_after_inside_fouth_page
    override var viewModel: RegistrationVM
        get() = setUpVM(activity as RegistrationActivity, RegistrationVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentRegistrationAfterInsideFouthPageBinding
        get() = setUpBinding()
        set(value) {}


    override fun bindData() {

        binding.vm = viewModel

    }

    override fun initListeners() {
        binding.txContinue.setOnClickListener {

        }
    }


}