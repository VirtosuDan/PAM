 package com.example.lab2test

 import android.content.Intent
 import android.graphics.Color
 import androidx.appcompat.app.AppCompatActivity
 import android.os.Bundle
 import android.util.Log
 import android.view.View
 import android.widget.Button
 import androidx.recyclerview.widget.LinearLayoutManager
 import kotlinx.android.synthetic.main.activity_main.*
 import kotlinx.android.synthetic.main.activity_second.*

 class MainActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         login_btn.setOnClickListener(){
             if(username_et.text.toString().equals("Virtosu99")
                 &&password_et.text.toString().equals("utm1964")){
                 val intent = Intent(this, SecondActivity::class.java)
                 startActivity(intent)
             }
             else "Login failed"
         }
     }
 }
