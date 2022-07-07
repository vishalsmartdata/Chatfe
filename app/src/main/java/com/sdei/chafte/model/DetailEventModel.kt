package com.sdei.chafte.model

data class DetailEventModel(
    val code: Int,
    val `data`: EventDetailData,
    val status: String
)

data class EventDetailData(
    val __v: Int,
    val _id: String,
    val about: String,
    val categoryId: String,
    val createdAt: String,
    val createdBy: String,
    val date: String,
    val duration: Float,
    val endDate: String,
    val friendsArr: List<Any>,
    val hasRoomJoined: Boolean,
    val image: String,
    val mails: String,
    val roomClass: String,
    val roomName: String,
    val roomType: String,
    val startDate: String,
    val startTime: String,
    val status: String,
    val updatedAt: String,
    val userData: ArrayList<UserData>
)
