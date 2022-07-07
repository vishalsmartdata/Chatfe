package com.sdei.chafte.model

data class SendOtpResponse(
    val code: Int,
    val status: String,
    val message: String="",
    val data: String
)