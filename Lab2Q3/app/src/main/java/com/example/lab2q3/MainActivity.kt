package com.example.lab2q3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview: ListView = findViewById<ListView>(R.id.listview)
        val colors = arrayOf("Red","Blue","Green")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, colors)
        listview.adapter = adapter

        listview.setOnItemClickListener { _, _, position, _ ->
            val selectedcolor = colors[position]
            val rootView = window.decorView.rootView
            rootView.setBackgroundColor(Color.parseColor(selectedcolor))
        }
    }
}