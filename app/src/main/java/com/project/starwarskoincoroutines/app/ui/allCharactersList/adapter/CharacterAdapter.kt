package com.project.starwarskoincoroutines.app.ui.allCharactersList.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.starwarskoincoroutines.databinding.CharacterItemBinding
import com.project.data.People

class CharacterAdapter(private val list: List<People>) :
    RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {

    private lateinit var binding: CharacterItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterAdapter.ViewHolder {
        binding = CharacterItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CharacterAdapter.ViewHolder, position: Int) {
        holder.bindItem(list[position])
    }

    override fun getItemCount() = list.size

    inner class ViewHolder(itemView: CharacterItemBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        private val textViewName = itemView.name
        fun bindItem(character: People) {
            textViewName.text = character.name
        }
    }
}