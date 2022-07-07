package com.sdei.chafte.pojoclasses

class UpdateProfilePojo (
    val fname: String,
    val lname: String,
    val aboutYourself: String,
    val profileImg: UpdateProfileImg,
    )

data class UpdateProfileImg(
    val image: String
)




