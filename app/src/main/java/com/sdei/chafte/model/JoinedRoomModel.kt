package com.sdei.chafte.model

data class JoinedRoomModel(
    val code: Int,
    val `data`: ArrayList<JoinRoomData>,
    val status: String
)

data class JoinRoomData(
    val __v: Int,
    val _id: String,
    val addedBy: String,
    val createdAt: String,
    val hasRoomJoined: Boolean,
    val roomId: RoomId,
    val status: String,
    val updatedAt: String
)

data class RoomId(
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
