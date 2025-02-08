package com.rdb.services

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class JobIntentServiceExample : JobIntentService() {

    override fun onHandleWork(intent: Intent) {

        Log.d("TestService","Job IntentService is started.")
        Log.d("TestService Thread",Thread.currentThread().name)
    }

    companion object{

        fun myBackgroundService(context: Context,intent: Intent)
        {
            enqueueWork(context,JobIntentServiceExample::class.java,1,intent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TestService","Job Intent Service is stopped.")
    }

}