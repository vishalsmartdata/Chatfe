package com.sdei.chafte.ui.home.profile

import android.Manifest
import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.provider.Settings
import android.util.Log
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.FileProvider
import androidx.exifinterface.media.ExifInterface
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.DexterError
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentChangePasswordBinding
import com.sdei.chafte.databinding.FragmentProfileBinding
import com.sdei.chafte.model.DrinkModel
import com.sdei.chafte.model.FriendsArr
import com.sdei.chafte.model.RegistrationReponseData
import com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordActivity
import com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM
import com.sdei.chafte.ui.authentication.forgot_password.PasswordChangedFragment
import com.sdei.chafte.ui.authentication.registration.CompleteRegistrationActivity
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.ui.home.HomeVM
import com.sdei.chafte.ui.home.edit_profile.AboutEditActivity
import com.sdei.chafte.ui.home.setting.friendlist.FriendListActivity
import com.sdei.chafte.utils.*
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import com.squareup.picasso.Picasso
import java.io.File
import java.io.IOException
import java.time.LocalDate
import java.time.Period
import android.os.Parcelable
import com.sdei.chafte.ui.home.setting.my_events.ViewUserProfileActivity


class ProfileFragment: BaseFragment<FragmentProfileBinding, ProfileVM>(), RecyclerCallback {
    override val layoutId: Int
        get() = R.layout.fragment_profile
    override var viewModel: ProfileVM
        get() = setUpVM(activity as HomeActivity, ProfileVM(baseActivity.application,baseActivity.getData(SessionManager.AUTHENTICATION)))
        set(value) {}
    override var binding: FragmentProfileBinding
        get() = setUpBinding()
        set(value) {}

    val bindingList = RecyclerBindingList<DrinkModel>()
    val bindingFriendListList = RecyclerBindingList<FriendsArr>()

    var arrayList = ArrayList<DrinkModel>()
    var friendListArrayList = ArrayList<FriendsArr>()

    var PICK_IMAGE_MULTIPLE = 111
    val REQUEST_TAKE_PHOTO = 1
    var mCompressor: FileCompressor? = null




    override fun bindData() {
        binding.pvm = viewModel
    }

