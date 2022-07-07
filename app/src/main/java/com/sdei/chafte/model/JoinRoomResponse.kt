package com.sdei.chafte.model

data class JoinRoomResponse(
    val code: Int,
    val `data`: JoinData,
    val status: String
)

data class JoinData(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val roomId: RoomId,
    val status: String,
    val updatedAt: String,
    val userId: String
)
