package com.example.b1question

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondactivity)
        var length = findViewById<EditText>(R.id.length)
        var breadth = findViewById<EditText>(R.id.breadth)


        var button = findViewById<Button>(R.id.calculate)

        button.setOnClickListener {
            val lengthdata = length.text.toString().toInt()
            val breadthdata = breadth.text.toString().toInt()
            val area = lengthdata * breadthdata;
            Toast.makeText(this@SecondActivity, "Area is $area", Toast.LENGTH_SHORT).show();
        }
    }
}

