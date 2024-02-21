package com.example.imagegallery
import com.bumptech.glide.Glide
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)

        val imageList = listOf(
            "lion",   // Assuming lion.png is stored in the drawable directory
            "parrot", // Assuming parrot.png is stored in the drawable directory
            "tiger",  // Assuming tiger.png is stored in the drawable directory
            "penguin" // Assuming penguin.png is stored in the drawable directory
        )

        val adapter = ImageAdapter(imageList)
        recyclerView.layoutManager = GridLayoutManager(this, 3) // 3 columns
        recyclerView.adapter = adapter
    }
}

class ImageAdapter(private val imageList: List<String>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imageName = imageList[position]
        val resourceId = holder.itemView.context.resources.getIdentifier(imageName, "drawable", holder.itemView.context.packageName)
        Glide.with(holder.itemView.context)
            .load(resourceId)
            .into(holder.imageView)
    }


    override fun getItemCount(): Int {
        return imageList.size
    }

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }
}

