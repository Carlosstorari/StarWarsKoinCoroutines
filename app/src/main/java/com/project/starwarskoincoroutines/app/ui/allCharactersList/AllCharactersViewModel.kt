package com.project.starwarskoincoroutines.app.ui.allCharactersList

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.project.starwarskoincoroutines.domain.charactersList.UseCaseListCharacters
import com.project.data.StarWarsResponse
import kotlinx.coroutines.*

class AllCharactersViewModel constructor(private val useCaseListCharacters: UseCaseListCharacters) : ViewModel() {
    val errorMessage = MutableLiveData<String>()
    val charactersList = MutableLiveData<StarWarsResponse>()
    var job: Job? = null
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        onError("Exception handled: ${throwable.localizedMessage}")
    }
    val loading = MutableLiveData<Boolean>()

    fun getAllCharacter() {
        job = CoroutineScope(
            Dispatchers.Default
                + exceptionHandler)
            .launch {
                val response = useCaseListCharacters.getCharacters()
                withContext(Dispatchers.Main) {
                    if (response.isSuccessful) {
                        charactersList.postValue(response.body())
                        loading.value = false
                    } else {
                        onError("Error: ${response.message()}")
                    }
                }
            }
    }

    private fun onError(message: String) {
        errorMessage.value = message
        loading.value = false
    }

    override fun onCleared() {
        super.onCleared()
        job?.cancel()
    }
}