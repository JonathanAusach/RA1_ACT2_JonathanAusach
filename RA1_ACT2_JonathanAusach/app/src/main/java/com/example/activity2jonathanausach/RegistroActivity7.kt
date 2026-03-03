package com.example.activity2jonathanausach

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistroActivity7 : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.registreact7)

            val MisUsers = mutableListOf<InfoUser>();

            //este codigo es para abrir la actividad en cuestion
            val InfoButton = intent.getStringExtra("WhatButton")

            val ButtonEnivar = findViewById<Button>(R.id.RegistreButton)


            ButtonEnivar.setOnClickListener {

                //Informacion salavmos en varias variaables
                //primero los edittext comunes
                val Name = findViewById<EditText>(R.id.NomRegistre).text.toString()
                val Cognom = findViewById<EditText>(R.id.cognomsRegistre).text.toString()
                val UserName = findViewById<EditText>(R.id.UsernameRegistre).text.toString()

                //nuemric edittext
                val edat = findViewById<EditText>(R.id.edatRegistre).text.toString().toIntOrNull() ?: 102
                //password
                val Pass = findViewById<EditText>(R.id.PasswordRegistre).text.toString()

                MisUsers.add(InfoUser(Name,Cognom,edat,UserName,Pass))
                Toast.makeText(this,"Registre Complet", Toast.LENGTH_LONG).show()
                val destinationActivity = when (InfoButton) {
                    "FristButton" -> Activity8::class.java
                    "SecondButton" -> Activity9::class.java
                    "ThirdButton" -> Activity10::class.java
                    else -> null
                }

                val IntentOpenActivity = Intent(this,destinationActivity)
                startActivity(IntentOpenActivity)
            }

            //botton especial para cancelar el registro y voler a la activitd 7
            val ButttonCancel = findViewById<Button>(R.id.ButtonBackRegistre)
            ButttonCancel.setOnClickListener {
                val intentCancel = Intent(this,Activity7::class.java);
                startActivity(intentCancel)
            }
        }
}