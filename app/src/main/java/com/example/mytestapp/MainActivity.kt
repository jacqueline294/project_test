package com.example.mytestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signInButton: Button = findViewById(R.id.signInButton)
        signInButton.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}
