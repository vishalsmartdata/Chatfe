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
import androidx.core.app.ActivityCompat.startActivityForResult
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
import com.sdei.chafte.databinding.FragmentLoginBinding
import com.sdei.chafte.databinding.FragmentRegistrationFifthBinding
import com.sdei.chafte.databinding.FragmentRegistrationFouthpageBinding
import com.sdei.chafte.ui.authentication.login.LoginVM
import com.sdei.chafte.utils.FileCompressor
import com.sdei.chafte.utils.ImageFilepath
import com.sdei.chafte.utils.base.BaseFragment
import com.squareup.picasso.Picasso
import java.io.File
import java.io.IOException

class RegistrationProfilePictureFragment  : BaseFragment<FragmentRegistrationFifthBinding, RegistrationVM>() {
    override val layoutId: Int
        get() = R.layout.fragment_registration_fifth
    override var viewModel: RegistrationVM
        get() = setUpVM(activity as RegistrationActivity, RegistrationVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentRegistrationFifthBinding
        get() = setUpBinding()
        set(value) {}

    override fun bindData() {
        binding.vm = viewModel
    }

    var PICK_IMAGE_MULTIPLE = 111
    val REQUEST_TAKE_PHOTO = 1

    var mCompressor: FileCompressor? = null

    override fun initListeners() {
        mCompressor = FileCompressor(activity)
        binding.imageProfile.setOnClickListener { selectImage() }
        if(viewModel.imagePath.isNotEmpty()){
            Picasso.get()
                //  .load(url)
                .load(viewModel.imagePath)
                .error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.imageProfile)
        }

        viewModel.observerImageUploadResponse()?.observe (this, Observer {
            Log.e("image_url",""+it[0])
            viewModel.imagePath=it[0]
            viewModel.buttonClickForNext(8)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })
    }

    private fun selectImage() {
        val items = arrayOf<CharSequence>(
            getString(R.string.take_photo),
            getString(R.string.choose_from_library),
            "Cancel"
        )
        val ctw = ContextThemeWrapper(activity, R.style.AppMaterialTheme)
        val builder = AlertDialog.Builder(ctw)
        builder.setTitle(getString(R.string.take_photo))
        builder.setItems(items) { dialog, item ->
            if (items[item] == getString(R.string.take_photo)) {
                requestStoragePermission(true)
            } else if (items[item] == getString(R.string.choose_from_library)) {
                requestStoragePermission(false)
            } else if (items[item] == getString(R.string.cancel)) {
                dialog.dismiss()
            }
        }
        builder.show()
    }

    private fun requestStoragePermission(isCamera: Boolean) {
        Dexter.withActivity(activity)
            .withPermissions(
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA
            )
            .withListener(object : MultiplePermissionsListener {
                override fun onPermissionsChecked(report: MultiplePermissionsReport) {
                    // check if all permissions are granted
                    if (report.areAllPermissionsGranted()) {
                        if (isCamera) {
                            dispatchTakePictureIntent()
                        } else {
                            openGallery()
                        }
                    }
                    if (report.isAnyPermissionPermanentlyDenied) {
                        showSettingsDialog()
                    }
                }

                override fun onPermissionRationaleShouldBeShown(
                    permissions: List<PermissionRequest>,
                    token: PermissionToken
                ) {
                    token.continuePermissionRequest()
                }
            })
            .withErrorListener { error: DexterError? ->
                Toast.makeText(baseActivity.applicationContext, "Error occurred! ", Toast.LENGTH_SHORT)
                    .show()
            }
            .onSameThread()
            .check()
    }

