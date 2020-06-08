package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class ToolbarMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.firstItem -> Toast.makeText(this, "first clicked", Toast.LENGTH_SHORT).show()
            R.id.secondItem -> Toast.makeText(this, "second clicked", Toast.LENGTH_SHORT).show()
            R.id.thirdItem -> Toast.makeText(this, "third clicked", Toast.LENGTH_SHORT).show()
            R.id.fourthItem -> Toast.makeText(this, "fourth clicked", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}