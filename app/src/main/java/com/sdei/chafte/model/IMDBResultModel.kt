package com.sdei.chafte.model

data class IMDBResultModel(
    val code: Int,
    val `data`: IMDBData,
    val status: String
)

data class IMDBData(
    val Response: String,
    val Search: ArrayList<Search>,
    val totalResults: String
)

data class Search(
    val Poster: String,
    val Title: String,
    val Type: String,
    val Year: String,
    val imdbID: String
)