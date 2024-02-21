package com.example.feedbacksystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nameview = findViewById<EditText>(R.id.nametextview)
        var custview = findViewById<EditText>(R.id.custidtextview)
        var feedback = findViewById<EditText>(R.id.feedbacktextview)
        var submitbutton = findViewById<Button>(R.id.submit)

        submitbutton.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", nameview.text.toString())
            intent.putExtra("key2", custview.text.toString())
            intent.putExtra("key3", feedback.text.toString())
            startActivity(intent)


        }

    }
}