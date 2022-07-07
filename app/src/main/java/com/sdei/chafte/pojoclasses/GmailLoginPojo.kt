package com.sdei.chafte.pojoclasses

import com.sdei.chafte.model.ProfileImg

data class GmailLoginPojo(
    val designation: String,
    val email: String,
    val fname: String,
    val googleId: String,
    val lname: String,
    val username: String,
    val facebookId: String,
    val profileImg: ProfileImg,
    val loginType: String,

)