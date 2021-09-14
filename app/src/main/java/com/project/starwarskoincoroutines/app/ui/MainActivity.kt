package com.project.starwarskoincoroutines.app.ui


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import com.project.starwarskoincoroutines.R
import com.project.starwarskoincoroutines.app.MainViewModel
import com.project.starwarskoincoroutines.app.MyViewModelFactory
import com.project.starwarskoincoroutines.databinding.ActivityMainBinding
import com.project.starwarskoincoroutines.resources.remote.api.StarWarsApi
import com.project.starwarskoincoroutines.resources.repository.MainRepository

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val retrofitService = StarWarsApi.getInstance()
        val mainRepository = MainRepository(retrofitService)

        /*viewModel = ViewModelProvider(this, MyViewModelFactory(mainRepository)).get(MainViewModel::class.java)

        viewModel.charactersList.observe(this, {

            Log.d("corourineTeste", it.results.toString() )
            binding.list.text = it.results.toString()
        })

       viewModel.getAllCharacter()*/
    }
}