package com.coffeeproject.coffeeproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val buyNowButton = findViewById<Button>(R.id.buyNowButton)

        // Set up the click listener
        buyNowButton.setOnClickListener {
            // Create an Intent to open OrderActivity
            val intent = Intent(this, OrderActivity::class.java)
            startActivity(intent)
        }
    }
}