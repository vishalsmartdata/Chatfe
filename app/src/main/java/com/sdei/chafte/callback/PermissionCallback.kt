package com.sdei.chafte.callback

interface PermissionCallback {
    fun onPermissionGranted()
    fun onPermissionRejected()
}