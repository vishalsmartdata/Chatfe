package com.sdei.chafte.ui.home.create_event

import android.Manifest
import android.R.attr
import android.app.Activity
import android.app.DatePickerDialog
import android.app.Dialog
import android.content.*
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.CalendarContract
import android.provider.MediaStore
import android.provider.Settings
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.*
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.core.content.FileProvider
import androidx.databinding.DataBindingUtil
import androidx.exifinterface.media.ExifInterface
import androidx.lifecycle.Observer
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.DexterError
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityCreateEventBinding
import com.sdei.chafte.databinding.SelectFriendLayoutBinding
import com.sdei.chafte.model.BottomMenu
import com.sdei.chafte.model.CategoryData
import com.sdei.chafte.model.CreateRoomData
import com.sdei.chafte.model.FriendListData
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import com.squareup.picasso.Picasso
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageView
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import android.R.attr.data
import android.R.attr.data
import com.sdei.chafte.utils.*

class CreateEventActivity : BaseActivity<ActivityCreateEventBinding, CreateEventVm>() , RecyclerCallback {
    override val binding: ActivityCreateEventBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_create_event
    override var viewModel: CreateEventVm
        get() = setUpVM(this, CreateEventVm(application,getIntent().getStringExtra("key"),getData(SessionManager.AUTHENTICATION)))
        set(value) {}
    override val context: Context
        get() = this

    val categorylist = ArrayList<CategoryData>()
    var category_name=""
    val timelist = ArrayList<BottomMenu>()
    private val bindList = RecyclerBindingList<CategoryData>()
    private val bindfriendList = RecyclerBindingList<FriendListData>()
    private val bindSelectedfriendList = RecyclerBindingList<FriendListData>()
    private val bindTimeList = RecyclerBindingList<BottomMenu>()
    var mCompressor: FileCompressor? = null

    var PICK_IMAGE_MULTIPLE = 111
    val REQUEST_TAKE_PHOTO = 1
    var searchArrayList = ArrayList<String>()
    var selected_friend_list= ArrayList<String>()
    lateinit var listbinding: SelectFriendLayoutBinding
    var friendlist=ArrayList<FriendListData>()


    override fun bindData() {
        binding.cvm=viewModel
        /*val menuArray = resources.getStringArray(R.array.menu_array)
        for (i in menuArray.indices) {
            list.add(BottomMenu(menuArray[i]))
        }
        bindList.itemsList = list
        binding.list = bindList
        binding.click = this*/
        viewModel.observerMyEventDetailResponse()?.observe (this, Observer {
            var roomdetail=it.roomData
            Log.e("response_id",""+roomdetail._id)
            Picasso.get()
                //  .load(url)
                .load(roomdetail.image)
                .error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.imgEvent)

            binding.imgEvent.visibility= View.VISIBLE
            binding.edRoomName.setText(roomdetail.roomName)
            binding.edAbout.setText(roomdetail.about)

            val date = getLocalToUTCTimezoneString(roomdetail.startDate)
            try {
                val inputDate = SimpleDateFormat("yyyy-MM-ddhh:mma").parse(date)
                val format = SimpleDateFormat("MM/dd/yyyy").format(inputDate)
                viewModel.dateObserver.set(format)
                binding.txDateSelected.setText(format)
            }catch (e: Exception){
                Log.e("testdate",e.message.toString())
            }
            binding.txRoom.setText(getString(R.string.private_room))
            viewModel.imagePath= roomdetail.image
            viewModel.durationObserver.set(roomdetail.duration.toString())

            val duration = resources.getStringArray(R.array.duration)
            val adapter = ArrayAdapter(this, R.layout.spinner_item, duration)
            val spinnerPosition: Int = adapter.getPosition(roomdetail.duration.toInt().toString())
            binding.spDuration.setSelection(spinnerPosition)

            for (i in timelist.indices) {
                if(setDateInterval(roomdetail.startDate).equals(timelist[i].title)){
                    timelist[i].selected = true
                }else {
                    timelist[i].selected = false
                }
            }
            bindTimeList.notifyDataChange()
            viewModel.start_time= setDateInterval(roomdetail.startDate)!!

            for (i in categorylist.indices){
                if(roomdetail.categoryId.equals(categorylist[i]._id)){
                    categorylist[i].selected=true
                }else {
                    categorylist[i].selected=false
                }
            }
            bindList.notifyDataChange()
            viewModel.selected_category_id = roomdetail.categoryId
            if(roomdetail.roomClass.equals("Chat")){
                binding.rbChat.isChecked=true
            }else{
                binding.rbWatchPart.isChecked=true
            }

            binding.txInvite.visibility=View.VISIBLE
            binding.txInviteFriend.visibility=View.VISIBLE
            binding.txByEmail.visibility=View.VISIBLE
            binding.edEmails.visibility=View.VISIBLE

            binding.edEmails.setText(it.resultMail)
             selected_friend_list=it.resultFriend

         //   listbinding.txSelectFriend.setText( selected_friend_list.size.toString()+" Selected")

            var totalfriendlist = viewModel.friendlistlist

            selected_friend_list.forEachIndexed { index, selected_item ->
                totalfriendlist.forEachIndexed { friend_index, friend_item ->
                    if (friend_item._id.equals(selected_item)) {
                        friendlist.add(totalfriendlist[friend_index])

                    }
                }
            }

            bindSelectedfriendList.itemsList =friendlist
            binding?.friendlist = bindSelectedfriendList
            binding?.click = this

            setFriendInvite(false)
        })

