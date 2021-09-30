package com.project.domain

import com.project.data.CharactersListRepositoryImpl
import com.project.data.CharactersListRepository
import com.project.starwarskoincoroutines.domain.charactersList.UseCaseListCharacters
import org.koin.dsl.binds
import org.koin.dsl.module

val domainModule = module {
    single { CharactersListRepositoryImpl(get()) } binds arrayOf(CharactersListRepository::class)
    factory { UseCaseListCharacters(get()) }
}