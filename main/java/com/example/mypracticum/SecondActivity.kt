package com.example.mypracticum

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnDisplay = findViewById<Button>(R.id.btnDisplay)
        val btnQuantity = findViewById<Button>(R.id.btnQuantity)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val txtOutput = findViewById<TextView>(R.id.txtOutput)

        btnDisplay.setOnClickListener {
            var output = ""
            val items = MainActivity.itemArray
            val categories = MainActivity.categoryArray
            val quantities = MainActivity.quantityArray
            val comments = MainActivity.commentsArray

            if (items.isEmpty()) {
                txtOutput.text = "Your travel packing list is currently empty."
            } else {
                output = "--- FULL PACKING LIST ---\n\n"
                for (i in items.indices) {
                    output += "Item Name: ${items[i]}\n" +
                            "Category: ${categories[i]}\n" +
                            "Quantity: ${quantities[i]}\n" +
                            "Comments: ${comments[i]}\n" +
                            "-------------------------\n"
                }
                txtOutput.text = output
            }
        }

        btnQuantity.setOnClickListener {
            var output = ""
            val items = MainActivity.itemArray
            val quantities = MainActivity.quantityArray

            if (items.isEmpty()) {
                txtOutput.text = "List is empty. Nothing to filter."
            } else {
                output = "--- ITEMS WITH QUANTITY >= 2 ---\n\n"
                var matchFound = false

                for (i in items.indices) {
                    if (quantities[i] >= 2) {
                        output += "• ${items[i]} (Quantity: ${quantities[i]})\n"
                        matchFound = true
                    }
                }

                if (!matchFound) {
                    output += "No items match criteria."
                }
                txtOutput.text = output
            }
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}