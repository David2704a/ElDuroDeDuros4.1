package com.example.eldurodeduros41

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DogAdapter(private val images: List<String>) : RecyclerView.Adapter<DogsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DogsViewHolder(layoutInflater.inflate(R.layout.item_dogs, parent, false))
    }
    override fun getItemCount(): Int = images.size
    override fun onBindViewHolder(holder: DogsViewHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }
}