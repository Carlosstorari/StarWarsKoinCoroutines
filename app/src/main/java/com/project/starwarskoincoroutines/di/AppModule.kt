package com.project.starwarskoincoroutines.di

import com.project.starwarskoincoroutines.app.ui.AllCharactersViewModel
import com.project.starwarskoincoroutines.data.MainRepository
import com.project.starwarskoincoroutines.data.remote.api.StarWarsApi
import com.project.starwarskoincoroutines.domain.CharactersListRepository
import com.project.starwarskoincoroutines.domain.UseCaseListCharacters
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.binds
import org.koin.dsl.module

val appModule = module {
    single { StarWarsApi.getInstance() }
    single { MainRepository(get()) } binds arrayOf(CharactersListRepository::class)
    factory { UseCaseListCharacters(get()) }
    viewModel { AllCharactersViewModel(get()) }
}