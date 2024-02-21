package com.example.feedbacksystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        var final_feedback = findViewById<TextView>(R.id.final_feedback)
        val name = intent.getStringExtra("key")
        val custid = intent.getStringExtra("key2")
        val feedback = intent.getStringExtra("key3")

        final_feedback.text = "Name: $name with customer id: $custid and the feedback is $feedback"
        final_feedback.visibility = View.VISIBLE


    }
}