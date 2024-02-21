package com.example.c1question

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newactivity)
        var button = findViewById<Button>(R.id.button)
        var physics = findViewById<EditText>(R.id.physics)
        var chemistry = findViewById<EditText>(R.id.chemistry)
        var maths = findViewById<EditText>(R.id.maths)

        button.setOnClickListener {
            var physicsfinal = physics.text.toString();
            var chemistryfinal = chemistry.text.toString();
            var mathsfinal = maths.text.toString();

            val threshold = 200;

            val physicsint = physicsfinal.toInt()
            val chemistryint = chemistryfinal.toInt()
            val mathsint = mathsfinal.toInt()
            print(physicsint)
            print(chemistryint)
            print(mathsint)
            if ((physicsint + chemistryint + mathsint) > threshold) {
                showAlert(this, "Alert", "Above the threshold")
            }
        }

    }
    fun showAlert(context: Context, title: String, message: String) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss()
        }
        val dialog= builder.create()
        dialog.show()

    }
}
