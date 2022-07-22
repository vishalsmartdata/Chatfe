package com.sdei.chafte.model


data class AllChatHeaderModel(
    val conversationResult: List<ConversationResult>,
    val recentSuggestions: List<RecentSuggestion>
)

data class ConversationResult(
    val _id: String,
    val messageSender: String,
    val msg: String,
    val profileImg: String,
    val receiverData: NewReceiverData,
    val senderFirstName: String,
    val senderId: String,
    val senderLastName: String
)

data class RecentSuggestion(
    val _id: String,
    val fname: String,
    val isOnline: Boolean,
    val lname: String,
    val profileImg: String
)

data class NewReceiverData(
    val isOnline: Boolean,
    val profileImg: String,
    val receiverFirstName: String,
    val receiverId: String,
    val receiverLastName: String
)
data class ReceiverData(
    val profileImg: String,
    val receiverFirstName: String,
    val receiverId: String,
    val receiverLastName: String
)