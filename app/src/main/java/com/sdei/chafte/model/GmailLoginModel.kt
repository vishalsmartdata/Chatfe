package com.sdei.chafte.model

data class GmailLoginModel(
    val code: Int,
    val `data`: GmailData,
    val status: String
)

data class GmailData(
    val accessToken: String,
    val designation: String,
    val email: String,
    val fname: String,
    val id: String,
    val lname: String,
    val loginType: String,
    val username: String,
    val profileImg: ProfileImg
)

