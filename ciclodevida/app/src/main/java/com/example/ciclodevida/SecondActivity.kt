package com.example.ciclodevida

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class SecondActivity : Activity() {

    companion object {
        private const val TAG = "SecondActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i(TAG, "onCreate chamado")

        val buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart chamado")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause chamado")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop chamado")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart chamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy chamado")
    }
}