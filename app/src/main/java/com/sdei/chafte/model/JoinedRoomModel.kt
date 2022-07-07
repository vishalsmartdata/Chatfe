package com.sdei.chafte.model

data class JoinedRoomModel(
    val code: Int,
    val `data`: ArrayList<JoinRoomData>,
    val status: String
)

data class JoinRoomData(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val joinStatus: Boolean,
    val roomId: RoomId,
    val status: String,
    val updatedAt: String,
    val userId: String
)

data class RoomId(
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