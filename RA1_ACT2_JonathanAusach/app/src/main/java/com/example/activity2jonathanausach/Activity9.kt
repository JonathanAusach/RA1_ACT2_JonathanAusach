package com.example.activity2jonathanausach

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class Activity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity9res)

        val ListForChecks = listOf(
            findViewById<CheckBox>(R.id.MyCheckboxProgramacion), //1
            findViewById<CheckBox>(R.id.MyCheckboxPSP), //2
            findViewById<CheckBox>(R.id.MyCheckboxInterfaces), //3
            findViewById<CheckBox>(R.id.MyCheckboxBBD), //4
            findViewById<CheckBox>(R.id.MyCheckboxDiseny), //5
            findViewById<CheckBox>(R.id.MyCheckboxAcces), //6
            findViewById<CheckBox>(R.id.MyCheckboxGameDesign), // 7
            findViewById<CheckBox>(R.id.MyCheckboxMobil), // 8
        );
        val ListRadioGroup = listOf(
            findViewById<RadioGroup>(R.id.Radio1),
            findViewById<RadioGroup>(R.id.Radio2),
            findViewById<RadioGroup>(R.id.Radio3),
            findViewById<RadioGroup>(R.id.Radio4),
            findViewById<RadioGroup>(R.id.Radio5),
            findViewById<RadioGroup>(R.id.Radio6),
            findViewById<RadioGroup>(R.id.Radio7),
            findViewById<RadioGroup>(R.id.Radio8)
        );
        var Start = true;
        if (Start) {
            ListRadioGroup.forEach { it.visibility = View.INVISIBLE }
            Start = false;
        }

        for ((index,check) in ListForChecks.withIndex()){
            val MyRadioCurrent = ListRadioGroup[index]
            check.setOnClickListener {
              if (check.isChecked){
                MyRadioCurrent.visibility = View.VISIBLE
              }
              else {
                MyRadioCurrent.visibility = View.INVISIBLE;
              }
            }
        }

        val buttonNextActivity = findViewById<Button>(R.id.buttonNextAct9)
        buttonNextActivity.setOnClickListener {
            val IntentNextActivity = Intent(this,Activity10::class.java)
            startActivity(IntentNextActivity)
        }

        val buttonBackActivity = findViewById<Button>(R.id.buttonBackAct9)
        buttonBackActivity.setOnClickListener {
            val IntentBackActivity = Intent(this,Activity8::class.java)
            startActivity(IntentBackActivity)
        }
    }
}