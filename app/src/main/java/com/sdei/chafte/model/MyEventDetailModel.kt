package com.sdei.chafte.model

/*data class MyEventDetailModel(
    val code: Int,
    val `data`: MyEventDetailData,
    val status: String
)

data class MyEventDetailData(
    val roomData: RoomData,
    val userData: ArrayList<UserData>,
    val resultMail: String,
    val resultFriend: ArrayList<String>
)

data class UserData(
    val _id: String,
    val aboutYourself: String,
    val dob: Dob,
    val email: String,
    val fname: String,
    val gender: Gender,
    val hometown: Hometown,
    val lname: String,
    val phone: String,
    val profileImg: ProfileImg,
    val username: String,

)*/
data class MyEventDetailModel(
    val code: Int,
    val `data`: MyEventDetailData,
    val status: String
)

data class MyEventDetailData(
    val resultFriend: ArrayList<String>,
    val resultMail: String,
    val roomData: RoomData,
    val userData: ArrayList<UserData>,
)

data class UserData(
    val _id: String,
    val aboutYourself: String,
    val dob: Dob,
    val drinkName: String,
    val drinkimage: String,
    val email: String,
    val fname: String,
    val gender: Gender,
    val hometown: Hometown,
    val lname: String,
    val phone: String,
    val profileImg: ProfileImg,
    val username: String
)
