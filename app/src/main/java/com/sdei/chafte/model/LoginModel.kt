package com.sdei.chafte.model

data class LoginModel(
    val code: Int,
    val message: String,
    val `data`: LoginData,
    val status: String
)

data class LoginData(
    val accessToken: String,
    val designation: String,
    val email: String,
    val id: String,
    val phone: String,
    val fname: String,
    val profileImg: ProfileImg
)