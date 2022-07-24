package com.example.project01_hellofromben

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

//Kotlin file is where user input function is coded
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //The following code allows the user to change the
        //color of the central text

        //get button from xml file and add event listener
        findViewById<Button>(R.id.button).setOnClickListener {
            //log message
            Log.i("Ben", "Text Button Pressed!")
            //get text from xml and change the color
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.red_hacker))
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            //log message
            Log.i("background", "Background Button Pressed!")
            //get text from xml and change the background
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.purple_500))
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            //log message
            Log.i("change", "Change Text Button Pressed!")
            //get text from xml and change the text

            val simpleEditText = findViewById<EditText>(R.id.et_simple)
            val strValue = simpleEditText.getText().toString()
            findViewById<TextView>(R.id.textView).setText(strValue)
        }


    }
}