package com.project.starwarskoincoroutines.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.project.starwarskoincoroutines.data.remote.api.StarWarsApi
import com.project.starwarskoincoroutines.data.remote.response.StarWarsResponse
import com.project.starwarskoincoroutines.domain.CharactersListRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//class CharactersListRepositoryImpl constructor(private val retrofitService: StarWarsApi) :
//    CharactersListRepository {
//    override fun getCharacters(): StarWarsApi {
//        lateinit var charactersList : StarWarsResponse
//
//        CoroutineScope(Dispatchers.Default).launch {
//            charactersList = MainRepository(retrofitService).getCharacters().body()!!
//        }
//
//        return charactersList
//    }
//}