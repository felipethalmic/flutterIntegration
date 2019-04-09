package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import io.flutter.facade.Flutter



class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val flutterView = Flutter.createView(this, lifecycle, "route1")
        val layout = FrameLayout.LayoutParams(600, 800)
        layout.leftMargin = 100
        layout.topMargin = 200
        addContentView(flutterView, layout)
    }
}
