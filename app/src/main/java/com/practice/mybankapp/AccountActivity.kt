package com.practice.mybankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class AccountActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    var drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
    var navView = findViewById<NavigationView>(R.id.navView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.miItem1 -> Toast.makeText(applicationContext,
                    "Clicked to Check Balance", Toast.LENGTH_SHORT).show()
                R.id.miItem2 -> Toast.makeText(applicationContext,
                        "Clicked to Make Deposit", Toast.LENGTH_SHORT).show()
                R.id.miItem3 -> Toast.makeText(applicationContext,
                        "Clicked to Make Withdrawal", Toast.LENGTH_SHORT).show()
                R.id.miItem4 -> Toast.makeText(applicationContext,
                        "Clicked to Make Transfer", Toast.LENGTH_SHORT).show()
                R.id.miItem5 -> Toast.makeText(applicationContext,
                        "Clicked to View Transaction History", Toast.LENGTH_SHORT).show()
                R.id.miItem6 -> Toast.makeText(applicationContext,
                        "Clicked to Sign Out", Toast.LENGTH_SHORT).show()
            }
            true
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}