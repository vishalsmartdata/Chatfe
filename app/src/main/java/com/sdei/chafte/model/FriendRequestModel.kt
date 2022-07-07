package com.sdei.chafte.model

data class FriendRequestModel(
    val code: Int,
    val `data`: ArrayList<FriendRequestData>,
    val status: String
)

data class FriendRequestData(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val receiverId: String,
    val requestStatus: String,
    val senderId: SenderId,
    val status: String,
    val updatedAt: String
)

data class SenderId(
    val __v: Int,
    val _id: String,
    val aboutYourself: String,
    val createdAt: String,
    val dating: Dating,
    val designation: String,
    val dob: Dob,
    val drink: String,
    val email: String,
    val fname: String,
    val gender: Any,
    val hometown: Hometown,
    val interestedInDate: Boolean,
    val lname: String,
    val loginType: String,
    val notification: Boolean,
    val otp: String,
    val password: String,
    val phone: String,
    val profileImg: ProfileImg,
    val status: String,
    val updatedAt: String,
    val username: String
)

