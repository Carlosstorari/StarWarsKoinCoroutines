package com.project.starwarskoincoroutines.app.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.project.starwarskoincoroutines.R
import com.project.starwarskoincoroutines.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)
        val btn = binding.testBtn

        btn.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_homeFragment_to_allCharactersFragment)
        }

        return binding.root
    }

}