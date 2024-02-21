package com.example.gridview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
        val gridAdapter = GridAdapter(this, items)
        val gridView: GridView = findViewById(R.id.gridview)
        gridView.adapter = gridAdapter

        gridView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            // Do something with the selected item
            Toast.makeText(this, "Selected Item: $selectedItem", Toast.LENGTH_SHORT).show()
        }

    }
}


class GridAdapter(private val context: Context, private val items: List<String>) : BaseAdapter() {

    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.grid_item_layout, parent, false)
        val itemTextView: TextView = view.findViewById(R.id.textView)
        itemTextView.text = items[position]
        return view
    }
}
