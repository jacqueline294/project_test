package com.example.mytestapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signed)

        val signInButton: Button = findViewById(R.id.signInButton)
        val usernameEditText: EditText = findViewById(R.id.usernameEditText)

        signInButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            if (isValidUser(username)) {
                val intent = Intent(this, LoggedInActivity::class.java)
                intent.putExtra("username", username)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Ogiltigt användarnamn", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isValidUser(username: String): Boolean {
        val validUsers = arrayOf("user1", "user2", "user3") // fördefinierad array av giltiga användare
        return validUsers.contains(username)
    }
}
