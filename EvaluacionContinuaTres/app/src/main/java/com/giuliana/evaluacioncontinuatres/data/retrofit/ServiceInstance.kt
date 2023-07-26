package com.giuliana.evaluacioncontinuatres.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceInstance {
    private val retrofit=Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/api/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getRickiMortiService():RickiMortiService=retrofit.create(RickiMortiService::class.java)
}