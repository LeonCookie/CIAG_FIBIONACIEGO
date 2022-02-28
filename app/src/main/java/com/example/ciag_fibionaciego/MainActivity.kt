package com.example.ciag_fibionaciego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast

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

        var X:Int=0;



        button.setOnClickListener{

            if (TextUtils.isEmpty(numberText.text.toString())) {
                Toast.makeText(this, "Empty field not allowed!", Toast.LENGTH_SHORT).show()
            } else {
                X = numberText.text.toString().toInt();//Value from edit text
                progressBar.max = X;

                var a:Long=0;
                var b:Long=1;
                for(i in 1..X){
                    b=b+a;
                    a=b-a;
                    progressBar.progress = i;
                }
            }






        }

    }





}