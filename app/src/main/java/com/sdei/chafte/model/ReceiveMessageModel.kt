package com.sdei.chafte.model

class ReceiveMessageModel : ArrayList<ReceiveMessageModelItem>()

data class ReceiveMessageModelItem(
    val __v: Int,
    val _id: String,
    val chatHeadId: String,
    val createdAt: String,
    val message: String,
    val messageType: String,
    val receiverId: String,
    val senderId: String,
    val status: String,
    val updatedAt: String,
    var _me: String=""
)