package com.project.data

import com.project.data.StarWarsResponse
import retrofit2.Response

interface CharactersListRepository {

    suspend fun getCharacters(): Response<StarWarsResponse>
}