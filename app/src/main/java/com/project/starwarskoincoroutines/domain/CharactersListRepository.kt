package com.project.starwarskoincoroutines.domain

import com.project.starwarskoincoroutines.data.remote.api.StarWarsApi
import com.project.starwarskoincoroutines.data.remote.response.StarWarsResponse
import retrofit2.Response

interface CharactersListRepository {

    suspend fun getCharacters(): Response<StarWarsResponse>
}