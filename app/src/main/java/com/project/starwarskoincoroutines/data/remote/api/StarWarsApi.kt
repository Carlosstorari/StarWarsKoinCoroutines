package com.project.starwarskoincoroutines.data.remote.api

import com.project.starwarskoincoroutines.data.remote.response.StarWarsResponse
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface StarWarsApi {

    @GET("people")
    suspend fun getCharacters(): Response<StarWarsResponse>

    companion object {
        var retrofitService: StarWarsApi? = null
        fun getInstance() : StarWarsApi {
            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://swapi.dev/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(StarWarsApi::class.java)
            }
            return retrofitService!!
        }

    }
}