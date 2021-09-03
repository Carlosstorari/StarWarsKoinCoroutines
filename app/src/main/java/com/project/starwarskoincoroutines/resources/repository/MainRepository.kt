package com.project.starwarskoincoroutines.resources.repository

import com.project.starwarskoincoroutines.resources.remote.api.StarWarsApi

class MainRepository constructor(private val retrofitService: StarWarsApi) {
    suspend fun getCharacters() = retrofitService.getCharacters()
}