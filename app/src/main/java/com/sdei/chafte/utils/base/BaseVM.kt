package com.sdei.chafte.utils.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

open class BaseVM(context: Application) : AndroidViewModel(context) {
    var errorResponse: MutableLiveData<String>? = null
    var tokenExpireResponse: MutableLiveData<String>? = null

    var progressObserver: MutableLiveData<Boolean>? = null

    fun demoTest(): String {
        return "Hello Test"
    }

    fun observerError(): MutableLiveData<String>? {
        errorResponse = null
        errorResponse = MutableLiveData()
        return errorResponse
    }
    fun progressObserve(): MutableLiveData<Boolean>? {
        progressObserver = null
        progressObserver = MutableLiveData()
        return progressObserver
    }
    fun tokenObserve(): MutableLiveData<String>? {
        tokenExpireResponse = null
        tokenExpireResponse = MutableLiveData()
        return tokenExpireResponse
    }
}