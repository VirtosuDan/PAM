package com.example.lab2test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val exampleList = generateDummyList(30)

        recycler_view.adapter = ExampleAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)


        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button2.setOnClickListener{
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener{
            val intent = Intent(this, Activity4::class.java)
            startActivity(intent)
        }


    }

    private fun generateDummyList(size: Int): List<ExampleItem>{

        val list = ArrayList<ExampleItem>()

        for (i in 0 until size ) {
            val drawable = when (i % 3){
                0 -> R.drawable.lexus
                1 -> R.drawable.apart
                else -> R.drawable.mob
            }

            val item = ExampleItem(drawable, "Se vinde $i","Pretul este negociabil")
            list += item
        }
        return list
    }



}