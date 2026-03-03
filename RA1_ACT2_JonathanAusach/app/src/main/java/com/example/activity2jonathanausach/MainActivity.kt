package com.example.activity2jonathanausach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changeActivityButton = findViewById<Button>(R.id.NextActivity1)
        changeActivityButton.setOnClickListener {
            val changeActivityIntent = Intent(this, Activity7::class.java)
            startActivity(changeActivityIntent)
        }

        val  MyEditText = findViewById<EditText>(R.id.MyEditText)

        val ToastMessage = findViewById<Button>(R.id.ToastButton)
        ToastMessage.setOnClickListener {
            val MyKey: String = MyEditText.text.toString()
            Toast.makeText(this,"$MyKey",Toast.LENGTH_LONG).show()
        }
    }
}