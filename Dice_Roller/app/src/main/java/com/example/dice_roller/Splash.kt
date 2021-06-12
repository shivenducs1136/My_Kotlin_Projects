package com.example.dice_roller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.dice_roller.MainActivity
import com.example.dice_roller.R

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({

            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)


    }
}