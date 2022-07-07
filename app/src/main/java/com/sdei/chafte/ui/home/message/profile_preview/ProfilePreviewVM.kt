package com.sdei.chafte.ui.home.message.profile_preview

import android.app.Application
import androidx.databinding.ObservableField
import com.sdei.chafte.utils.base.BaseVM

class ProfilePreviewVM(application: Application) : BaseVM(application) {
    val progressObservable = ObservableField<Boolean>()

    var app: Application? = null

    init {
        app = application
        progressObservable.set(true)
    }
}