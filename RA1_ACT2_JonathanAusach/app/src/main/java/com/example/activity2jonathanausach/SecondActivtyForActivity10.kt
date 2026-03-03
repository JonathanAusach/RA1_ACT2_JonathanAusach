package com.example.activity2jonathanausach

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivtyForActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondactivityforactivity10)

        val FristActivityButton = findViewById<Button>(R.id.IraFristActivity)
        val Act10Button = findViewById<Button>(R.id.ACt10ButtonSecond)

        FristActivityButton.setOnClickListener {
            val IntetOpenFristActivity = Intent(this,FristActivityForActivity10::class.java)
            startActivity(IntetOpenFristActivity)
        }

        Act10Button.setOnClickListener {
            val IntetReturnAct10 = Intent(this,Activity10::class.java)
            startActivity(IntetReturnAct10)
        }
    }
}