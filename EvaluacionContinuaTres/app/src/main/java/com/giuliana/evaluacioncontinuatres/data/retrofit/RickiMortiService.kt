package com.giuliana.evaluacioncontinuatres.data.retrofit
import com.giuliana.evaluacioncontinuatres.data.response.RickiMortiFavoriteResponse
import com.giuliana.evaluacioncontinuatres.data.response.RickiMortiListResponse
import retrofit2.http.GET

interface RickiMortiService {
    @GET("character")
    suspend fun getRickiMorti(): RickiMortiListResponse

    @GET("character/?name=Muscular%20Mannie&status=alive")
    suspend fun getRicki(): RickiMortiFavoriteResponse
}