package com.sdei.chafte.ui.home.message.chat

import android.Manifest
import android.app.Activity
import android.content.*
import android.graphics.Rect
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.CalendarContract
import android.provider.MediaStore
import android.provider.Settings
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.ContextThemeWrapper
import android.view.View
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityChatBinding

import com.sdei.chafte.model.ReceiveMessageModelItem
import com.sdei.chafte.model.ReceiverData
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.chafte.utils.socket.MessageEvent
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.json.JSONArray
import org.json.JSONObject

import android.view.ViewTreeObserver.OnGlobalLayoutListener
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.FileProvider
import com.github.pgreze.reactions.ReactionPopup

import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.DexterError
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import com.sdei.chafte.model.CreateRoomData
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.utils.FileCompressor
import com.sdei.chafte.utils.ImageFilepath
import com.sdei.chafte.utils.getCalendarData
import com.squareup.picasso.Picasso
import com.theartofdev.edmodo.cropper.CropImage

import java.io.File
import java.io.IOException
import java.util.*
import kotlin.collections.ArrayList
import com.github.pgreze.reactions.ReactionsConfigBuilder
import com.sdei.chafte.model.Reaction
import org.json.JSONException


class ChatActivity : BaseActivity<ActivityChatBinding, ChatVm>(), RecyclerCallback {
    override val binding: ActivityChatBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_chat
    override var viewModel: ChatVm
        get() = setUpVM(this, ChatVm(application,initialSocket()))
        set(value) {}
    override val context: Context
        get() = this

    val receiverMessageModelItem = ArrayList<ReceiveMessageModelItem>()
    private val bindList = RecyclerBindingList<ReceiveMessageModelItem>()

    var callgetAllMessage=false
    var callgetChatHeaderId=false
    var PICK_IMAGE_MULTIPLE = 111
    val REQUEST_TAKE_PHOTO = 1
    var mCompressor: FileCompressor? = null


     val strings = arrayOf("U+1F600", "U+1F61C", "U+1F914", "U+1F44B", "U+1F44F", "U+1F44D")

    override fun bindData() {
        binding.cvm = viewModel
        binding.title.setText(getIntent().getStringExtra("user_name")!!)
        viewModel.receiver_id=  getIntent().getStringExtra("userId")!!
        viewModel.chatHeadID=  getIntent().getStringExtra("chatheadId")!!
        viewModel.sender_id= getData(SessionManager.USER_ID)!!
        if(viewModel.chatHeadID.equals("")){
            callgetChatHeaderId=true
            viewModel.getChatHeadsId(getData(SessionManager.USER_ID)!!,viewModel.receiver_id)
        }else{
            callgetAllMessage=true
            viewModel.getMessage()
        }
    }

