package com.project.starwarskoincoroutines.app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.project.starwarskoincoroutines.R
import com.project.starwarskoincoroutines.databinding.ActivityMainBinding
import com.project.starwarskoincoroutines.databinding.FragmentAllCharactersBinding

class AllCharactersFragment : Fragment() {

    private lateinit var binding: FragmentAllCharactersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAllCharactersBinding.inflate(layoutInflater)
        binding.teste.text = "Oi"

        return binding.root
    }

}