    private fun openGallery() {
        val intent = Intent()
        intent.type = "image/*"
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true)
        intent.action = Intent.ACTION_GET_CONTENT
        this.startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_MULTIPLE)
    }

    private fun dispatchTakePictureIntent() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        val dir =
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)
        dir.mkdirs()
        val fileName = java.lang.Long.toString(System.currentTimeMillis()) + ".jpg"
        viewModel.mPhotoFile = File(dir, fileName)
        val outputFileUri = FileProvider.getUriForFile(baseActivity.mContext, "com.sdei.chafte.provider", viewModel.mPhotoFile!!)
        intent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri)
        this.startActivityForResult(intent, REQUEST_TAKE_PHOTO)
    }
    private fun showSettingsDialog() {
        val builder =
            AlertDialog.Builder(baseActivity.mContext)
        builder.setTitle("Need Permissions")
        builder.setMessage(
            "This app needs permission to use this feature. You can grant them in app settings."
        )
        builder.setPositiveButton(
            "GOTO SETTINGS"
        ) { dialog: DialogInterface, which: Int ->
            dialog.cancel()
            openSettings()
        }
        builder.setNegativeButton(
            "Cancel"
        ) { dialog: DialogInterface, which: Int -> dialog.cancel() }
        builder.show()
    }

    private fun openSettings() {
        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
        val uri = Uri.fromParts("package", baseActivity.mContext.packageName, null)
        intent.data = uri
        startActivityForResult(intent, 101)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        try {
            if (requestCode == PICK_IMAGE_MULTIPLE && resultCode == Activity.RESULT_OK && null != data) {
                val filePathColumn = arrayOf(MediaStore.Images.Media.DATA)
                if (data.data != null) {
                    val mImageUri = data.data
                    val cursor = baseActivity.mContext.contentResolver.query(
                        mImageUri!!,
                        filePathColumn, null, null, null
                    )
                    Log.e("Uri", "" + mImageUri.toString())
                    val realPath: String =
                        ImageFilepath.getPath(activity, mImageUri)
                    viewModel.mPhotoFile = File(realPath)
                    Picasso.get()
                        .load( viewModel.mPhotoFile!!)
                        .error(R.drawable.ic_launcher_background)
                        .placeholder(R.drawable.ic_default_avatar)
                        .into(binding.imageProfile)
                }
            } else  {
                try {
                    viewModel.mPhotoFile = mCompressor?.compressToFile(viewModel.mPhotoFile)

                    val ei = ExifInterface(viewModel.mPhotoFile!!.path)
                    val orientation: Int = ei.getAttributeInt(
                        ExifInterface.TAG_ORIENTATION,
                        ExifInterface.ORIENTATION_UNDEFINED
                    )

                    val bmOptions: BitmapFactory.Options = BitmapFactory.Options()
                    var bitmap: Bitmap? =
                        BitmapFactory.decodeFile(viewModel.mPhotoFile!!.getAbsolutePath(), bmOptions)
                    /*bitmap = Bitmap.createScaledBitmap(
                        bitmap!!,
                        parent.getWidth(),
                        parent.getHeight(),
                        true
                    )*/
                    var rotatedBitmap: Bitmap? = null
                    when (orientation) {
                        ExifInterface.ORIENTATION_ROTATE_90 -> rotatedBitmap =
                            rotateImage(bitmap, 90F)
                        ExifInterface.ORIENTATION_ROTATE_180 -> rotatedBitmap =
                            rotateImage(bitmap, 180F)
                        ExifInterface.ORIENTATION_ROTATE_270 -> rotatedBitmap =
                            rotateImage(bitmap, 270F)
                        ExifInterface.ORIENTATION_NORMAL -> rotatedBitmap = bitmap
                        else -> rotatedBitmap = bitmap
                    }

                    binding.imageProfile.setImageBitmap(rotatedBitmap);
                    /*  Picasso.get()
                          .load( rotatedBitmap!!)
                          .error(R.drawable.ic_launcher_background)
                          .placeholder(R.drawable.ic_default_avatar)
                          .into(binding.imProfile)*/
                } catch (e: IOException) {
                    e.printStackTrace()
                }
                Log.e("mPhotoFileCamera", viewModel.mPhotoFile!!.exists().toString() + " ")
            }
        } catch (e: Exception) {
            //  Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show()
        }
      //  super.onActivityResult(requestCode, resultCode, data)
    }

    private fun rotateImage(source: Bitmap?, angle: Float ): Bitmap? {
        val matrix = Matrix()
        matrix.postRotate(angle)
        return Bitmap.createBitmap(
            source!!, 0, 0, source.getWidth(), source.getHeight(),
            matrix, true
        )
    }

}