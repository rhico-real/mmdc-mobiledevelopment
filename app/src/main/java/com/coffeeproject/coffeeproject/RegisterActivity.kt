package com.coffeeproject.coffeeproject

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        supportActionBar?.hide()

        // Handle the Sign Up logic here
        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener { finish() }
    }
}