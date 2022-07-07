package com.sdei.chafte.ui.home.message

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.utils.base.BaseVM

class MessageVM(application: Application) : BaseVM(application) {
    val progressObservable = ObservableField<Boolean>()

    var app: Application? = null

    init {
        app = application
        progressObservable.set(true)
    }
}