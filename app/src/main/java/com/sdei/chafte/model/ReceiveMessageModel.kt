package com.sdei.chafte.model

/*class ReceiveMessageModel : ArrayList<ReceiveMessageModelItem>()

data class ReceiveMessageModelItem(
    val __v: Int,
    val _id: String,
    val chatHeadId: String,
    val createdAt: String,
    val message: String,
    val messageType: String,
    val receiverData: ReceiverData,
    val receiverId: String,
    val senderId: String,
    val status: String,
    val updatedAt: String,
    var image: String="",
    var _me: String=""

)*/

class ReceiveMessageModel : ArrayList<ReceiveMessageModelItem>()

data class ReceiveMessageModelItem(
    val __v: Int,
    val _id: String,
    val chatHeadId: String,
    val createdAt: String,
    val message: String,
    val messageType: String,
    var reactions: ArrayList<Reaction>,
    val receiverData: ReceiverData,
    val receiverId: String,
    val senderId: String,
    val status: String,
    val updatedAt: String,
    var image: String="",
    var _me: String=""
)

data class Reaction(
    val fname: String,
    val lname: String,
    val reaction: String,
    val senderId: String
)

