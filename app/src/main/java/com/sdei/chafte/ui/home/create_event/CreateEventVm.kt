package com.sdei.chafte.ui.home.create_event

import android.app.Application
import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.*
import com.sdei.chafte.pojoclasses.CreateRoomPojo
import com.sdei.chafte.pojoclasses.DetailPojo
import com.sdei.chafte.pojoclasses.IMDBSearchPojo
import com.sdei.chafte.pojoclasses.UpdateRoomPojo
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import com.sdei.chafte.utils.localToUTC

import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class CreateEventVm (application: Application,key:String?,authen:String?) : BaseVM(application) {
    val progressObservable = ObservableField<Boolean>()
    var categoryResponse: MutableLiveData<ArrayList<CategoryData>>? = null
    var friendListResponse: MutableLiveData<ArrayList<FriendListData>>? = null
    var searchResponse: MutableLiveData<ArrayList<Search>>? = null
    var selected_category_id=""
    var start_time=""
    var room_type="Watch Party"
    val roomNameObserver = ObservableField<String>()
    val emailObserver = ObservableField<String>()
    val aboutObserver = ObservableField<String>()
    val dateObserver = ObservableField<String>()
    var durationObserver  = ObservableField<String>()
    var durationposition  = ObservableField<Int>()
    var createRoom: MutableLiveData<CreateRoomData>? = null
    var updateRoom: MutableLiveData<CreateRoomData>? = null
    var imageUploadResponse: MutableLiveData<ArrayList<String>>? = null
    var imagePath: String= ""
    var authentication: String=""
    var edit_room: Boolean=false
    var room_id: String=""
    var mPhotoFile: File? = null
    var app: Application? = null
    var key_value: String?= null
    var friendlistlist = java.util.ArrayList<FriendListData>()
    var myeventDetailReponse: MutableLiveData<MyEventDetailData>? = null

    init {
        app = application
        progressObservable.set(true)
        key_value=key
        authentication=authen!!
    }

    fun observerMyEventDetailResponse(): MutableLiveData<MyEventDetailData>? {
        myeventDetailReponse = null
        myeventDetailReponse = MutableLiveData()
        return myeventDetailReponse
    }

    fun observerUpdateResponse(): MutableLiveData<CreateRoomData>? {
        updateRoom = null
        updateRoom = MutableLiveData()
        return updateRoom
    }

    fun observerSearchResponse(): MutableLiveData<ArrayList<Search>>? {
        searchResponse = null
        searchResponse = MutableLiveData()
        return searchResponse
    }
    fun observerImageUploadResponse(): MutableLiveData<ArrayList<String>>? {
        imageUploadResponse = null
        imageUploadResponse = MutableLiveData()
        return imageUploadResponse
    }

    fun observerCreateRoom(): MutableLiveData<CreateRoomData>? {
        createRoom = null
        createRoom = MutableLiveData()
        return createRoom
    }

    fun observerCategoryResponse(): MutableLiveData<ArrayList<CategoryData>>? {
        categoryResponse = null
        categoryResponse = MutableLiveData()
        return categoryResponse
    }
    fun observerFriendListResponse(): MutableLiveData<ArrayList<FriendListData>>? {
        friendListResponse = null
        friendListResponse = MutableLiveData()
        return friendListResponse
    }

    fun getAllCategory() {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getCategoryAll()?.enqueue(object :
            Callback<CategoryModel> {
            override fun onFailure(call: Call<CategoryModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<CategoryModel>,
                response: Response<CategoryModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                categoryResponse?.value = response.body()!!.data
                            } else {
                                errorResponse?.value =
                                    app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun getAllFriend(data: String?) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getFriendList(data)?.enqueue(object :
            Callback<FriendListModel> {
            override fun onFailure(call: Call<FriendListModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<FriendListModel>,
                response: Response<FriendListModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                friendListResponse?.value = response.body()!!.data
                            } else {
                                errorResponse?.value =
                                    app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    401 -> {
                        tokenExpireResponse?.value= "token is Expire"
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })

    }

    fun getIMDBData(data: String?,text: String) {
       // progressObserver?.value = true
        var searchtext=IMDBSearchPojo(text)
        NetworkAdapter.getInstance().getNetworkServices()?.getMoviesName(data,searchtext)?.enqueue(object :
            Callback<IMDBResultModel> {
            override fun onFailure(call: Call<IMDBResultModel>, t: Throwable) {
               // progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<IMDBResultModel>,
                response: Response<IMDBResultModel>
            ) {
                when (response.code()) {
                    200 -> {
                      //  progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                searchResponse?.value = response.body()!!.data.Search
                            } else {
                                errorResponse?.value = app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    401 -> {
                        tokenExpireResponse?.value= "token is Expire"
                    }
                    else -> {
                    //    progressObserver?.value = false
                     //   errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun doCreateEventProcess() {
        var roomname = ""
        var about = ""
        var date = ""
        var duration  = ""
        var emails  = ""
        roomNameObserver.get()?.let {
            roomname = it
        }
        aboutObserver.get()?.let {
            about = it
        }
        dateObserver.get()?.let {
            date = it
        }
        durationObserver.get()?.let {
            duration = it
        }
        emailObserver.get()?.let {
            emails = it
        }

        var friendidlist = java.util.ArrayList<String>()
        friendlistlist.forEachIndexed { index, friendListData ->
            if(friendListData.isSelected) {
                friendidlist.add(friendListData._id)
            }
        }

        val tz = TimeZone.getDefault()
        Log.e("timeZone",tz.id+"")
        when (selected_category_id.isNotEmpty() && roomname.isNotEmpty() && date.isNotEmpty() && start_time.isNotEmpty()
                 && !duration.equals("Select Duration Hours") && about.isNotEmpty() && imagePath.isNotEmpty() ) {
            true -> {

                var dateTime= localToUTC(date+" "+start_time)

                progressObserver?.value = true
                if(!edit_room) {
                    var createRoomPojo = CreateRoomPojo(
                        about,
                        selected_category_id,
                        dateTime!!,
                        duration,
                        roomname,
                        key_value!!,
                        imagePath!!,
                        room_type,
                        emails,
                        friendidlist,
                    )
                    NetworkAdapter.getInstance().getNetworkServices()
                        ?.getCreateRoom(authentication, tz.id, createRoomPojo)
                        ?.enqueue(object :
                            Callback<CreateRoomModel> {
                            override fun onFailure(call: Call<CreateRoomModel>, t: Throwable) {
                                progressObserver?.value = false
                                errorResponse?.value = t.message
                            }

                            override fun onResponse(
                                call: Call<CreateRoomModel>,
                                response: Response<CreateRoomModel>
                            ) {
                                when (response.code()) {
                                    200 -> {
                                        progressObserver?.value = false
                                        response.body()?.let {
                                            if (it.code.equals(200)) {
                                                //if (response.body()?.data?.size!! > 0)
                                                createRoom?.value = response.body()!!.data
                                            } else {
                                                errorResponse?.value =
                                                    app?.baseContext?.getString(R.string.data_not_found)
                                            }
                                        }
                                    }
                                    201 -> {
                                        errorResponse?.value  = response.body()?.message
                                    }
                                    401 -> {
                                        tokenExpireResponse?.value = "token is Expire"
                                    }
                                    else -> {
                                        progressObserver?.value = false
                                        try {
                                            val jObjError =
                                                JSONObject(response.errorBody()!!.string())
                                            errorResponse?.value = jObjError.getString("message")
                                        } catch (e: Exception) {
                                            Toast.makeText(
                                                app?.baseContext,
                                                e.message,
                                                Toast.LENGTH_LONG
                                            ).show()
                                        }
                                    }
                                }
                            }
                        })
                }else{

                    var createRoomPojo = UpdateRoomPojo(
                        about,
                        selected_category_id,
                        dateTime!!,
                        duration,
                        roomname,
                        key_value!!,
                        imagePath!!,
                        room_type,
                        emails,
                        friendidlist,
                        room_id
                    )
                    NetworkAdapter.getInstance().getNetworkServices()
                        ?.getEditeRoom(authentication, tz.id, createRoomPojo)
                        ?.enqueue(object :
                            Callback<CreateRoomModel> {
                            override fun onFailure(call: Call<CreateRoomModel>, t: Throwable) {
                                progressObserver?.value = false
                                errorResponse?.value = t.message
                            }

                            override fun onResponse(
                                call: Call<CreateRoomModel>,
                                response: Response<CreateRoomModel>
                            ) {
                                when (response.code()) {
                                    200 -> {
                                        progressObserver?.value = false
                                        response.body()?.let {
                                            if (it.code.equals(200)) {
                                                //if (response.body()?.data?.size!! > 0)
                                                updateRoom?.value = response.body()!!.data
                                            } else {
                                                errorResponse?.value =
                                                    app?.baseContext?.getString(R.string.data_not_found)
                                            }
                                        }
                                    }
                                    401 -> {
                                        tokenExpireResponse?.value = "token is Expire"
                                    }
                                    else -> {
                                        progressObserver?.value = false
                                        try {
                                            val jObjError =
                                                JSONObject(response.errorBody()!!.string())
                                            errorResponse?.value = jObjError.getString("message")
                                        } catch (e: Exception) {
                                            Toast.makeText(
                                                app?.baseContext,
                                                e.message,
                                                Toast.LENGTH_LONG
                                            ).show()
                                        }
                                    }
                                }
                            }
                        })
                }
            }
            else -> {
                when {
                    selected_category_id.isEmpty() -> errorResponse?.value = app?.baseContext?.getString(R.string.please_select_category)
                    roomname.isEmpty() -> errorResponse?.value = app?.baseContext?.getString(R.string.roomname_con_not_empty)
                    date.isEmpty() -> errorResponse?.value = app?.baseContext?.getString(R.string.please_select_select)
                    start_time.isEmpty() -> errorResponse?.value = app?.baseContext?.getString(R.string.please_select_start_time)
                    duration.equals("Select Duration Hours") -> errorResponse?.value = app?.baseContext?.getString(R.string.please_select_duration)
                    about.isEmpty() -> errorResponse?.value = app?.baseContext?.getString(R.string.about_cannot_be_empty)
                    imagePath!!.isEmpty() -> errorResponse?.value = app?.baseContext?.getString(R.string.please_select_event_image)
                }
            }
        }
    }

    fun uploadImage() {

        if (mPhotoFile != null ) {
            if(mPhotoFile!!.exists()) {
                progressObserver?.value = true
                val fbody = RequestBody.create(MediaType.parse("multipart/form-data"), mPhotoFile)
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
            }else{
                errorResponse?.value= app?.baseContext?.getString(R.string.Please_select_profile_image)
            }
        }
        else{
            errorResponse?.value= app?.baseContext?.getString(R.string.Please_select_profile_image)
        }
    }

    fun getMyRoomDetails(authe:String,room_id: String?) {
        progressObserver?.value = true
        var detailPojo= DetailPojo(room_id!!)
        NetworkAdapter.getInstance().getNetworkServices()?.getMyRoomDetails(authe,detailPojo)?.enqueue(object :
            Callback<MyEventDetailModel> {
            override fun onFailure(call: Call<MyEventDetailModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<MyEventDetailModel>,
                response: Response<MyEventDetailModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                myeventDetailReponse?.value = response.body()!!.data
                            } else {
                                errorResponse?.value =
                                    app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }


}