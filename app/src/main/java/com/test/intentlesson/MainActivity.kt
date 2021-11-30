package com.test.intentlesson

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var secondActivityButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        secondActivityButton = findViewById(R.id.buttonSecondActivity)
        secondActivityButton.setOnClickListener {
            val secondActivityIntent: Intent = Intent(this, MainActivity2::class.java)
        startActivity(secondActivityIntent)
        }
    }

}