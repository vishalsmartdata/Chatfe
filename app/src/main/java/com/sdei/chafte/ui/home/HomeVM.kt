package com.sdei.chafte.ui.home

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.*
import com.sdei.chafte.pojoclasses.DetailPojo
import com.sdei.chafte.pojoclasses.FilterPojo
import com.sdei.chafte.pojoclasses.JoinRoomPojo
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import org.json.JSONObject

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class HomeVM(application: Application) : BaseVM(application) {
    var categoryResponse: MutableLiveData<ArrayList<CategoryData>>? = null
    var roomResponse: MutableLiveData<ArrayList<RoomData>>? = null
    var addRoomResponse: MutableLiveData<JoinData>? = null
    var cancelRoomResponse: MutableLiveData<String>? = null
    var app: Application? = null

    init {
        app = application
    }

    fun observerAddRoomResponse(): MutableLiveData<JoinData>? {
        addRoomResponse = null
        addRoomResponse = MutableLiveData()
        return addRoomResponse
    }

    fun observerCancelRoomResponse(): MutableLiveData<String>? {
        cancelRoomResponse = null
        cancelRoomResponse = MutableLiveData()
        return cancelRoomResponse
    }

    fun observerCategoryResponse(): MutableLiveData<ArrayList<CategoryData>>? {
        categoryResponse = null
        categoryResponse = MutableLiveData()
        return categoryResponse
    }

    fun observerRoomResponse(): MutableLiveData<ArrayList<RoomData>>? {
        roomResponse = null
        roomResponse = MutableLiveData()
        return roomResponse
    }

    fun getAllCategory() {
        NetworkAdapter.getInstance().getNetworkServices()?.getCategoryAll()?.enqueue(object :
            Callback<CategoryModel> {
            override fun onFailure(call: Call<CategoryModel>, t: Throwable) {
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<CategoryModel>,
                response: Response<CategoryModel>
            ) {
                when (response.code()) {
                    200 -> {
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
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun getAllRoom(
        authentication: String?,
        selected_category_id: String,
        selected_start_time: String,
        selected_sort_by: String,
        selected_date: String,
        free_on_calenndar: String
    ) {
        progressObserver?.value = true
        var free_calendar=false
        if(free_on_calenndar.equals("true")){
            free_calendar=true
        }
        /*var date = selected_date
        if (date.isNotEmpty()) {
            date = date + " 00:00:00"
        }*/
        var filterPojo =
            FilterPojo(selected_category_id, selected_date, selected_start_time, selected_sort_by,free_calendar)
        NetworkAdapter.getInstance().getNetworkServices()?.getAllRoom(authentication, filterPojo)
            ?.enqueue(object :
                Callback<RoomModel> {
                override fun onFailure(call: Call<RoomModel>, t: Throwable) {
                    progressObserver?.value = false
                    errorResponse?.value = t.message
                }

                override fun onResponse(
                    call: Call<RoomModel>,
                    response: Response<RoomModel>
                ) {
                    when (response.code()) {
                        200 -> {
                            response.body()?.let {
                                if (it.code.equals(200)) {
                                    //if (response.body()?.data?.size!! > 0)
                                    roomResponse?.value = response.body()!!.data
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
                            errorResponse?.value = response.message()
                        }
                    }
                    progressObserver?.value = false
                }
            })
    }

    fun getAddRoom(header: String?, user_id: String?, room_id: String) {
        progressObserver?.value = true
        var filterPojo = JoinRoomPojo(room_id, user_id!!)
        NetworkAdapter.getInstance().getNetworkServices()?.getJoinRoom(header, filterPojo)
            ?.enqueue(object :
                Callback<JoinRoomResponse> {
                override fun onFailure(call: Call<JoinRoomResponse>, t: Throwable) {
                    progressObserver?.value = false
                    errorResponse?.value = t.message
                }

                override fun onResponse(
                    call: Call<JoinRoomResponse>,
                    response: Response<JoinRoomResponse>
                ) {
                    when (response.code()) {
                        200 -> {
                            progressObserver?.value = false
                            response.body()?.let {
                                if (it.code.equals(200)) {
                                    //if (response.body()?.data?.size!! > 0)
                                    addRoomResponse?.value = response.body()!!.data
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
                                val jObjError = JSONObject(response.errorBody()!!.string())
                                errorResponse?.value = jObjError.getString("message")
                            } catch (e: Exception) {
                                Toast.makeText(app?.baseContext, e.message, Toast.LENGTH_LONG)
                                    .show()
                            }
                        }
                    }
                }
            })
    }

    fun getCancelRoom(header: String?, user_id: String?, room_id: String) {
        progressObserver?.value = true
        var filterPojo = DetailPojo(room_id)
        NetworkAdapter.getInstance().getNetworkServices()?.getCancelRoom(header, filterPojo)
            ?.enqueue(object :
                Callback<EditProfileModel> {
                override fun onFailure(call: Call<EditProfileModel>, t: Throwable) {
                    progressObserver?.value = false
                    errorResponse?.value = t.message
                }

                override fun onResponse(
                    call: Call<EditProfileModel>,
                    response: Response<EditProfileModel>
                ) {
                    when (response.code()) {
                        200 -> {
                            progressObserver?.value = false
                            response.body()?.let {
                                if (it.code.equals(200)) {
                                    //if (response.body()?.data?.size!! > 0)
                                    cancelRoomResponse?.value = response.body()!!.data
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
                                val jObjError = JSONObject(response.errorBody()!!.string())
                                errorResponse?.value = jObjError.getString("message")
                            } catch (e: Exception) {
                                Toast.makeText(app?.baseContext, e.message, Toast.LENGTH_LONG)
                                    .show()
                            }
                        }
                    }
                }
            })
    }

}