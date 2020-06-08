package com.example.testapp

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapp.others.AirplaneModeChangedReceiver

class BroadcastReceiverActivity : AppCompatActivity() {

    lateinit var receiver: AirplaneModeChangedReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast_receiver)

        receiver = AirplaneModeChangedReceiver()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver, it)
        }
    }

    //REMEMBER TO IMPLEMENT ON STOP DUE TO MEMORY LEAKS
    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}