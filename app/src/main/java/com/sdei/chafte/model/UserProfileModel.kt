package com.sdei.chafte.model

data class UserProfileModel(
    val code: Int,
    val `data`: ArrayList<UserProfileData>,
    val status: String
)

data class UserProfileData(
    val __v: Int,
    val _id: String,
    val aboutYourself: String,
    val createdAt: String,
    val dating: Dating,
    val designation: String,
    val dob: Dob,
    val drink: Drink,
    val email: String,
    val fname: String,
    val friendsArr: ArrayList<FriendsArr>,
    val gender: GenderX,
    val hometown: HometownX,
    val interestedInDate: Boolean,
    val isFriendRequest: Boolean,
    val lname: String,
    val loginType: String,
    val notification: Boolean,
    val password: String,
    val phone: String,
    val profileImg: ProfileImgX,
    val status: String,
    val updatedAt: String,
    val username: String,
    val chatHeadId: String,
    val requestStatus: String

)

data class UserFriendsArr(
    val __v: Int,
    val _id: String,
    val aboutYourself: String,
    val createdAt: String,
    val dating: DatingX,
    val designation: String,
    val dob: DobX,
    val drink: Drink,
    val email: String,
    val fname: String,
    val gender: Gender,
    val hometown: Hometown,
    val interestedInDate: Boolean,
    val lname: String,
    val loginType: String,
    val notification: Boolean,
    val phone: String,
    val profileImg: ProfileImg,
    val status: String,
    val updatedAt: String,
    val username: String
)


data class DrinkX(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val drinkName: String,
    val image: String,
    val status: String,
    val updatedAt: String
)

