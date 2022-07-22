package com.sdei.chafte.model

data class RecentSuggestionModel(
    val code: Int,
    val `data`: RecentConnectData,
    val status: String
)

data class RecentConnectData(
    val connectedAt: String,
    val fname: String,
    val joinedDate: String,
    val lname: String,
    val profileImg: String,
    val requestStatus: String
)