package com.sdei.chafte.model

data class RecentSearchModel(
    val code: Int,
    val `data`: ArrayList<RecentSearchData>,
    val status: String
)

data class RecentSearchData(
    val __v: Int,
    val _id: String,
    val categoryId: String,
    val createdAt: String,
    val createdBy: String,
    val endDate: String,
    val endTime: String,
    val fname: String,
    val image: String,
    val lname: String,
    val roomName: String,
    val startDate: String,
    val startTime: String,
    val status: String,
    val type: String,
    val updatedAt: String
)