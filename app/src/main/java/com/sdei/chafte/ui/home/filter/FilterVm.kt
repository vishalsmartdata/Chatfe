package com.sdei.chafte.ui.home.filter

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.R
import com.sdei.chafte.model.CategoryData
import com.sdei.chafte.model.CategoryModel
import com.sdei.chafte.model.RoomData
import com.sdei.chafte.model.RoomModel
import com.sdei.chafte.repository.networkoperator.NetworkAdapter
import com.sdei.chafte.utils.base.BaseVM
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FilterVm (application: Application) : BaseVM(application) {
    val progressObservable = ObservableField<Boolean>()
    var categoryResponse: MutableLiveData<ArrayList<CategoryData>>? = null
    val dateObserver = ObservableField<String>()
    var app: Application? = null

    init {
        app = application
        progressObservable.set(true)
    }

    fun observerCategoryResponse(): MutableLiveData<ArrayList<CategoryData>>? {
        categoryResponse = null
        categoryResponse = MutableLiveData()
        return categoryResponse
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
                progressObserver?.value = false
            }
        })
    }


}