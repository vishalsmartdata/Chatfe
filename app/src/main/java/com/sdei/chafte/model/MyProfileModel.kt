package com.sdei.chafte.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class MyProfileModel(
    val code: Int,
    val `data`: MyProfileData,
    val status: String
)

data class MyProfileData(
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
    val googleId: String,
    val hometown: HometownX,
    val interestedInDate: Boolean,
    val lname: String,
    val loginType: String,
    val notification: Boolean,
    val otp: String,
    val password: String,
    val phone: String,
    val profileImg: ProfileImgX,
    val status: String,
    val updatedAt: String,
    val username: String
)

@Parcelize
data class Drink(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val drinkName: String,
    val image: String,
    val status: String,
    val updatedAt: String
): Parcelable

@Parcelize
data class FriendsArr (
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
): Parcelable

@Parcelize
data class GenderX(
    val gen: String,
    val privacy: String
): Parcelable

@Parcelize
data class HometownX(
    val homeTown: String,
    val privacy: String
): Parcelable

@Parcelize
data class ProfileImgX(
    val image: String,
    val privacy: String
): Parcelable

@Parcelize
data class DatingX(
    val datings: String
): Parcelable

@Parcelize
data class DobX(
    val birthdate: String,
    val privacy: String
): Parcelable

