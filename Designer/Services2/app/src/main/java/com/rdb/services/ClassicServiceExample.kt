package com.rdb.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ClassicServiceExample : Service() {

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()

        Log.d("TestService","Classic Service is created.")

    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Log.d("TestService","Classic Service is started.")
        Log.d("TestService Thread",Thread.currentThread().name)

        //stopSelf()

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TestService","Classic Service is stopped.")
    }
}