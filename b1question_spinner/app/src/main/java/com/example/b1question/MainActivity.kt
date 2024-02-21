package com.example.b1question

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)

        val items = arrayOf("Circle","Square","Rectangle")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)

        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                var selectedItem = parent.getItemAtPosition(position).toString()
                Toast.makeText(this@MainActivity,"item: $selectedItem",Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
                var intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)

        }

    }
}