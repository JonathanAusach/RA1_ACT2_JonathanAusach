package com.example.activity2jonathanausach

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity10res)

        val Backbutton = findViewById<Button>(R.id.buttonBackAct10)
        Backbutton.setOnClickListener {
            val MyBackIntent = Intent(this,Activity9::class.java)
            startActivity(MyBackIntent)
        }

        val Fristbutton = findViewById<Button>(R.id.buttonFristActivity)
        val Secondbutton = findViewById<Button>(R.id.buttonSecondActivity)

        Fristbutton.setOnClickListener {
            val ChangeFristActivity = Intent(this,FristActivityForActivity10::class.java)
            startActivity(ChangeFristActivity)
        }
        Secondbutton.setOnClickListener {
            val changeSecondActivity = Intent(this,SecondActivtyForActivity10::class.java)
            startActivity(changeSecondActivity)
        }
    }
}