package com.example.myapplnavigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class SettingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting_page)

        val customActionBar = layoutInflater.inflate(R.layout.setting_bar_custom, null)
        supportActionBar?.setDisplayShowCustomEnabled(true)
        supportActionBar?.customView = customActionBar
        supportActionBar?.title = "Setting Activity"
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