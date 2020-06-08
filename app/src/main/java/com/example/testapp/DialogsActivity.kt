package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_dialogs.*

class DialogsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialogs)

        val options = arrayOf("First item", "Second item", "Third item")

        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Yes no question")
            .setSingleChoiceItems(options, 0) { _, i ->
                Toast.makeText(this, "Clicked on $i", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "Clicked on ACCEPT", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "Clicked on DECLINE", Toast.LENGTH_SHORT).show()
            }
            .create()

        bt1.setOnClickListener {
            singleChoiceDialog.show()
        }

        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("multi choice question")
            .setMultiChoiceItems(
                options,
                booleanArrayOf(false, false, false)
            ) { _, i, b ->
                if(b){
                    Toast.makeText(this, "checked $i", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "unchecked $i", Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "Clicked on ACCEPT", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "Clicked on DECLINE", Toast.LENGTH_SHORT).show()
            }
            .create()

        bt2.setOnClickListener {
            multiChoiceDialog.show()
        }
    }
}