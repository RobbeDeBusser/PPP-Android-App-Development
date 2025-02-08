package com.rdb.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var startClassicService : Button
    lateinit var startJobIntentService : Button
    lateinit var stopClassicService : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startClassicService = findViewById(R.id.startClassicService)
        startJobIntentService = findViewById(R.id.startJobIntentService)
        stopClassicService = findViewById(R.id.StopClassicService)

        startClassicService.setOnClickListener {

            val intent = Intent(this@MainActivity,ClassicServiceExample::class.java)
            startService(intent)

        }

        startJobIntentService.setOnClickListener {

            val intent = Intent(this@MainActivity,JobIntentServiceExample::class.java)
            JobIntentServiceExample.myBackgroundService(this@MainActivity,intent)

        }
        stopClassicService.setOnClickListener {

            val intent = Intent(this@MainActivity,ClassicServiceExample::class.java)
            stopService(intent)

        }

    }
}