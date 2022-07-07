package com.sdei.chafte.ui.home.message.the_blizzard

import android.app.Application
import androidx.databinding.ObservableField
import com.sdei.chafte.utils.base.BaseVM

class TheBlizzardVM(application: Application) : BaseVM(application) {
    val progressObservable = ObservableField<Boolean>()

    var app: Application? = null

    init {
        app = application
        progressObservable.set(true)
    }
}