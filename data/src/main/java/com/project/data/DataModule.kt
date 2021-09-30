package com.project.data

import org.koin.dsl.module

val dataModule = module {
    single { StarWarsApi.getInstance() }
}