package com.example.myapplnavigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val customActionBar = layoutInflater.inflate(R.layout.setting_bar_custom, null)
        supportActionBar?.setDisplayShowCustomEnabled(true)
        supportActionBar?.customView = customActionBar
        supportActionBar?.title = "Home Activity"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                // Handle the Up navigation (Back) action here
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}