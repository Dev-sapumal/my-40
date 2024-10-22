package com.example.my40counter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "StringFormatInvalid")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val myButton: Button = findViewById(R.id.Button)
//        val resetButton = findViewById<Button>(R.id.button2)
//        val show = findViewById<TextView>(R.id.num)
//        var count = 0
//
//        myButton.setOnClickListener{
//            count += 1
//            show.text = count.toString()
//            Toast.makeText(this, "Done$count", Toast.LENGTH_SHORT).show()
//        }
//        resetButton.setOnClickListener {
//            val message = getString(R.string.reset_message, count)
//            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//        }
}
}