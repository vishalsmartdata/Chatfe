package com.sdei.chafte.pojoclasses

data class CreateRoomPojo(
    val about: String,
    val categoryId: String,
    val startDate: String,
    val duration: String,
    val roomName: String,
    val roomType: String,
    val image: String,
    val roomClass: String,
    val mails: String,
    val friendsArr: ArrayList<String>
)