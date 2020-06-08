package com.example.testapp

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_navigation_drawer.*

class NavigationDrawerActivity : AppCompatActivity() {
    lateinit var toggleButton : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)
        toggleButton = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggleButton)
        toggleButton.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView.setNavigationItemSelectedListener{item->doSth(item)}
    }

    private fun doSth(item:MenuItem):Boolean{
        when(item.itemId){
            R.id.action1 -> Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
            R.id.action2 -> Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
            R.id.action3 -> Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggleButton.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}