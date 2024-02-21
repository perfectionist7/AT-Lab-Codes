package com.example.alertdialog

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    fun showAlert(context: Context, title: String, message: String) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        var textview: TextView = findViewById(R.id.textview)
        builder.setPositiveButton("OK") { dialog, _ ->
            textview.text = "Ok Pressed";
            textview.visibility = View.VISIBLE
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textview: TextView = findViewById<TextView>(R.id.textview)
        var alertbutton: Button = findViewById<Button>(R.id.button)
        var text_final = textview.text;

        alertbutton.setOnClickListener {
            showAlert(this,"Alert", text_final as String)
        }
    }
}