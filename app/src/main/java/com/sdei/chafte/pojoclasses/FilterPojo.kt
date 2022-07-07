package com.sdei.chafte.pojoclasses

data class FilterPojo(
    val categoryId: String,
    val date: String,
    val startTime: String,
    var sort_by:String,
    var isFreeOnMyCalendar:Boolean
)