package com.sdei.chafte.model

data class CreateRoomModel(
    val code: Int,
    val `data`: CreateRoomData,
    val status: String,
    val message: String
)

data class CreateRoomData(
    val __v: Int,
    val _id: String,
    val about: String,
    val categoryId: String,
    val createdAt: String,
    val createdBy: String,
    val date: String,
    val duration: Float,
    val image: String,
    val roomName: String,
    val roomType: String,
    val startTime: String,
    val status: String,
    val updatedAt: String
)