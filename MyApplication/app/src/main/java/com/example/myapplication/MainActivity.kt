package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recycleview: RecyclerView
    private lateinit var moves: TextView
    private lateinit var pairs: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleview = findViewById(R.id.recycleview)
        moves = findViewById<int>(R.id.moves)
        pairs = findViewById<int>(R.id.pairs)

        recycleview.adapter = MemoryBoardAdapter(this, 8)
        recycleview.setHasFixedSize(true)
        recycleview.layoutManager = GridLayoutManager(this, 2)



    }

}

