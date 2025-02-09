package com.rdb.fragmentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Message","First Activity onCreate")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message","First Activity onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message","First Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message","First Activity onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message","First Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message","First Activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message","First Activity onRestart")
    }
}