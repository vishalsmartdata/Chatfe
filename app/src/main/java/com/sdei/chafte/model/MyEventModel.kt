package com.sdei.chafte.model


data class MyEventModel(
    val code: Int,
    val `data`: ArrayList<MyEventData>,
    val status: String
)

data class MyEventData(
    val __v: Int,
    val _id: String,
    val about: String,
    val categoryId: String,
    val createdAt: String,
    val createdBy: String,
    val duration: Double,
    val endDate: String,
    val image: String,
    val roomClass: String,
    val roomName: String,
    val roomType: String,
    val startDate: String,
    val status: String,
    val updatedAt: String
)

