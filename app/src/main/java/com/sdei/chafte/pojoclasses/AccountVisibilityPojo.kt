package com.sdei.chafte.pojoclasses

data class AccountVisibilityPojo(
    val dating: DatingAV,
    val dob: DobAV,
    val gender: GenderAV,
    val hometown: HometownAV,
    val profileImg: ProfileImgAV
)

data class DatingAV(
    val privacy: String
)

data class DobAV(
    val privacy: String
)

data class GenderAV(
    val privacy: String
)

data class HometownAV(
    val privacy: String
)


data class ProfileImgAV(
    val privacy: String
)