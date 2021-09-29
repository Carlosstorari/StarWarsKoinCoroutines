package com.project.starwarskoincoroutines.data

import com.project.starwarskoincoroutines.data.remote.api.StarWarsApi
import com.project.starwarskoincoroutines.data.remote.response.StarWarsResponse
import com.project.starwarskoincoroutines.domain.CharactersListRepository
import retrofit2.Response

class MainRepository constructor(private val retrofitService: StarWarsApi) :
    CharactersListRepository {
    override suspend fun getCharacters(): Response<StarWarsResponse> {
        return retrofitService.getCharacters()

    }
}