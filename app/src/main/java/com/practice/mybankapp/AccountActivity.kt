package com.practice.mybankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_drawer_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val balanceFragment = BalanceFragment()
        val depositFragment = DepositFragment()
        val withdrawFragment = WithdrawFragment()
        val transferFragment = TransferFragment()
        val transactionsFragment = TransactionsFragment()
        val logoutFragment = LogoutFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, balanceFragment)    // replaces flFragment with firstFragment
            addToBackStack(null)                // adds fragment to back stack so we can use back button
            commit()                                   // commit() must be called after replace() for the changes to apply
        }


        return when (item.itemId) {
            R.id.miItem1 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, balanceFragment)
                    commit()
                }
                true
            }
            R.id.miItem2 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, depositFragment)
                    commit()
                }
                true
            }
            R.id.miItem3 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, withdrawFragment)
                    commit()
                }
                true
            }
            R.id.miItem4 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, transferFragment)
                    commit()
                }
                true
            }
            R.id.miItem5 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, transactionsFragment)
                    commit()
                }
                true
            }
            R.id.miItem6 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFragment, logoutFragment)
                    commit()
                }
                true
            }

            else -> super.onOptionsItemSelected(item)
        }

    }

//    fun signOut() {
//        val signOut = findViewById<View>(R.id.miItem6)
//
//        signOut.setOnClickListener {
//            val intent = Intent(this, LogoutMessageActivity::class.java);
//            startActivity(intent)
//        }
//
//    }
}