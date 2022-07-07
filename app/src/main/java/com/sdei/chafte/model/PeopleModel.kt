package com.sdei.chafte.model

data class PeopleModel(
    val code: Int,
    val `data`: ArrayList<PeopleData>,
    val page: Int,
    val pageSize: Int,
    val status: String
)

data class PeopleData(
    val _id: String,
    val createdAt: String,
    val dob: Dob,
    val fname: String,
    val gender: Gender,
    val lname: String,
    val profileImg: ProfileImg,
    val username: String
)

