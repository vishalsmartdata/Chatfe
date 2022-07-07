package com.sdei.chafte.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class RegistrationReponse(
    val code: Int,
    val message: String,
    val `data`: RegistrationReponseData,
    val status: String
)

data class RegistrationReponseData(
    val __v: Int,
    val _id: String,
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
    val lname: String,
    val loginType: String,
    val password: String,
    val phone: String,
    val profileImg: ProfileImg,
    val status: String,
    val updatedAt: String
)

data class Dating(
    val datings: String,
    val privacy: String
)

data class Dob(
    val birthdate: String,
    val privacy: String
)

@Parcelize
data class Gender(
    val gen: String,
    val privacy: String
): Parcelable

@Parcelize
data class Hometown(
    val homeTown: String,
    val privacy: String
): Parcelable

@Parcelize
data class ProfileImg(
    val image: String,
    val privacy: String
): Parcelable