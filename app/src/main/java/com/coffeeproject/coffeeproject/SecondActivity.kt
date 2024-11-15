package com.coffeeproject.coffeeproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

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

        val loginButton: Button = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            // Assume credentials are validated
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()  // Optional: Prevent returning to the login screen
        }
    }
}
