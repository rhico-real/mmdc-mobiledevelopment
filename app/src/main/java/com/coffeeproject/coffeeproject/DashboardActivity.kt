package com.coffeeproject.coffeeproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Set up RecyclerView with GridLayoutManager
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2 columns in grid
        recyclerView.adapter = CoffeeAdapter(getCoffeeList())
    }

    // Function to create a list of "Caffe Mocha" items
    private fun getCoffeeList(): List<String> {
        return List(10) { "Caffe Mocha" } // Creates a list of 10 "Caffe Mocha" items
    }
}