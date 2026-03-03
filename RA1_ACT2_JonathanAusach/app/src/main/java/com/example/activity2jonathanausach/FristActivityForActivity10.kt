package com.example.activity2jonathanausach

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FristActivityForActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fristactivityforactivity10)

        val ReturnAct10 = findViewById<Button>(R.id.ReturnAct10)
        val OpenSecond = findViewById<Button>(R.id.OpenSecondActivityAct10)

        ReturnAct10.setOnClickListener {
            val IntentAct10 = Intent(this,Activity10::class.java)
            startActivity(IntentAct10)
        }

        OpenSecond.setOnClickListener {
            val IntentSecondOpen = Intent(this,SecondActivtyForActivity10::class.java)
            startActivity(IntentSecondOpen)
        }
    }
}