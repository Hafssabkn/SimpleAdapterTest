package com.example.mysimpleadapterview

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listV = findViewById<ListView>(R.id.lv)

        val produits = listOf(
            mapOf("name" to "produit1", "price" to "10dh"),
            mapOf("name" to "produit2", "price" to "15dh"),
            mapOf("name" to "produit3", "price" to "20dh")
        )

        val adapter = SimpleAdapter(
            this,
            produits,
            android.R.layout.simple_list_item_2,
            arrayOf("name", "price"),
            intArrayOf(android.R.id.text1, android.R.id.text2)
        )

        listV.adapter = adapter
    }
}
