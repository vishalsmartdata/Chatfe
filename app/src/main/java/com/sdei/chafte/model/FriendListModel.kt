package com.sdei.chafte.model

data class FriendListModel(
    val code: Int,
    val `data`: ArrayList<FriendListData>,
    val status: String
)

data class FriendListData(
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
    val gender: Gender,
    val hometown: Hometown,
    val interestedInDate: Boolean,
    val isEmailVerified: Boolean,
    val isMobileVerified: Boolean,
    var isSelected: Boolean=false,
    val lname: String,
    val loginType: String,
    val notification: Boolean,
    val otp: String,
    val phone: String,
    val profileImg: ProfileImg,
    val status: String,
    val updatedAt: String,
    val username: String
)

