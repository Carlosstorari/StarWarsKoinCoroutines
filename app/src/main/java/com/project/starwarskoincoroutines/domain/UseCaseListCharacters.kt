package com.project.starwarskoincoroutines.domain

class UseCaseListCharacters constructor(private val charactersListRepository: CharactersListRepository) {
    suspend fun getCharacters() = charactersListRepository.getCharacters()
}