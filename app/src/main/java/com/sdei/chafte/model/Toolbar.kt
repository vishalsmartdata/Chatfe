package com.sdei.chafte.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.sdei.chafte.BR
import java.io.Serializable

class Toolbar : BaseObservable(), Serializable {
    private var _title: String = ""

    var title: String
        @Bindable get() = _title
        set(value) {
            _title = value
            notifyPropertyChanged(BR.title)
        }


}