        viewModel.tokenObserve()?.observe(this, Observer {
            logout(mContext)
        })

        val timeMenuArray = resources.getStringArray(R.array.time_array)
        for (i in timeMenuArray.indices) {
            timelist.add(BottomMenu(timeMenuArray[i]))
        }
        bindTimeList.itemsList = timelist
        binding.timelist = bindTimeList
        binding.click = this

        val duration = resources.getStringArray(R.array.new_duration)
        val adapter = ArrayAdapter(this, R.layout.spinner_item, duration)
        binding.spDuration.adapter = adapter

        viewModel.getAllCategory()
    }

    override fun initListeners() {

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    showProgress()
                false ->   hideProgress()
            }
        })

        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })


        /* binding.spDuration.setSelection(1)
         binding.spDuration.isEnabled = false
         binding.spDuration.isClickable = false
         viewModel.durationObserver.set("0.5")*/
        binding.rgType.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener {arg0, selectedId ->
            var selectedId = selectedId
            selectedId = binding.rgType.getCheckedRadioButtonId()
            val genderchoosed = findViewById<View>(selectedId) as RadioButton
            val text = genderchoosed.text.toString()
            if(text.equals("Chat")) {
                binding.spDuration.isEnabled = false
                binding.spDuration.isClickable = false
                viewModel.durationObserver.set("0.5")
                binding.spDuration.setSelection(1)
                viewModel.room_type="Chat"
            }
            else{
                binding.spDuration.isEnabled = true
                binding.spDuration.isClickable = true
                viewModel.room_type="Watch Party"
            }
        })

        mCompressor = FileCompressor(this)

        binding.imgCancel.setOnClickListener {
            finish()
        }
        binding.txRoom.setText(getIntent().getStringExtra("key")+" Room")

        if(getIntent().getStringExtra("key").equals("Private")) {
            binding.txInvite.visibility=View.VISIBLE
            binding.txInviteFriend.visibility=View.VISIBLE
            binding.txByEmail.visibility=View.VISIBLE
            binding.edEmails.visibility=View.VISIBLE
        }

        viewModel.observerImageUploadResponse()?.observe (this, Observer {
            Log.e("image_url",""+it[0])
            viewModel.imagePath=it[0]
        })

        binding.txUploadImage.setOnClickListener {
            selectImage()
        }

        val diff_duration_array = resources.getStringArray(R.array.duration)
        binding.spDuration.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, pos: Int, id: Long) {
                var item = parent.getItemAtPosition(pos).toString()
                viewModel.durationObserver.set(diff_duration_array.get(pos))
                viewModel.durationposition.set(pos)
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        })

        viewModel.observerCreateRoom()?.observe (this, Observer {
            Log.e("create_room",""+it)
            showSnackBar(binding.root, getString(R.string.create_room_successfully), false)
            requestCalendarPermission(it)
        })

        viewModel.observerUpdateResponse()?.observe (this, Observer {
            Log.e("update_room",""+it)
            showSnackBar(binding.root, getString(R.string.update_room_successfully), false)
            requestCalendarPermission(it)
        })

        viewModel.observerSearchResponse()?.observe (this, Observer {
            Log.e("search_response",""+it)
            if(it != null ) {
               // searchArrayList.clear()
                it.forEachIndexed { index, item -> searchArrayList.add(item.Title) }
                val adapter: ArrayAdapter<String> =
                    ArrayAdapter<String>(this, android.R.layout.select_dialog_item, searchArrayList)
              //  binding.edRoomName.setThreshold(1);
                binding.edRoomName.setAdapter(adapter);

                binding.edRoomName.setFocusableInTouchMode(true);
                binding.edRoomName.requestFocus()
            }
        })

        binding.txDateSelected.setOnClickListener {
            val calendar= Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)
            val datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener
            { view, year, monthOfYear, dayOfMonth ->
                var date="" +(monthOfYear+1) + "/" + dayOfMonth + "/" + year
                binding.txDateSelected.setText(date)
                viewModel.dateObserver.set(date)
                //showTime(date)
            }, year, month, day)
            datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
            datePickerDialog.show()
        }

        viewModel.observerCategoryResponse()?.observe (this, Observer {
            categorylist.addAll(it)
            bindList.itemsList = categorylist
            binding?.list = bindList
            binding?.click = this
            Log.e("drinkData",""+it.size)
            viewModel.getAllFriend(getData(SessionManager.AUTHENTICATION))
        })

        viewModel.observerFriendListResponse()?.observe (this, Observer {
           viewModel.friendlistlist.clear()
            viewModel.friendlistlist.addAll(it)

            if(getIntent().getStringExtra("room_id")!=null) {
                viewModel.edit_room=true
                viewModel.room_id=getIntent().getStringExtra("room_id")!!
                binding.txSubmit.setText(getString(R.string.edit_room))
                viewModel.getMyRoomDetails(getData(SessionManager.AUTHENTICATION)!!, getIntent().getStringExtra("room_id"))
            }
            Log.e("friendData",""+it.size)
        })


        binding.txInviteFriend.setOnClickListener {
            setFriendInvite(true)
        }

        binding.edRoomName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
               if(s.toString().length >= 3 && (category_name.equals("Movies")|| category_name.equals(""))){
                   viewModel.getIMDBData(getData(SessionManager.AUTHENTICATION),s.toString())
               }
            }
            override fun afterTextChanged(s: Editable) {}
        })

    }

    override fun onItemClick(view: View?, position: Int) {
        if(view?.id== R.id.parentItem){
            for (i in categorylist.indices) {
                if(position==i){
                    categorylist[i].selected=true
                }else {
                    categorylist[i].selected=false
                }
            }
            bindList.notifyDataChange()
            viewModel.selected_category_id = categorylist[position]._id
            category_name=categorylist[position].title
            searchArrayList.clear()
        }
        else if (view?.id == R.id.lnTimeItem) {
            for (i in timelist.indices) {
                if(position==i){
                    timelist[i].selected = true
                }else {
                    timelist[i].selected = false
                }
            }
            bindTimeList.notifyDataChange()
            viewModel.start_time= timelist[position].title
        }
        else if (view?.id == R.id.imgCancel) {
            if(selected_friend_list.contains(friendlist[position]._id))
            {
                selected_friend_list.remove(friendlist[position]._id)
            }
            friendlist.removeAt(position)
            var list=viewModel.friendlistlist
            if(list.size>0) {
                viewModel.friendlistlist[position].isSelected = false
            }
            bindSelectedfriendList.notifyDataChange()
            bindfriendList.notifyDataChange()
        }
        else if (view?.id == R.id.clUserList){
            friendlist.clear()
            var list=viewModel.friendlistlist
            if(list.size>0) {
                if (viewModel.friendlistlist[position].isSelected) {
                    viewModel.friendlistlist[position].isSelected = false
                } else {
                    viewModel.friendlistlist[position].isSelected = true
                }
            }
            bindfriendList.notifyDataChange()
            var selectfriend= 0
            viewModel.friendlistlist.forEachIndexed { index, item ->
                if(item.isSelected){
                    selectfriend=selectfriend+1
                    friendlist.add(item)
                }
            }
            listbinding.txSelectFriend.setText( selectfriend.toString()+" Selected")

            bindSelectedfriendList.itemsList =friendlist
            binding?.friendlist = bindSelectedfriendList
            binding?.click = this
        }
    }

    override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {

    }

    override fun itemAction(type: String?, position: Int) {

    }

    private fun selectImage() {
        val items = arrayOf<CharSequence>(
            getString(R.string.take_photo),
            getString(R.string.choose_from_library),
            "Cancel"
        )
        val ctw = ContextThemeWrapper(this, R.style.AppMaterialTheme)
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

    private fun requestCalendarPermission(it: CreateRoomData) {
        Dexter.withActivity(this)
            .withPermissions(
                Manifest.permission.READ_CALENDAR,
                Manifest.permission.WRITE_CALENDAR,
            )
            .withListener(object : MultiplePermissionsListener {
                override fun onPermissionsChecked(report: MultiplePermissionsReport){
                    // check if all permissions are granted
                    if (report.areAllPermissionsGranted()) {
                        var startTime = getCalFromUTCTimezoneString(it.startDate)
                        var endTime = getCalFromUTCTimezoneString(it.endDate)
                        /*if(!it.duration.toString().contains(".")) {
                            endTime.add(Calendar.HOUR_OF_DAY, it.duration.toInt())
                        }
                        else {
                            var hours = it.duration - 0.5
                            endTime.add(Calendar.HOUR_OF_DAY, hours.toInt())
                            endTime.add(Calendar.MINUTE, 30)
                        }*/
                     //   endTime.add(Calendar.HOUR_OF_DAY, it.duration)

                        val cr: ContentResolver =mContext.getContentResolver()
                        val timeZone = TimeZone.getDefault()
                        val values = ContentValues().apply {
                            put(CalendarContract.Events.DTSTART, startTime?.timeInMillis)
                            put(CalendarContract.Events.DTEND, endTime?.timeInMillis)
                            put(CalendarContract.Events.TITLE, it.roomName)
                            put(CalendarContract.Events.DESCRIPTION, it.about)
                            put(CalendarContract.Events.CALENDAR_ID, 1)
                            put(CalendarContract.Events.EVENT_TIMEZONE, timeZone.id)
                        }
                        val uri: Uri? = cr.insert(CalendarContract.Events.CONTENT_URI, values)
                        val eventID: Long = uri?.lastPathSegment!!.toLong()
                        Log.e("eventID",eventID.toString())

                        val bundle = Bundle()
                        bundle.putString("key", "login")
                        navigateActivity(HomeActivity(),bundle)
                        finish()
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
                Toast.makeText(baseContext, "Error occurred! ", Toast.LENGTH_SHORT)
                    .show()
            }
            .onSameThread()
            .check()
    }

    private fun requestStoragePermission(isCamera: Boolean) {
        Dexter.withActivity(this)
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
                Toast.makeText(baseContext, "Error occurred! ", Toast.LENGTH_SHORT)
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
        val dir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)
        dir.mkdirs()
        val fileName = java.lang.Long.toString(System.currentTimeMillis()) + ".jpg"
        viewModel.mPhotoFile = File(dir, fileName)
        val outputFileUri = FileProvider.getUriForFile(mContext, "com.sdei.chafte.provider", viewModel.mPhotoFile!!)
        intent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri)
        this.startActivityForResult(intent, REQUEST_TAKE_PHOTO)

    }
    private fun showSettingsDialog() {
        val builder =
            AlertDialog.Builder(mContext)
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
        val uri = Uri.fromParts("package", mContext.packageName, null)
        intent.data = uri
        startActivityForResult(intent, 101)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        try {
            if (requestCode == PICK_IMAGE_MULTIPLE && resultCode == Activity.RESULT_OK && null != data) {
                val filePathColumn = arrayOf(MediaStore.Images.Media.DATA)
                if (data.data != null) {
                    val mImageUri = data.data
                    /*val cursor = baseContext.contentResolver.query(
                        mImageUri!!,
                        filePathColumn, null, null, null
                    )
                    Log.e("Uri", "" + mImageUri.toString())*/
                    /*val realPath: String =
                        ImageFilepath.getPath(this, mImageUri)
                    viewModel.mPhotoFile = File(realPath)*/

                    CropImage.activity(mImageUri)
                        .start(this);

                    /*Picasso.get()
                        .load( viewModel.mPhotoFile!!)
                        .error(R.drawable.ic_launcher_background)
                        .placeholder(R.drawable.ic_default_avatar)
                        .into(binding.imgEvent)
                    binding.imgEvent.visibility=View.VISIBLE
                    viewModel.uploadImage()*/
                }
            } else if(requestCode == REQUEST_TAKE_PHOTO && resultCode == Activity.RESULT_OK ) {
                try {

                   // viewModel.mPhotoFile = mCompressor?.compressToFile(viewModel.mPhotoFile)
                    val outputFileUri = Uri.fromFile(mCompressor?.compressToFile(viewModel.mPhotoFile))
                    CropImage.activity(outputFileUri)
                        .start(this);

                 /*   val ei = ExifInterface(viewModel.mPhotoFile!!.path)
                    val orientation: Int = ei.getAttributeInt(
                        ExifInterface.TAG_ORIENTATION,
                        ExifInterface.ORIENTATION_UNDEFINED
                    )

                    val bmOptions: BitmapFactory.Options = BitmapFactory.Options()
                    var bitmap: Bitmap? =
                        BitmapFactory.decodeFile(viewModel.mPhotoFile!!.getAbsolutePath(), bmOptions)
                    *//*bitmap = Bitmap.createScaledBitmap(
                        bitmap!!,
                        parent.getWidth(),
                        parent.getHeight(),
                        true
                    )*//*
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
                    }*/

                   /* binding.imgEvent.visibility=View.VISIBLE
                    binding.imgEvent.setImageBitmap(rotatedBitmap);

                    *//*CropImage.activity(rotatedBitmap)
                        .start(this);*//*

                    viewModel.uploadImage()*/
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
           else if (requestCode === CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
                val result = CropImage.getActivityResult(data)
                if (resultCode === RESULT_OK) {
                    val resultUri = result.uri

                    binding.imgEvent.visibility=View.VISIBLE
                    Picasso.get()
                        .load( resultUri)
                        .error(R.drawable.ic_launcher_background)
                        .placeholder(R.drawable.ic_default_avatar)
                        .into(binding.imgEvent)
                    binding.imgEvent.visibility=View.VISIBLE

                    val realPath: String =
                        ImageFilepath.getPath(this, resultUri)
                    viewModel.mPhotoFile = File(realPath)

                    viewModel.uploadImage()

                } else if (resultCode === CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                    val error = result.error
                }
            }
        } catch (e: Exception) {
            Log.e("exception", e.message.toString() + " ")
            //  Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show()
        }
          super.onActivityResult(requestCode, resultCode, data)
    }

    private fun rotateImage(source: Bitmap?, angle: Float ): Bitmap? {
        val matrix = Matrix()
        matrix.postRotate(angle)
        return Bitmap.createBitmap(
            source!!, 0, 0, source.getWidth(), source.getHeight(),
            matrix, true
        )
    }

    private fun setFriendInvite(showDislog: Boolean) {
         listbinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.select_friend_layout, null, false)
        listbinding?.fvm = viewModel
        var totalfriendlist = viewModel.friendlistlist
        var selectfriend= 0
        selected_friend_list.forEachIndexed { index, selected_item ->
            totalfriendlist.forEachIndexed { friend_index, friend_item ->
                if (friend_item._id.equals(selected_item)) {
                    totalfriendlist.get(friend_index).isSelected=true
                }
            }
        }

        totalfriendlist.forEachIndexed { index, item ->
            if(item.isSelected){
                selectfriend=selectfriend+1
            }
        }
        listbinding.txSelectFriend.setText( selectfriend.toString()+" Selected")

        bindfriendList.itemsList =totalfriendlist
        listbinding?.list = bindfriendList
        listbinding?.click = this
        var selectRoomDialog = Dialog(this, R.style.DialogTheme)
        selectRoomDialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        selectRoomDialog?.setContentView(listbinding.getRoot())
        selectRoomDialog?.window!!.setGravity(Gravity.TOP)
        selectRoomDialog?.window!!.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT
        )
        listbinding.imgCancel.setOnClickListener {
            selectRoomDialog.dismiss()
        }

        selectRoomDialog?.window!!.setBackgroundDrawableResource(R.color.white)
        if(showDislog) {
            selectRoomDialog.show()
        }
    }
}