    override fun initListeners() {
        EventBus.getDefault().register(this)

        binding.imageBack.setOnClickListener {
            finish()
        }

        binding.txAddPhoto.setOnClickListener {
            selectImage()
        }

        binding.txMessage.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if(s.toString().length > 0 ){
                    viewModel.setTypingStatus(getData(SessionManager.USER_ID)!!,viewModel.receiver_id,true)
                }
            }
            override fun afterTextChanged(s: Editable) {}
        })

        binding.activityRootView.getViewTreeObserver()
            .addOnGlobalLayoutListener(object : OnGlobalLayoutListener {
                override fun onGlobalLayout() {
                    val r = Rect()
                    binding.activityRootView.getWindowVisibleDisplayFrame(r)

                    var heightDifftest = binding.activityRootView.getRootView().getHeight() - r.height();
                    if (heightDifftest > 0.25* binding.activityRootView.getRootView().getHeight()) { // if more than 25% of the screen, its probably a keyboard...
                        Log.e("ShowKeyborad","SecondShowing")
                    }else{
                        viewModel.setTypingStatus(getData(SessionManager.USER_ID)!!,viewModel.receiver_id,false)
                        Log.e("ShowKeyborad","SecondNotShowing")
                    }
                }
            })

        viewModel.observerImageUploadResponse()?.observe(this, androidx.lifecycle.Observer {
            Log.e("image_url",""+it[0])
            viewModel.imagePath=it[0]
        })

        mCompressor = FileCompressor(this)

    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onMessageEvent(event: MessageEvent) {
        if (event.type.equals("getChatHeadId")) {
            try {
                if (callgetChatHeaderId){
                    callgetChatHeaderId = false
                var jsonObject = JSONObject(event.message)
                viewModel.chatHeadID = jsonObject.getString("_id")
                callgetAllMessage = true
                viewModel.getMessage()
            }
            } catch (ex: Exception) {
                Log.v("TEST", "Exception1: " + ex.message)
            }
        }
        else if (event.type.equals("typingStatus")) {
            try {
                var jsonObject = JSONObject(event.message)
                var typing = jsonObject.getBoolean("isTyping")
                if(typing){
                    binding.txTyping.visibility=View.VISIBLE
                }else{
                    binding.txTyping.visibility=View.INVISIBLE
                }
            } catch (ex: Exception) {
                Log.v("TEST", "Exception1: " + ex.message)
            }
        }
        else if (event.type.equals("getMessage")){
            try {
                if(callgetAllMessage) {
                    callgetAllMessage = false
                    val receiverMessageMode = ArrayList<ReceiveMessageModelItem>()
                    var jsonArray = JSONArray(event.message)
                    if (jsonArray != null) {
                        val mapper = ObjectMapper().registerModule(KotlinModule())
                        try {
                            val message: ArrayList<ReceiveMessageModelItem> = mapper.readValue(jsonArray.toString())
                            println("The message are:\n $message")
                            receiverMessageMode.addAll(message)
                        } catch (e: java.lang.Exception) {
                            e.printStackTrace()
                        }

                        for (item in receiverMessageMode) {
                            var messageData: ReceiveMessageModelItem = item
                            if(sessionManager.getvalue(SessionManager.USER_ID).equals(messageData.senderId)){
                                messageData.image = sessionManager.getvalue(SessionManager.USER_IMAGE)!!
                            }else{
                                messageData.image=getIntent().getStringExtra("user_image")!!
                            }
                            messageData._me = sessionManager.getvalue(SessionManager.USER_ID)!!
                            receiverMessageModelItem.add(messageData)
                        }

                        bindList.itemsList = receiverMessageModelItem
                        binding?.list = bindList
                        binding?.click = this
                       // binding.rlMessage.smoothScrollToPosition(bindList.adapter.getItemCount())
                        Log.e("receiverMessageModelItem", "total " + receiverMessageModelItem.size)
                    }
                }
            } catch (ex: Exception) {
                Log.v("TEST", "Exception1: " + ex.message)
            }
        }
        else if (event.type.equals("receiveMessage")) {
            /*callgetAllMessage=true
            viewModel.getMessage()*/
            try {

                   binding.txMessage.visibility=View.VISIBLE
                   binding.imgChoose.visibility=View.GONE
                    var jsonObject = JSONObject(event.message)
                    var image=""
                    if(sessionManager.getvalue(SessionManager.USER_ID).equals(jsonObject.getString("senderId"))){
                        image = sessionManager.getvalue(SessionManager.USER_IMAGE)!!
                    }else{
                        image=getIntent().getStringExtra("user_image")!!
                    }

                val reactionArray = ArrayList<Reaction>()
                    if(jsonObject.getJSONArray("reaction")!=null) {
                        val mapper = ObjectMapper().registerModule(KotlinModule())
                        try {
                            val reaction: ArrayList<Reaction> = mapper.readValue(jsonObject.getJSONArray("reaction").toString())
                            println("The reaction are:\n $reaction")
                            reactionArray.addAll(reaction)
                        } catch (e: java.lang.Exception) {
                            e.printStackTrace()
                        }
                    }else{
                        val reaction= Reaction("","","","")
                        reactionArray.add(reaction)
                    }

                    var receiverData=ReceiverData("","","","")
                    var messageData= ReceiveMessageModelItem(jsonObject.getString("__v").toInt(),jsonObject.getString("_id"),
                            jsonObject.getString("chatHeadId"),jsonObject.getString("createdAt"),jsonObject.getString("message"),
                        jsonObject.getString("messageType"),reactionArray, receiverData,jsonObject.getString("receiverId"),jsonObject.getString("senderId"),
                        jsonObject.getString("status"), jsonObject.getString("updatedAt"),image,sessionManager.getvalue(SessionManager.USER_ID)!!)

                    if(!receiverMessageModelItem.contains(messageData)) {
                        if(!viewModel.isReactionAdded){
                            receiverMessageModelItem.add(messageData)
                        }
                       /* var isAdd=false
                        receiverMessageModelItem.forEachIndexed { index, item ->
                            if(item._id.equals(messageData._id)){
                                receiverMessageModelItem.get(index).reactions=messageData.reactions
                                isAdd=true
                                return
                            }
                        }
                        if(!isAdd){*/
                      //  receiverMessageModelItem.add(messageData)
                     //   }

                    }
                   // receiverMessageModelItem.add(messageData)
                    bindList.notifyDataChange()
                    binding.rlMessage.smoothScrollToPosition(bindList.adapter.getItemCount())
                   // viewModel.callSendMessage = true
               // }
            } catch (ex: Exception) {
                Log.v("TEST", "Exception1: " + ex.message)
            }
        }

}

    override fun onItemClick(view: View?, position: Int) {

        if(view?.id == R.id.clRightMessage){
            sampleCenterLeft(view, position)
        }
        if(view?.id == R.id.clLeftMessage){
            sampleCenterLeft(view,position)
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

                    CropImage.activity(mImageUri)
                        .start(this);


                }
            } else if(requestCode == REQUEST_TAKE_PHOTO && resultCode == Activity.RESULT_OK ) {
                try {

                    val outputFileUri = Uri.fromFile(mCompressor?.compressToFile(viewModel.mPhotoFile))
                    CropImage.activity(outputFileUri)
                        .start(this);

                } catch (e: IOException) {
                    e.printStackTrace()
                }
                Log.e("mPhotoFileCamera", viewModel.mPhotoFile!!.exists().toString() + " ")
            }
            else if (requestCode === CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
                val result = CropImage.getActivityResult(data)
                if (resultCode === RESULT_OK) {
                    val resultUri = result.uri

                    Picasso.get()
                        .load( resultUri)
                        .error(R.drawable.ic_launcher_background)
                        .placeholder(R.drawable.ic_default_avatar)
                        .into(binding.imgChoose)
                    binding.imgChoose.visibility=View.VISIBLE

                    val realPath: String =
                        ImageFilepath.getPath(this, resultUri)
                    viewModel.mPhotoFile = File(realPath)
                    binding.txMessage.visibility=View.GONE

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

    private fun sampleCenterLeft(view: View?, messagePosition: Int) {
        val popup = ReactionPopup(this, ReactionsConfigBuilder(this)
                .withReactions(
                    intArrayOf(
                        R.drawable.ic_smile_emoji,
                        R.drawable.ic_noughty_emoji,
                        R.drawable.ic_thinking_emoji,
                        R.drawable.ic_wave_emoji,
                        R.drawable.ic_clap_emoji,
                        R.drawable.ic_thumb_emoji
                    )
                )
                .withReactionTexts {
                        position: Int? -> strings.get(position!!)
                }
                .build())
        view!!.setOnTouchListener(popup)

        popup.reactionSelectedListener = { position: Int ->

            if(position!=-1) {
                Log.e("Reactions", "Selection position=$position")
                var text = String(
                    Character.toChars(
                        Integer.parseInt(
                            strings.get(position!!).substring(2),
                            16
                        )
                    )
                )
                // viewModel.emoji=text
                val jsonObject = JSONObject()
                try {
                    jsonObject.put(
                        "senderId",
                        receiverMessageModelItem.get(messagePosition).senderId
                    )
                    jsonObject.put(
                        "chatHeadId",
                        receiverMessageModelItem.get(messagePosition).chatHeadId
                    )
                    jsonObject.put(
                        "receiverId",
                        receiverMessageModelItem.get(messagePosition).receiverId
                    )
                    jsonObject.put("_id", receiverMessageModelItem.get(messagePosition)._id)
                    jsonObject.put("reaction", text)

                } catch (e: JSONException) {
                    e.printStackTrace()
                }
                val reactionArray = ArrayList<Reaction>()
                val reaction= Reaction("","",text,"")
                reactionArray.add(reaction)
                receiverMessageModelItem.get(messagePosition).reactions=reactionArray
                bindList.notifyDataChange()
                viewModel.messageReaction("sendMessage", jsonObject)
            }
                //   binding.txMessage.setText(text)
                position != 3

        }
    }
}
