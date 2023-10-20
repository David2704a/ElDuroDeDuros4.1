package com.example.eldurodeduros41

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.eldurodeduros41.databinding.ItemDogsBinding
import com.squareup.picasso.Picasso

class DogsViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemDogsBinding.bind(view)

    fun bind(images:String){
        Picasso.get().load(images).into(binding.ivDog)
    }
}