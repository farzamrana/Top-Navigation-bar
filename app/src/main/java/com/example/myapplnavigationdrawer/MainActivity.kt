package com.example.myapplnavigationdrawer

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toggle :ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var drawerLayout :DrawerLayout =findViewById(R.id.Drawerlayout)
        var navView : NavigationView =findViewById(R.id.nav_view)
        supportActionBar?.title="Main page"


        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.nav_home ->{startActivity(Intent(this, HomeActivity::class.java))}
                 R.id.message ->{startActivity(Intent(this, MessagesActivity::class.java))}
                R.id.communicate->{startActivity(Intent(this, CommunicateActivity::class.java))}
                R.id.nav_profile ->{startActivity(Intent(this, ProfileActivity::class.java))}
                R.id.nav_setting ->{startActivity(Intent(this, SettingPage::class.java))}
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}