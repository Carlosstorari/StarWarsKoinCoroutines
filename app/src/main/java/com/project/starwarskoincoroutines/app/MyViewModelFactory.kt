package com.project.starwarskoincoroutines.app

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.project.starwarskoincoroutines.app.ui.AllCharactersViewModel
import com.project.starwarskoincoroutines.resources.repository.MainRepository
import java.lang.IllegalArgumentException

class MyViewModelFactory constructor(private val repository:
                                     MainRepository
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(AllCharactersViewModel::class.java)) {
            AllCharactersViewModel(this.repository) as T
        } else {
            throw IllegalArgumentException("View Model not found")
        }
    }
}