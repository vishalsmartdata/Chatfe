package com.sdei.chafte.pojoclasses

data class ChangePasswordPojo(
    val otp: String,
    val password: String,
    val phone: String,
    val email: String
)