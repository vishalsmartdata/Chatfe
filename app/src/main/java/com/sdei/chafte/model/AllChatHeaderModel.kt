package com.sdei.chafte.model

data class AllChatHeaderModel(
    val conversationResult: ArrayList<Any>,
    val recentSuggestions: ArrayList<RecentSuggestion>
)

data class RecentSuggestion(
    val _id: String,
    val fname: String,
    val lname: String,
    val profileImg: String
)