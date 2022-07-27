package com.sdei.chafte.model

import com.google.gson.annotations.SerializedName

data class BlockList(


@SerializedName("status"     ) var status     : String?         = null,
@SerializedName("code"       ) var code       : Int?            = null,
@SerializedName("data"       ) var data       : ArrayList<Data> = arrayListOf(),
@SerializedName("page"       ) var page       : Int?            = null,
@SerializedName("pageSize"   ) var pageSize   : Int?            = null,
@SerializedName("totalCount" ) var totalCount : Int?            = null

)
data class Datingg (

    @SerializedName("datings" ) var datings : String? = null,
    @SerializedName("privacy" ) var privacy : String? = null

)
data class Dobb (

    @SerializedName("birthdate" ) var birthdate : String? = null,
    @SerializedName("privacy"   ) var privacy   : String? = null

)
data class Genderr (

    @SerializedName("gen"     ) var gen     : String? = null,
    @SerializedName("privacy" ) var privacy : String? = null

)
data class Hometownn (

    @SerializedName("homeTown" ) var homeTown : String? = null,
    @SerializedName("privacy"  ) var privacy  : String? = null

)
data class ProfileImgg (

    @SerializedName("image"   ) var image   : String? = null,
    @SerializedName("privacy" ) var privacy : String? = null

)
data class BlockUser (

    @SerializedName("dating"           ) var dating           : Datingg?     = Datingg(),
    @SerializedName("dob"              ) var dob              : Dobb?        = Dobb(),
    @SerializedName("gender"           ) var gender           : Genderr?     = Genderr(),
    @SerializedName("hometown"         ) var hometown         : Hometownn?   = Hometownn(),
    @SerializedName("profileImg"       ) var profileImg       : ProfileImgg? = ProfileImgg(),
    @SerializedName("aboutYourself"    ) var aboutYourself    : String?     = null,
    @SerializedName("interestedInDate" ) var interestedInDate : Boolean?    = null,
    @SerializedName("loginType"        ) var loginType        : String?     = null,
    @SerializedName("status"           ) var status           : String?     = null,
    @SerializedName("_id"              ) var Id               : String?     = null,
    @SerializedName("designation"      ) var designation      : String?     = null,
    @SerializedName("drink"            ) var drink            : String?     = null,
    @SerializedName("email"            ) var email            : String?     = null,
    @SerializedName("fname"            ) var fname            : String?     = null,
    @SerializedName("lname"            ) var lname            : String?     = null,
    @SerializedName("notification"     ) var notification     : Boolean?    = null,
    @SerializedName("phone"            ) var phone            : String?     = null,
    @SerializedName("username"         ) var username         : String?     = null,
    @SerializedName("createdAt"        ) var createdAt        : String?     = null,
    @SerializedName("updatedAt"        ) var updatedAt        : String?     = null,
    @SerializedName("__v"              ) var _v               : Int?        = null,
    @SerializedName("googleId"         ) var googleId         : String?     = null,
    @SerializedName("otp"              ) var otp              : String?     = null

)
data class Data (

    @SerializedName("status"    ) var status    : String?    = null,
    @SerializedName("_id"       ) var Id        : String?    = null,
    @SerializedName("blockUser" ) var blockUser : BlockUser? = BlockUser(),
    @SerializedName("createdBy" ) var createdBy : String?    = null,
    @SerializedName("__v"       ) var _v        : Int?       = null,
    @SerializedName("createdAt" ) var createdAt : String?    = null,
    @SerializedName("updatedAt" ) var updatedAt : String?    = null

)
