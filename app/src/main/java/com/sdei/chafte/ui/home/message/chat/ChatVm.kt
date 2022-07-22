package com.sdei.chafte.ui.home.message.chat

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.ImageUploadModel
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import com.sdei.chafte.utils.socket.SocketManager
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File

class ChatVm(application: Application,socketManager: SocketManager) : BaseVM(application) {
    val progressObservable = ObservableField<Boolean>()
    var socketMng: SocketManager? = null
    var app: Application? = null
    val messageObservable = ObservableField<String>()
    var chatHeadID=""
    var receiver_id=""
    var sender_id=""
    var callSendMessage=false
    var mPhotoFile: File? = null
    var imageUploadResponse: MutableLiveData<ArrayList<String>>? = null
    var imagePath: String= ""
    var isReactionAdded=false

    init {
        app = application
        socketMng = socketManager
        progressObservable.set(true)
    }

    fun observerImageUploadResponse(): MutableLiveData<ArrayList<String>>? {
        imageUploadResponse = null
        imageUploadResponse = MutableLiveData()
        return imageUploadResponse
    }

    fun getChatHeadsId(senderId:String,receiverId:String) {

        val jsonObject = JSONObject()
        try {
            jsonObject.put("senderId", senderId)
            jsonObject.put("receiverId", receiverId)
            socketMng?.emitKeyValue("createChatHead", jsonObject)
        } catch (e: JSONException) {
            e.printStackTrace()
        }

    }

    fun setTypingStatus(senderId:String,receiverId:String,IsTyping:Boolean) {

        val jsonObject = JSONObject()
        try {
            jsonObject.put("senderId", senderId)
            jsonObject.put("receiverId", receiverId)
            jsonObject.put("chatHeadId", chatHeadID)
            jsonObject.put("isTyping", IsTyping)
            socketMng?.emitKeyValue("typingStatus", jsonObject)
        } catch (e: JSONException) {
            e.printStackTrace()
        }

    }

    fun getMessage() {

        val jsonObject = JSONObject()
        try {
            jsonObject.put("chatHeadId", chatHeadID)
            socketMng?.emitKeyValue("getMessage", jsonObject)
        } catch (e: JSONException) {
            e.printStackTrace()
        }

    }

    fun messageReaction(key: String, jsonObject: JSONObject) {
        isReactionAdded=true
        socketMng?.emitKeyValue(key, jsonObject)
    }

    fun sendMessage() {
        isReactionAdded=false
        var message = ""
        messageObservable.get()?.let {
            message = it
        }
        if (imagePath.isNotEmpty()) {
            callSendMessage = true
            val jsonObject = JSONObject()
            try {
                jsonObject.put("senderId", sender_id)
                jsonObject.put("chatHeadId", chatHeadID)
                jsonObject.put("message", imagePath)
                jsonObject.put("messageType", "image")
                jsonObject.put("receiverId", receiver_id)
                socketMng?.emitKeyValue("sendMessage", jsonObject)
                imagePath = ""

            } catch (e: JSONException) {
                e.printStackTrace()
            }
        } else {
            if (message.isNotEmpty()) {
                callSendMessage = true
                messageObservable.set("")
                val jsonObject = JSONObject()
                try {
                    jsonObject.put("senderId", sender_id)
                    jsonObject.put("chatHeadId", chatHeadID)
                    jsonObject.put("message", message)
                    jsonObject.put("messageType", "message")
                    jsonObject.put("receiverId", receiver_id)
                    socketMng?.emitKeyValue("sendMessage", jsonObject)
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            }
        }
    }

        fun sendMessageImage() {

            if (imagePath.isNotEmpty()) {
                callSendMessage = true
                val jsonObject = JSONObject()
                try {
                    jsonObject.put("senderId", sender_id)
                    jsonObject.put("chatHeadId", chatHeadID)
                    jsonObject.put("message", imagePath)
                    jsonObject.put("messageType", "image")
                    jsonObject.put("receiverId", receiver_id)
                    socketMng?.emitKeyValue("sendMessage", jsonObject)
                    imagePath = ""

                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            }
        }

        fun uploadImage() {

            if (mPhotoFile != null) {
                if (mPhotoFile!!.exists()) {
                    progressObserver?.value = true
                    val fbody =
                        RequestBody.create(MediaType.parse("multipart/form-data"), mPhotoFile)
                    var image = MultipartBody.Part.createFormData("", mPhotoFile?.name, fbody)
                    NetworkAdapter.getInstance().getNetworkServices()?.getUpload(image)
                        ?.enqueue(object :
                            Callback<ImageUploadModel> {
                            override fun onFailure(call: Call<ImageUploadModel>, t: Throwable) {
                                progressObserver?.value = false
                                errorResponse?.value = t.message
                            }

                            override fun onResponse(
                                call: Call<ImageUploadModel>,
                                response: Response<ImageUploadModel>
                            ) {
                                when (response.code()) {
                                    200 -> {
                                        progressObserver?.value = false
                                        response.body()?.let {
                                            imageUploadResponse?.value = response.body()!!.files
                                            /*if (it.code.equals(200)) {
                                        //if (response.body()?.data?.size!! > 0)
                                        //drinkResponse?.value = response.body()!!.data
                                    } else {
                                        errorResponse?.value =
                                            app?.baseContext?.getString(R.string.data_not_found)
                                    }*/
                                        }
                                    }
                                    else -> {
                                        progressObserver?.value = false
                                        errorResponse?.value = response.message()
                                    }
                                }
                            }
                        })
                } else {
                    errorResponse?.value =
                        app?.baseContext?.getString(R.string.Please_select_profile_image)
                }
            } else {
                errorResponse?.value =
                    app?.baseContext?.getString(R.string.Please_select_profile_image)
            }
        }


}
