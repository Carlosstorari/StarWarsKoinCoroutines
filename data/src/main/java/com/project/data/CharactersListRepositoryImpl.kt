package com.project.data



import retrofit2.Response

class CharactersListRepositoryImpl constructor(private val retrofitService: StarWarsApi) :
    CharactersListRepository {
    override suspend fun getCharacters(): Response<StarWarsResponse> {
        return retrofitService.getCharacters()

    }
}