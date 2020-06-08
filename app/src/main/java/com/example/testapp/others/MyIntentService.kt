package com.example.testapp.others

import android.app.IntentService
import android.content.Intent
import android.util.Log
import java.lang.Exception

val TAG = "MyIntentService"

class MyIntentService : IntentService("the name of my service") {

    init {
        instance = this
        Log.d(TAG, "The service has been started")
    }

    companion object {
        var isRunning = false
        lateinit var instance: MyIntentService

        fun stopService() {
            Log.d(TAG, "The service has been stopped")
            isRunning = false
            instance.stopSelf()
        }
    }

    override fun onHandleIntent(p0: Intent?) {
        //that means it is running
        try {
            isRunning = true
            while (isRunning) {

                Thread.sleep(1000)
                Log.d(TAG, "The service is running")
            }
        }
        catch (ex:InterruptedException){
            Thread.currentThread().interrupt()
        }
    }
}