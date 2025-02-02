package com.coffeeproject.coffeeproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val registerNowTextView: TextView = findViewById(R.id.registerNowTextView)
        registerNowTextView.setOnClickListener(View.OnClickListener { // Redirect to RegisterActivity
            val intent = Intent(
                this@SecondActivity,
                RegisterActivity::class.java
            )
            startActivity(intent)
        })

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton: Button = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Email and Password is required.", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}
