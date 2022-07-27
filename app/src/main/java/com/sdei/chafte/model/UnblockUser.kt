package com.sdei.chafte.model

import com.google.gson.annotations.SerializedName

data class UnblockUser(
     var status : String,
     var code   : Int,
     var message   : String,
     var data   : String

)
/*
data class UnblockUser(
    @SerializedName("status") var status : String? = null,
    @SerializedName("code") var code   : Int?    = null,
    @SerializedName("message") var message   : String? = null,
    @SerializedName("data") var data   : String? = null

)
*/

data class Unblock(
    var userId :String
)
