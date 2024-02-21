package com.example.lab2q2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val encryptbutton: Button = findViewById<Button>(R.id.button)
        var textfield: EditText = findViewById<EditText>(R.id.plaintext)
        var textview: TextView = findViewById<TextView>(R.id.textview)
        encryptbutton.setOnClickListener {
            var textedit =  textfield.text.toString();
            var modifiedtext = textedit;

            val modifiedText = StringBuilder(textedit)

            for (i in 0 until modifiedText.length) {
                when (modifiedText[i]) {
                    'A' -> modifiedText.setCharAt(i, 'a')
                    '@' -> modifiedText.setCharAt(i, '!')
                }
            }

            textview.text = "encrypted: $modifiedText";
            textview.visibility = View.VISIBLE

        }

    }
}