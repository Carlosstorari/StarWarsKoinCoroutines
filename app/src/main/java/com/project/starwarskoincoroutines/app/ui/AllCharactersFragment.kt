package com.project.starwarskoincoroutines.app.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.starwarskoincoroutines.app.MyViewModelFactory
import com.project.starwarskoincoroutines.app.ui.adapter.CharacterAdapter
import com.project.starwarskoincoroutines.databinding.FragmentAllCharactersBinding
import com.project.starwarskoincoroutines.resources.remote.api.StarWarsApi
import com.project.starwarskoincoroutines.resources.repository.MainRepository

class AllCharactersFragment : Fragment() {

    private lateinit var binding: FragmentAllCharactersBinding
    private lateinit var adapter: CharacterAdapter
    private lateinit var viewModel: AllCharactersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAllCharactersBinding.inflate(layoutInflater)

        val retrofitService = StarWarsApi.getInstance()
        val mainRepository = MainRepository(retrofitService)

        viewModel = ViewModelProvider(
            this,
            MyViewModelFactory(mainRepository)
        ).get(AllCharactersViewModel::class.java)

        viewModel.charactersList.observe(viewLifecycleOwner, {

            Log.d("corourineTeste", it.results.toString())
            //binding.list.text = it.results.toString()
            val layoutManager = LinearLayoutManager(context)
            adapter = CharacterAdapter(it.results)
            binding.listCharacters.layoutManager = layoutManager
            binding.listCharacters.adapter = adapter
        })

        viewModel.getAllCharacter()

        //loading list

        return binding.root
    }

}