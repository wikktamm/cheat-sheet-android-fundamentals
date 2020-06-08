package com.example.testapp.others

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeOn = intent?.getBooleanExtra("state", false) ?: return
//        val isAirplaneModeOn = intent?.extras?.getBoolean("state", false)
        if(isAirplaneModeOn){
            Toast.makeText(context, "airplane mode on", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(context, "airplane mode off", Toast.LENGTH_SHORT).show()

        }
    }
}