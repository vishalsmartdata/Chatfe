package com.sdei.chafte.ui.authentication.intro

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.sdei.chafte.utils.base.BaseVM

class IntroVm(application: Application) : BaseVM(application) {
    val progressObservable = ObservableField<Boolean>()


    var app: Application? = null

    init {
        app = application
        progressObservable.set(true)
    }

}