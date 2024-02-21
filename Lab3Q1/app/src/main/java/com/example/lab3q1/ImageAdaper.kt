package com.example.lab3q1

import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

data class Image(val resourceId: Int)

class ImageAdapter(private val images: List<Image>):
        RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
                return ImageViewHolder(view)
            }

            override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
                val image = images[position]
                holder.imageView.setImageResource(image.resourceId)
            }

            override fun getItemCount(): Int {
                return images.size
            }

            class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                val imageView: ImageView = itemView.findViewById(R.id.imageView)
            }
        }