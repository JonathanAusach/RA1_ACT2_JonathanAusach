package com.example.activity2jonathanausach

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity7res)

        val changeNextActivityButton = findViewById<Button>(R.id.buttonNextActivity7)
        changeNextActivityButton.setOnClickListener {
            val changeActivityIntent = Intent(this, Activity8::class.java)
            startActivity(changeActivityIntent)
        }

        val changeBackActivityButton = findViewById<Button>(R.id.buttonBackActivity7)
        changeBackActivityButton.setOnClickListener {
            val changeActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(changeActivityIntent)
        }

        val IntentRegistro = Intent(this, RegistroActivity7::class.java);

        findViewById<Button>(R.id.FristRegistreButton).setOnClickListener{
            IntentRegistro.putExtra("WhatButton", "FristButton")
            startActivity(IntentRegistro)
        }
        findViewById<Button>(R.id.SecondRegistreButton).setOnClickListener {
            IntentRegistro.putExtra("WhatButton","SecondButton")
            startActivity(IntentRegistro)
        }
        findViewById<Button>(R.id.ThirdRegistreButton).setOnClickListener {
            IntentRegistro.putExtra("WhatButton","ThirdButton")
            startActivity(IntentRegistro)
        }
    }
}
