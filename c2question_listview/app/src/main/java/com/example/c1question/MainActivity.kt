package com.example.c1question

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val subjects= arrayOf("IT", "CCE", "CSE")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview = findViewById<ListView>(R.id.listview1)
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, subjects)
        listview.adapter = adapter

        listview.setOnItemClickListener { _, _, position, _ ->
            val selecteditem = subjects[position]
            Toast.makeText(this, "Item selected is $selecteditem", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}