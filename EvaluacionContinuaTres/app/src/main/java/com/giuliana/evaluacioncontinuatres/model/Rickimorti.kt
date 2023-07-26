package com.giuliana.evaluacioncontinuatres.model

import com.google.gson.annotations.SerializedName

data class Rickimorti(
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status:String,
    @SerializedName("species")
    val species: String,
    @SerializedName("gender")
    val gender: String


)

fun getData(): List<Rickimorti> {
    return listOf(
        Rickimorti("","Rick Sanchez","Alive","Human", "Male"),
        Rickimorti("","Rick Sanchez","Alive","Human", "Male"),
        Rickimorti("","Rick Sanchez","Alive","Human", "Male"),
        Rickimorti("","Rick Sanchez","Alive","Human", "Male"),
        Rickimorti("","Rick Sanchez","Alive","Human", "Male"),
        Rickimorti("","Rick Sanchez","Alive","Human", "Male"),
        Rickimorti("","Rick Sanchez","Alive","Human", "Male")
    )
}


