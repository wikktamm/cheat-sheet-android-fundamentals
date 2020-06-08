package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_spinners.*

class SpinnersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinners)

        val newList = listOf<String>("new one", "new two", "new three")
        val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, newList)
        spinner2.adapter = adapter
        spinner2.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(this@SpinnersActivity, "You chose ${p0?.getItemAtPosition(p2)}", Toast.LENGTH_SHORT).show()
            }
        }

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //todo
                Toast.makeText(this@SpinnersActivity, "You chose ${p0?.getItemAtPosition(p2)}", Toast.LENGTH_SHORT).show()
            }

        }
    }
}