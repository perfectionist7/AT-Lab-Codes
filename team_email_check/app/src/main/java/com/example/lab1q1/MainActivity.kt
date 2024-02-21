package com.example.lab1q1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitbutton: Button = findViewById<Button>(R.id.button)
        val emailid: EditText = findViewById<EditText>(R.id.emailaddress)
        val mobilenumber: EditText = findViewById<EditText>(R.id.mobilenumber)
        val password: EditText = findViewById(R.id.password)
        var mobileval = false
        var emailval = false

        submitbutton.setOnClickListener {
            val emailid_final = emailid.text.toString();
            val mobile_final = mobilenumber.text.toString();
            val password = password.text.toString();

            if(mobile_final.length == 10) {
                mobileval = true;
            }
            else {
                Toast.makeText(this, "Invalid Mobile Number Entered", Toast.LENGTH_SHORT).show();
            }

            if(emailid_final.contains('@')) {
                emailval = true
            }
            else {
                Toast.makeText(this,"Invalid email address", Toast.LENGTH_SHORT).show();
            }

            if(mobileval == true && emailval == true) {
                Toast.makeText(this, "All fields entered are correct! Account Created", Toast.LENGTH_SHORT).show();
            }
        }

    }
}