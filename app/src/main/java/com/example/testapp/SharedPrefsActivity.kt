package com.example.testapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_shared_prefs.*

const val SHARED_PREFS_NAME = "myPrefs"
const val KEY_INPUT = "key_input"

class SharedPrefsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_prefs)
        val sharedPrefs = getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)
        val editor = sharedPrefs.edit()

        btSave.setOnClickListener {
            val input = etInput.text.toString()
            editor.apply {
                putString(KEY_INPUT, input)
                apply() //commit() will block the main thread
            }
        }
        btLoad.setOnClickListener {
            val saved = sharedPrefs.getString(KEY_INPUT, null)
            saved?.let {
                etInput.setText(it)
            }
        }
    }
}