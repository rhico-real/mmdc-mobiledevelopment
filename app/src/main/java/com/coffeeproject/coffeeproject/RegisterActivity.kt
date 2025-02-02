package com.coffeeproject.coffeeproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        supportActionBar?.hide()

        // Handle the Sign Up logic here
        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener { finish() }

        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val confirmPasswordEditText = findViewById<EditText>(R.id.confirmPasswordEditText)

        val signUpButton: Button = findViewById(R.id.signUpButton)
        signUpButton.setOnClickListener {
            val name = nameEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()
            val confirmpassword = confirmPasswordEditText.text.toString().trim()

            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmpassword.isEmpty()) {
                Toast.makeText(this, "Input fields are required.", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}