    override fun initListeners() {
        mCompressor = FileCompressor(activity)

        viewModel.tokenObserve()?.observe(this, Observer {
            baseActivity.logout(activity)
        })

        viewModel.observerRegistrationResponse()?.observe (this, Observer {
            Log.e("response_id",""+it)
            baseActivity.saveData(SessionManager.USER_IMAGE,viewModel.imagePath)
            val bundle = Bundle()
            bundle.putString("key", "About")
            navigateActivity(HomeActivity(),bundle)
            baseActivity.finish()
           // openFragmentReplaceNoAnim(R.id.nav_fragment, ProfileFragment(), "", false)
          //  navigateActivity(CompleteRegistrationActivity(),null)
        })

        binding.clLayer.setOnClickListener {
            viewModel.getAllDrink()
        }

        viewModel.observerDrinkResponse()?.observe (this, Observer {
            binding.txDrinkSave.visibility=View.VISIBLE
            binding.imgDrinkEdit.visibility=View.GONE
            binding.recyclerDrink.visibility= View.VISIBLE
            binding.clLayer.visibility= View.GONE
            arrayList.addAll(it)
            arrayList.forEachIndexed { index, element ->
                if(element.drinkName.equals(binding.txDrinkName.text.toString())){
                    arrayList[index].isSelected=true
                }else{
                    arrayList[index].isSelected=false
                }
            }
            bindingList.itemsList = arrayList
            binding?.list = bindingList
            binding?.click = this
            Log.e("drinkData",""+it.size)
        })

        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })

        viewModel.observerMyProfileResponse()?.observe (this, Observer {
            Log.e("response_id",""+it._id)
            friendListArrayList.clear()
            friendListArrayList.addAll(it.friendsArr)
            bindingFriendListList.itemsList = friendListArrayList
            binding?.friendlist = bindingFriendListList
            binding?.click = this

            if(friendListArrayList.size==0){
                binding.txFriends.visibility=View.GONE
                binding.txViewFriends.visibility=View.GONE
            }

            Picasso.get()
                .load(it.profileImg.image)
                .error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.imProfile)

            baseActivity.saveData(SessionManager.USER_IMAGE, it.profileImg.image)

            viewModel.imagePath = it.profileImg.image
            if(it.drink!=null) {
                viewModel.drinkObserver.set(it.drink._id)
                Picasso.get()
                    .load(it.drink.image)
                    .error(R.drawable.ic_launcher_background)
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(binding.imageDrink)
                binding.txDrinkName.setText(it.drink.drinkName)
            }
            binding.txUserName.setText(it.username)
            binding.txHeader.setText(it.fname+" "+it.lname)
           // binding.txHeaderLast.setText(it.lname)
            viewModel.firstNameObservable.set(it.fname+" "+it.lname)
           // viewModel.lastNameObservable.set(it.lname)
            if(it.aboutYourself.isNotEmpty() &&  it.aboutYourself.isNotBlank())
            viewModel.aboutYourselfObservable.set(it.aboutYourself)
          //  binding.txAboutText.setText(it.about)

            binding.txInterest.setText(it.dating.datings)
            binding.txIndentify.setText(it.gender.gen)
            binding.txHometown.setText(it.hometown.homeTown)

            if(!it.dob.birthdate.isNullOrBlank()) {
                var select_date = getDateShow(it.dob.birthdate)
                Log.e("selected_date", select_date.toString())
                var date = select_date?.split("-")?.toTypedArray()
                var year = date?.get(2)
                var month = date?.get(1)
                var days = date?.get(0)
                var age = getCalculatedAge(year!!.toInt(), month!!.toInt(), days!!.toInt())
                if (age!!.toInt() <= 0) {
                    age = month
                    binding.txAge.setText(age + " Months")
                } else {
                    binding.txAge.setText(age)
                }
            }

        })

        viewModel.observerImageUploadResponse()?.observe (this, Observer {
            Log.e("image_url",""+it[0])
            viewModel.imagePath=it[0]
            Picasso.get()
                .load(viewModel.imagePath)
                .error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.imProfile)

            viewModel.getUpdateProfile()
        })

        binding.imProfile.setOnClickListener {
           // if(binding.txEditSave.isShown) {
                selectImage()
           // }
        }

        binding.imgEdit.setOnClickListener {
            binding.imgEdit.visibility=View.GONE
            binding.txEditSave.visibility=View.VISIBLE

            binding.txHeader.setFocusable(true);
            binding.txHeader.setFocusableInTouchMode(true);
            binding.txHeader.setClickable(true);
           // binding.txHeader.setPadding(10,5,10,5)
            binding.txHeader.setBackgroundResource(R.drawable.out_blue_border_bg)

            binding.txHeaderLast.setFocusable(true);
            binding.txHeaderLast.setFocusableInTouchMode(true);
            binding.txHeaderLast.setClickable(true);
           // binding.txHeaderLast.setPadding(10,5,10,5)
            binding.txHeaderLast.setBackgroundResource(R.drawable.out_blue_border_bg)

            binding.txAboutText.setBackgroundResource(R.drawable.out_blue_border_bg)
            binding.txAboutText.setFocusable(true);
            binding.txAboutText.setFocusableInTouchMode(true);
            binding.txAboutText.setClickable(true);
        }

        binding.imgAboutEdit.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("hometown", binding.txHometown.text.toString())
            bundle.putString("interesting", binding.txInterest.text.toString())
            bundle.putString("indentify", binding.txIndentify.text.toString())
            navigateActivity(AboutEditActivity(),bundle)
        }

        viewModel.getProfile(baseActivity.getData(SessionManager.AUTHENTICATION))

        binding.txViewFriends.setOnClickListener {
            val resultIntent = Intent(activity, FriendListActivity::class.java)
            resultIntent.putParcelableArrayListExtra("friend_list", friendListArrayList as ArrayList<out Parcelable?>?)
            startActivity(resultIntent)
        }
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
                Toast.makeText(baseActivity.mContext, "Error occurred! ", Toast.LENGTH_SHORT)
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
        val uri = Uri.fromParts("package", activity?.packageName, null)
        intent.data = uri
        startActivityForResult(intent, 101)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        try {
            if (requestCode == PICK_IMAGE_MULTIPLE && resultCode == Activity.RESULT_OK && null != data) {
                val filePathColumn = arrayOf(MediaStore.Images.Media.DATA)
                if (data.data != null) {
                    val mImageUri = data.data
                    val cursor = activity?.contentResolver?.query(
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
                        .into(binding.imProfile)
                    binding.imProfile.visibility=View.VISIBLE
                    viewModel.uploadImage()
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
                    binding.imProfile.visibility=View.VISIBLE
                    binding.imProfile.setImageBitmap(rotatedBitmap);
                    viewModel.uploadImage()
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
       // super.onActivityResult(requestCode, resultCode, data)
    }

    private fun rotateImage(source: Bitmap?, angle: Float ): Bitmap? {
        val matrix = Matrix()
        matrix.postRotate(angle)
        return Bitmap.createBitmap(
            source!!, 0, 0, source.getWidth(), source.getHeight(),
            matrix, true
        )
    }

    override fun onItemClick(view: View?, position: Int) {
        if (view?.id == R.id.clParent) {
            viewModel.drinkObserver.set(arrayList.get(position)._id)
           /* Picasso.get()
                .load(arrayList.get(position).image)
                .error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.imageDrink)*/
               arrayList.forEachIndexed { index, element ->
                if(index==position){
                    arrayList[index].isSelected=true
                }else{
                    arrayList[index].isSelected=false
                }
            }
            bindingList.notifyDataChange()
        }
        if(view?.id== R.id.clFriendList) {
            val bundle = Bundle()
            bundle.putString("user_id", friendListArrayList[position]._id)
            navigateActivity(ViewUserProfileActivity(),bundle)
        }
    }

    override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {

    }

    override fun itemAction(type: String?, position: Int) {

    }
}