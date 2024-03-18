package com.example.mytestapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoggedInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged)

        val username = intent.getStringExtra("username")
        val welcomeText = "Välkommen, $username!"
        val welcomeTextView: TextView = findViewById(R.id.welcomeTextView)
        welcomeTextView.text = welcomeText
    }
}
