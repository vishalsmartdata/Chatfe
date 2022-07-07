package com.sdei.chafte.pojoclasses

class AboutUpdatePojo (
    val gender: updateGender,
    val hometown: UpdateHometown,
    val dating: UpdateDating
)

data class UpdateDating(
    val datings: String
)

data class updateGender(
    val gen: String
)

data class UpdateHometown(
    val homeTown: String
)





