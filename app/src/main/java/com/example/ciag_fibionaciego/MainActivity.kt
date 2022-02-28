package com.example.ciag_fibionaciego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var numberText:EditText
        lateinit var button:Button
        lateinit var progressBar:ProgressBar

        numberText = findViewById<EditText>(R.id.NumberIn)
        button = findViewById<Button>(R.id.button)
        progressBar = findViewById<ProgressBar>(R.id.progressBar)

        var X:Int=0;//Numer z edit text bar

        button.setOnClickListener{

        }

    }





}