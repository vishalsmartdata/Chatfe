package com.sdei.chafte.model

data class DrinkBaseModel(
    val code: Int,
    val `data`: ArrayList<DrinkModel>,
    val status: String
)

data class DrinkModel(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val drinkName: String,
    val image: String,
    val status: String,
    val updatedAt: String,
    var isSelected:Boolean=false
)