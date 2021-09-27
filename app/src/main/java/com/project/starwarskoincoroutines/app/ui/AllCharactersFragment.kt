package com.project.starwarskoincoroutines.app.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.starwarskoincoroutines.app.ui.adapter.CharacterAdapter
import com.project.starwarskoincoroutines.databinding.FragmentAllCharactersBinding
import org.koin.android.viewmodel.ext.android.viewModel

class AllCharactersFragment : Fragment() {

    private lateinit var binding: FragmentAllCharactersBinding
    private lateinit var adapter: CharacterAdapter
    private val viewModel: AllCharactersViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAllCharactersBinding.inflate(layoutInflater)

        viewModel.charactersList.observe(viewLifecycleOwner) {

            Log.d("coroutineTeste", it.results.toString())

            val layoutManager = LinearLayoutManager(context)
            adapter = CharacterAdapter(it.results)
            binding.listCharacters.layoutManager = layoutManager
            binding.listCharacters.adapter = adapter
        }

        viewModel.getAllCharacter()

        //loading list

        return binding.root
    }

}