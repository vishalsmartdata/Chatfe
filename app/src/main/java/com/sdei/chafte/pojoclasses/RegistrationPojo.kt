package com.sdei.chafte.pojoclasses

data class RegistrationPojo(
    val dating: Dating,
    val designation: String,
    val dob: Dob,
    val drink: String,
    val email: String,
    val fname: String,
    val gender: Gender,
    val hometown: Hometown,
    val interestedInDate: Boolean,
    val lname: String,
    val password: String,
    val phone: String,
    val profileImg: ProfileImg,
    val notification: Boolean,
    val username: String
)

data class Dating(
    val datings: String,
    val privacy: String
)

data class Dob(
    val birthdate: String,
    val privacy: String
)

data class Gender(
    val gen: String,
    val privacy: String
)

data class Hometown(
    val homeTown: String,
    val privacy: String
)

data class ProfileImg(
    val image: String,
    val privacy: String
)