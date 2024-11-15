package com.coffeeproject.coffeeproject

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        // Handle back button click (optional)
//        findViewById<ImageView>(R.id.backButton).setOnClickListener {
//            onBackPressed()
//        }

        // Handle order button click
        findViewById<Button>(R.id.btnOrder).setOnClickListener {
            // Code to handle order placement
            // For now, just a placeholder Toast message
            Toast.makeText(this, "Order placed!", Toast.LENGTH_SHORT).show()
        }
    }
}