package com.sdei.chafte.model

data class RecentUserResponse(
    val code: Int,
    val `data`: RecentData,
    val status: String
)

data class RecentData(
   /* val __v: Int,
    val _id: String,*/
    val categoryId: String,
    /*val createdAt: String,
    val createdBy: String,
    val fname: String,
    val image: String,
    val lname: String,
    val status: String,
    val type: String,
    val updatedAt: String*/
)