package com.coffeeproject.coffeeproject

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CoffeeAdapter(
    private val coffeeList: List<String>
) : RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_coffee, parent, false)
        return CoffeeViewHolder(view)
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        holder.bind(coffeeList[position])
    }

    override fun getItemCount(): Int = coffeeList.size

    inner class CoffeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val coffeeNameTextView: TextView = itemView.findViewById(R.id.coffeeName)

        fun bind(coffeeName: String) {
            coffeeNameTextView.text = coffeeName

            // Simple onClick to navigate to DetailActivity
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java)
                itemView.context.startActivity(intent)
            }
        }
    }
}
