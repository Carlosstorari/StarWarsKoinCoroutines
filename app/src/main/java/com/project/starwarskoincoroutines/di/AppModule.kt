package com.project.starwarskoincoroutines.di

import com.project.starwarskoincoroutines.app.ui.allCharactersList.AllCharactersViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
//    single { StarWarsApi.getInstance() }
//    single { CharactersListRepositoryImpl(get()) } binds arrayOf(CharactersListRepository::class)
//    factory { UseCaseListCharacters(get()) }
    viewModel { AllCharactersViewModel(get()) }
}