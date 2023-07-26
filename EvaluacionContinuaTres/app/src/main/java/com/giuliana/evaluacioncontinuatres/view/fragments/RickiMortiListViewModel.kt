package com.giuliana.evaluacioncontinuatres.view.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.giuliana.evaluacioncontinuatres.data.repository.RickiMortiRepository
import com.giuliana.evaluacioncontinuatres.model.ApiResponse
import com.giuliana.evaluacioncontinuatres.model.Rickimorti
import com.giuliana.evaluacioncontinuatres.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RickiMortiListViewModel:ViewModel() {
    val repository= RickiMortiRepository()
    val rickimortiList:MutableLiveData<List<Rickimorti>> =MutableLiveData<List<Rickimorti>>()

    fun getRickiMortiList(){
        val data= getData()
        rickimortiList.value =data
    }
    fun getRickiMortiFromService(){
        viewModelScope.launch(Dispatchers.IO){
            val response=repository.getRickiMorti()
            when(response){
                is ApiResponse.Error -> {

                }
                is ApiResponse.Success -> {
                    rickimortiList.postValue(response.data.results)
                }
            }
        }
    }
}