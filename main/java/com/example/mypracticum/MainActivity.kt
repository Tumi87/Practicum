package com.example.mypracticum

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object {
    val itemArray = ArrayList<String>()
    val categoryArray = ArrayList<String>()
    val quantityArray = ArrayList<Int>()
    val commentsArray = ArrayList<String>()
}

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    val edtItem = findViewById<EditText>(R.id.edtItem)
    val edtCategory = findViewById<EditText>(R.id.edtCategory)
    val edtQuantity = findViewById<EditText>(R.id.edtQuantity)
    val edtComments = findViewById<EditText>(R.id.edtComments)

    val btnAdd = findViewById<Button>(R.id.btnAdd)
    val btnSecond = findViewById<Button>(R.id.btnSecond)
    val btnExit = findViewById<Button>(R.id.btnExit)

    btnAdd.setOnClickListener {
        val item = edtItem.text.toString().trim()
        val category = edtCategory.text.toString().trim()
        val quantityText = edtQuantity.text.toString().trim()
        val comments = edtComments.text.toString().trim()

        if (item.isEmpty() || category.isEmpty() || quantityText.isEmpty() || comments.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            Log.e("INPUT_ERROR", "Empty fields detected")
        } else {
            val parsedQuantity = quantityText.toIntOrNull()

            if (parsedQuantity == null || parsedQuantity <= 0) {
                Toast.makeText(this, "Quantity must be a valid number greater than 0", Toast.LENGTH_SHORT).show()
                Log.e("INPUT_ERROR", "Invalid quantity format parsed")
            } else {
                itemArray.add(item)
                categoryArray.add(category)
                quantityArray.add(parsedQuantity)
                commentsArray.add(comments)

                Toast.makeText(this, "Item added successfully!", Toast.LENGTH_SHORT).show()
                Log.i("SUCCESS", "Item added to parallel arrays")

                edtItem.text.clear()
                edtCategory.text.clear()
                edtQuantity.text.clear()
                edtComments.text.clear()
            }
        }
    }

    btnSecond.setOnClickListener {
        // Spelling fixed: Points to SecondActivity now
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    btnExit.setOnClickListener {
        finishAffinity()
    }
}
}
