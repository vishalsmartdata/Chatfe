package com.sdei.chafte.model

import com.sdei.chafte.pojoclasses.*

data class AccountVisibilityModel(
    val code: Int,
    val `data`: AccountVisibilityData,
    val status: String
)

data class AccountVisibilityData(
    val dating: DatingAV,
    val dob: DobAV,
    val gender: GenderAV,
    val hometown: HometownAV,
    val profileImg: ProfileImgAV
)
