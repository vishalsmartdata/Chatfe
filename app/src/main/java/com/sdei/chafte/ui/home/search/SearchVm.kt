package com.sdei.chafte.ui.home.search

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.*
import com.sdei.chafte.pojoclasses.RecentRoomAddPojo
import com.sdei.chafte.pojoclasses.RecentUserAddPojo
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchVm (application: Application) : BaseVM(application) {
    val progressObservable = ObservableField<Boolean>()
    var searchReponse: MutableLiveData<SearchModel>? = null
    var peopleReponse: MutableLiveData<PeopleModel>? = null
    var addPeopleReponse: MutableLiveData<String>? = null
    var deleteRecentReponse: MutableLiveData<String>? = null
    var addRoomReponse: MutableLiveData<String>? = null
    var resentSearchReponse: MutableLiveData<ArrayList<RecentSearchData>>? = null

    var app: Application? = null

    init {
        app = application
        progressObservable.set(true)
    }

    fun observerRecentSearchResponse() : MutableLiveData<ArrayList<RecentSearchData>>? {
        resentSearchReponse = null
        resentSearchReponse = MutableLiveData()
        return resentSearchReponse
    }
    fun observerSearchResponse() : MutableLiveData<SearchModel>? {
        searchReponse = null
        searchReponse = MutableLiveData()
        return searchReponse
    }

    fun observerAddPeopleResponse() : MutableLiveData<String>? {
        addPeopleReponse = null
        addPeopleReponse = MutableLiveData()
        return addPeopleReponse
    }

    fun observerDeleteRecentResponse() : MutableLiveData<String>? {
        deleteRecentReponse = null
        deleteRecentReponse = MutableLiveData()
        return deleteRecentReponse
    }

    fun observerAddRoomResponse() : MutableLiveData<String>? {
        addRoomReponse = null
        addRoomReponse = MutableLiveData()
        return addRoomReponse
    }

    fun observerPeopleResponse() : MutableLiveData<PeopleModel>? {
        peopleReponse = null
        peopleReponse = MutableLiveData()
        return peopleReponse
    }

    fun getSearchRecords(
        authentication: String?,
        search_type: String,
        text: String,
        page: String,
        totalcount: String,) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getSearch(authentication,search_type,text,page,totalcount)?.enqueue(object :
            Callback<SearchModel> {
            override fun onFailure(call: Call<SearchModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<SearchModel>,
                response: Response<SearchModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                searchReponse?.value = response.body()!!
                            } else {
                                errorResponse?.value = app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    401 -> {
                        tokenExpireResponse?.value = "token is Expire"
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun getRecentSearch(authentication: String?) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getResentSearch(authentication)?.enqueue(object :
            Callback<RecentSearchModel> {
            override fun onFailure(call: Call<RecentSearchModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<RecentSearchModel>,
                response: Response<RecentSearchModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                resentSearchReponse?.value = response.body()!!.data
                            } else {
                                errorResponse?.value = app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    401 -> {
                        tokenExpireResponse?.value = "token is Expire"
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun getSearchPeople(authentication: String?, text: String,page:String, totalCount:String) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getSearchPeople(authentication,text,page,totalCount)?.enqueue(object :
            Callback<PeopleModel> {
            override fun onFailure(call: Call<PeopleModel>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<PeopleModel>,
                response: Response<PeopleModel>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                peopleReponse?.value = response.body()!!
                            } else {
                                errorResponse?.value = app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    401 -> {
                        tokenExpireResponse?.value = "token is Expire"
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun getAddSearchPeople(authentication: String?,recentUserResponse: RecentUserAddPojo) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getAddSearchPeople(authentication,recentUserResponse)?.enqueue(object :
            Callback<RecentUserResponse> {
            override fun onFailure(call: Call<RecentUserResponse>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<RecentUserResponse>,
                response: Response<RecentUserResponse>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                addPeopleReponse?.value = response.body()!!.data.categoryId
                            } else {
                                errorResponse?.value = app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    401 -> {
                        tokenExpireResponse?.value = "token is Expire"
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun getDeleteSearchRoom(authentication: String?,_id: String) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getDeleteRecentSearch(authentication,_id)?.enqueue(object :
            Callback<SendOtpResponse> {
            override fun onFailure(call: Call<SendOtpResponse>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<SendOtpResponse>,
                response: Response<SendOtpResponse>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                deleteRecentReponse?.value = response.body()!!.data
                            } else {
                                errorResponse?.value = app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    401 -> {
                        tokenExpireResponse?.value = "token is Expire"
                    }
                    else -> {
                        progressObserver?.value = false
                        errorResponse?.value = response.message()
                    }
                }
            }
        })
    }

    fun getAddSearchRoom(authentication: String?,recentUserResponse: RecentRoomAddPojo) {
        progressObserver?.value = true
        NetworkAdapter.getInstance().getNetworkServices()?.getAddSearchRoom(authentication,recentUserResponse)?.enqueue(object :
            Callback<RecentUserResponse> {
            override fun onFailure(call: Call<RecentUserResponse>, t: Throwable) {
                progressObserver?.value = false
                errorResponse?.value = t.message
            }

            override fun onResponse(
                call: Call<RecentUserResponse>,
                response: Response<RecentUserResponse>
            ) {
                when (response.code()) {
                    200 -> {
                        progressObserver?.value = false
                        response.body()?.let {
                            if (it.code.equals(200)) {
                                //if (response.body()?.data?.size!! > 0)
                                addRoomReponse?.value = response.body()!!.data.categoryId
                            } else {
                                errorResponse?.value = app?.baseContext?.getString(R.string.data_not_found)
                            }
                        }
                    }
                    401 -> {
                        tokenExpireResponse?.value = "token is Expire"
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