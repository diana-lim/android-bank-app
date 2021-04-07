package com.practice.mybankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val btnLogout = findViewById<Button>(R.id.btnLogout)




// ******************************** TO LOGOUT MESSAGE ***************************************
        btnLogout.setOnClickListener {
            val intent = Intent(this, LogoutMessageActivity::class.java);
            startActivity(intent)
        }
    }
}