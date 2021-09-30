package com.project.starwarskoincoroutines.domain.charactersList

import com.project.data.CharactersListRepository

class UseCaseListCharacters constructor(private val charactersListRepository: CharactersListRepository) {
    suspend fun getCharacters() = charactersListRepository.getCharacters()
}