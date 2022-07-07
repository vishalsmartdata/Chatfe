package com.sdei.chafte.model

data class NotificationModel(
    val code: Int,
    val `data`: NotificationData,
    val status: String
)

data class NotificationData(
    val friendResult: ArrayList<FriendResult>,
    val privateRoomResult: ArrayList<PrivateRoomResult>
)

data class FriendResult(
    val _id: String,
    val createdAt: String,
    val receiverId: String,
    val requestStatus: String,
    val requestTime: String,
    val senderData: SenderData,
    val senderId: String,
    val status: String,
    val updatedAt: String
)

data class PrivateRoomResult(
    val _id: String,
    val createdAt: String,
    val receiverId: String,
    val requestTime: String,
    val roomId: String,
    val senderData: SenderDataX,
    val senderId: String,
    val status: String,
    val updatedAt: String
)

data class SenderData(
    val _id: String,
    val fname: String,
    val image: String,
    val lname: String
)

data class SenderDataX(
    val _id: String,
    val fname: String,
    val image: String,
    val lname: String
)