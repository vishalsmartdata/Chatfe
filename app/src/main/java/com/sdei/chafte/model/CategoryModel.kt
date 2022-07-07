package com.sdei.chafte.model

data class CategoryModel(
    val code: Int,
    val `data`: ArrayList<CategoryData>,
    val status: String
)

data class CategoryData(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val status: String,
    val title: String,
    val updatedAt: String,
    var selected: Boolean= false

)