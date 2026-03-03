package com.example.activity2jonathanausach

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity8res)

        val UserInput = findViewById<EditText>(R.id.EditTextAct8User)
        val PassInput = findViewById<EditText>(R.id.EditTxtAct8Pass)

        val changeNextActivityButton = findViewById<Button>(R.id.buttonnextact8)
        changeNextActivityButton.setOnClickListener {
            val changeActivityIntent = Intent(this, Activity9::class.java)
            startActivity(changeActivityIntent)
        }

        val changeBackActivityButton = findViewById<Button>(R.id.buttonPreviousact8)
        changeBackActivityButton.setOnClickListener {
            val changeActivityIntent = Intent(this, Activity7::class.java)
            startActivity(changeActivityIntent)
        }

        val SignInButton = findViewById<Button>(R.id.buttonSignInAct8)
        SignInButton.setOnClickListener {
            val MyUser = UserInput.text.toString()
            val MyPassword = PassInput.text.toString()

            //toast
            val ToastMessageACT8 = "NickName: $MyUser\nPassword: $MyPassword"
            Toast.makeText(this, ToastMessageACT8, Toast.LENGTH_SHORT).show()
            //logcat
            val LogcatMessage = "User $MyUser | Password: $MyPassword"
            Log.d("SignInInfo",LogcatMessage)
        }

    }
}