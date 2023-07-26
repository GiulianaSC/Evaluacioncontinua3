package com.giuliana.evaluacioncontinuatres.data.repository

import com.giuliana.evaluacioncontinuatres.data.response.RickiMortiFavoriteResponse
import com.giuliana.evaluacioncontinuatres.data.response.RickiMortiListResponse
import com.giuliana.evaluacioncontinuatres.data.retrofit.ServiceInstance
import com.giuliana.evaluacioncontinuatres.model.ApiResponse


class RickiMortiRepository {

    suspend fun getRickiMorti(): ApiResponse<RickiMortiListResponse> {
        return try{
            val response= ServiceInstance.getRickiMortiService().getRickiMorti()
            ApiResponse.Success(response)
        }catch(e: Exception){
            ApiResponse.Error(e)
        }
    }
    suspend fun getFavorite(): ApiResponse<RickiMortiFavoriteResponse> {
        return try{
            val response= ServiceInstance.getRickiMortiService().getRicki()
            ApiResponse.Success(response)
        }catch(e: Exception){
            ApiResponse.Error(e)
        }
    }
}