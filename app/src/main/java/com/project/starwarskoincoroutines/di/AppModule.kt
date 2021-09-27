package com.project.starwarskoincoroutines.di

import com.project.starwarskoincoroutines.app.ui.AllCharactersViewModel
import com.project.starwarskoincoroutines.resources.remote.api.StarWarsApi
import com.project.starwarskoincoroutines.resources.repository.MainRepository
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { StarWarsApi.getInstance() }
    factory { MainRepository(get()) }
    viewModel { AllCharactersViewModel(get()) }
}