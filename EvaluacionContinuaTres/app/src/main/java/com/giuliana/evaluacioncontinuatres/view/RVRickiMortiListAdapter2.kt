package com.giuliana.evaluacioncontinuatres.view.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.giuliana.evaluacioncontinuatres.R
import com.giuliana.evaluacioncontinuatres.databinding.ItemRickimortifavoriteBinding
import com.giuliana.evaluacioncontinuatres.model.Rickimorti

class RVRickiMortiListAdapter2(var results: List<Rickimorti>): RecyclerView.Adapter<RickiMorti2VH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RickiMorti2VH {
        val binding = ItemRickimortifavoriteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RickiMorti2VH(binding)
    }

    override fun getItemCount(): Int = results.size

    override fun onBindViewHolder(holder: RickiMorti2VH, position: Int) {
        holder.bind(results.run { get(position) })
    }
}

class RickiMorti2VH(private val binding: ItemRickimortifavoriteBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(results: Rickimorti) {
        Glide.with(binding.root.context)
            .load(results.image)
            .placeholder(R.drawable.ic_list)
            .error(R.drawable.ic_list)
            .into(binding.imageView)
        binding.name.text = results.name
        binding.status.text = results.status
        binding.species.text=results.species
        binding.gender.text=results.gender
    }
}