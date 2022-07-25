package com.sdei.chafte.model

data class RoomModel(
    val code: Int,
    val `data`: ArrayList<RoomData>,
    val status: String
)

data class RoomData(
    val __v: Int,
    val _id: String,
    val about: String,
    val categoryId: String,
    val createdAt: String,
    val createdBy: String,
    val date: String,
    val duration: Double,
    val endDate: String,
    val endTime: String,
    val hasRoomJoined: Boolean,
    val image: String,
    val roomClass: String,
    val roomName: String,
    val roomType: String,
    val startDate: String,
    val startTime: String,
    val status: String,
    val updatedAt: String
)