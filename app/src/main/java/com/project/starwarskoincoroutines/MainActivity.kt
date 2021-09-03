package com.project.starwarskoincoroutines


import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.project.starwarskoincoroutines.app.MainViewModel
import com.project.starwarskoincoroutines.app.MyViewModelFactory
import com.project.starwarskoincoroutines.resources.repository.MainRepository
import com.project.starwarskoincoroutines.resources.remote.api.StarWarsApi
import kotlinx.coroutines.Dispatchers

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val retrofitService = StarWarsApi.getInstance()
        val mainRepository = MainRepository(retrofitService)
        setContentView(R.layout.activity_main)

        val viewText = findViewById<TextView>(R.id.list)

        viewModel = ViewModelProvider(this, MyViewModelFactory(mainRepository)).get(MainViewModel::class.java)

        viewModel.charactersList.observe(this, {

            Log.d("corourineTeste", it.results.toString() )
            viewText.text = it.results.toString()
        })

       viewModel.getAllCharacter()
    }
}