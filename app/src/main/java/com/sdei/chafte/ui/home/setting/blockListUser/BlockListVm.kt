package com.sdei.chafte.ui.home.setting.blockListUser

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.*
import com.sdei.chafte.pojoclasses.UserBlockPojo
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BlockListVm(context:Application,authentication: String?) : BaseVM(context) {

    var authentication_token=""
    var app: Application? = null
    var blockListResponse: MutableLiveData<ArrayList<Data>>? = null
    var unblockResponse: MutableLiveData<String>? = null

    init {
        authentication_token=authentication!!
    }

    fun observerBlockListResponse(): MutableLiveData<ArrayList<Data>>? {
        blockListResponse = null
        blockListResponse = MutableLiveData()
        return blockListResponse
    }

  /*  private val blockListResponseMutable=MutableLiveData<ArrayList<Data>>()
    val blockUserLiveData:LiveData<ArrayList<Data>>
    get() = blockListResponseMutable
*/


    fun observerUnBlockResponse(): MutableLiveData<String>? {
        unblockResponse = null
        unblockResponse = MutableLiveData()
        return unblockResponse
    }

    fun getBlockedUser() {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getBlockedUser(authentication_token)?.enqueue(object :
            Callback<BlockList> {
            override fun onFailure(call: Call<BlockList>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<BlockList>,
                response: Response<BlockList>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code!!.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                Log.d("blockuser", "onResponse: success ${it.data}")
                                blockListResponse?.value = response.body()!!.data
                            } else {
                                Log.d("blockuser", "onResponse: failed")
                                errorResponse?.value =
                                    app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    401 -> {
                        Log.d("blockuser", "onResponse: expired")
                        tokenExpireResponse?.value= "token is Expire"
                    }
                    else -> {
                        Log.d("blockuser", "onResponse: message ${response.message()}")
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })

    }


    fun getUnblockListUser(user_id:String) {
        progressObserver?.value = true
        var unblockUser= Unblock(user_id)
        NetworkAdapter.getInstance().getNetworkServices()?.getUnBlockUser(authentication_token,
            unblockUser
        )?.enqueue(object :
            Callback<UnblockUser> {
            override fun onFailure(call: Call<UnblockUser>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
                Log.d("Unblockuser", "onResponse: failure exception ${t.stackTrace} ")
            }

            override fun onResponse(
                call: Call<UnblockUser>,
                response: Response<UnblockUser>
            ) {

                try{
                    val result=response.body()
                    Log.d("Unblockuser", "onResponse: object ${response.body()}")
                    Log.d("Unblockuser", "onResponse: message ${response.errorBody()}")
                    Log.d("Unblockuser", "onResponse: raw ${response.raw()}")


                    Log.d("Unblockuser", "onResponse: init ${result?.message}   ${result?.data} ")
                    when (response.code()) {
                        200 -> {
                            progressObserver?.value = false
                            response.body()?.let {
                                if (it.code!!.equals(200)) {
                                    getBlockedUser()
                                    //if (response.body()?.data?.size!! > 0)
                                    Log.d("Unblockuser", "onResponse: success ${it.data} ${it.message}")
                                    Log.d("Unblockuserchecking", "onResponse: success ${it}")
                                    unblockResponse?.value = response.body()!!.message
                                } else {
                                    Log.d("Unblockuser", "onResponse: failed")
                                    errorResponse?.value =
                                        app?.baseContext?.getString(R.string.data_not_found)
                                }
                            }
                        }
                        401 -> {
                            Log.d("Unblockuser", "onResponse: expired")
                            tokenExpireResponse?.value= "token is Expire"
                        }
                        else -> {
                            Log.d("Unblockuser", "error: message ${response.body()?.message} data ${response.body()?.status} code ${response.body()?.code}")
                            progressObserver?.value = false
                            errorResponse?.value = response.message()
                        }
                    }

                }catch (e:Exception)
                {
                    Log.d("Unblocker", "onResponse: exception ${e.stackTrace}")
                }


            }
        })

    }
}