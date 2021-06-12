package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val projectButton: BottomNavigationItemView = findViewById(R.id.projectss)

        projectButton.setOnClickListener(View.OnClickListener {
            intent= Intent(this,Skills::class.java)
            startActivity(intent)
        })
    }
}