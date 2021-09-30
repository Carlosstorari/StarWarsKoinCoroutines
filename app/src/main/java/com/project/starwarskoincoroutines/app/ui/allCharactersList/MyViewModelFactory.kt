package com.project.starwarskoincoroutines.app.ui.allCharactersList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.project.starwarskoincoroutines.domain.charactersList.UseCaseListCharacters
import java.lang.IllegalArgumentException

class MyViewModelFactory constructor(private val repository:
                                     UseCaseListCharacters
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(AllCharactersViewModel::class.java)) {
            AllCharactersViewModel(this.repository) as T
        } else {
            throw IllegalArgumentException("View Model not found")
        }
    }
}