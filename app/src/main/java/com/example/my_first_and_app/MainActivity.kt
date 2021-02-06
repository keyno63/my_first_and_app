package com.example.my_first_and_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private val clickedString: String = "hello sample text code by click."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun changeTextView(view: View): Unit {
        val helloText: TextView = findViewById(R.id.messageTextView2)
        helloText.text = clickedString
    }
}
