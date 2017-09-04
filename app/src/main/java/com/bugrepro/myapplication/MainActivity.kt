package com.bugrepro.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bugrepro.mylibrary.getValueFromProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val textView: TextView =  findViewById(R.id.text_view)
        textView.text = getValueFromProvider()
    }
}
