package com.example.testapp

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_permissions.*

class PermissionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permissions)
        button.setOnClickListener {
            requestPermission()
        }
    }


    private fun requestPermission() {
        val permissionsList = mutableListOf<String>()
        val isLocationCoarsePermGranted =
            ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
        if (!isLocationCoarsePermGranted) {
            permissionsList.add(Manifest.permission.ACCESS_COARSE_LOCATION)
        }
        //todo for others
        if(permissionsList.isNotEmpty()){
            ActivityCompat.requestPermissions(this, permissionsList.toTypedArray(), 0)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 0){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                //request location etc
            }
        }
    }
}
