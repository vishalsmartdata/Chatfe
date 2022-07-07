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
    val date: String,
    val duration: Float,
    val image: String,
    val roomName: String,
    val roomType: String,
    val startTime: String,
    val status: String,
    val updatedAt: String,
    val roomClass: String="Chat",
    val hasRoomJoined: Boolean=false
)