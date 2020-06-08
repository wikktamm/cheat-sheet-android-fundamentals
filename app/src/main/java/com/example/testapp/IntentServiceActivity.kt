package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.testapp.others.MyIntentService
import kotlinx.android.synthetic.main.activity_intent_service.*

//TODO REMEMBER TO ADD THIS SERVICE IN THE MANIFEST FILE
class IntentServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_service)

        btStart.setOnClickListener {
            Log.d("hi","hi")
            Intent(this, MyIntentService::class.java).also {
                startService(it)
                tvInfo.text = "running"
            }
        }
        btStop.setOnClickListener {
            tvInfo.text = "not running"
            MyIntentService.stopService()
        }
    }
}