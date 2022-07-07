package com.sdei.chafte.model

data class SearchModel(
    val code: Int,
    val `data`: ArrayList<SearchData>,
    val page: Int,
    val pageSize: Int,
    val status: String,
    val totalCount: Int
)

data class SearchData(
    val __v: Int,
    val _id: String,
    val about: String,
    val categoryId: String,
    val createdAt: String,
    val createdBy: String,
    val date: String,
    val duration: Float,
    val endDate: String,
    val endTime: String,
    val image: String,
    val roomClass: String,
    val roomName: String,
    val roomType: String,
    val startDate: String,
    val startTime: String,
    val status: String,
    val updatedAt: String
)