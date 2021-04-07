package com.practice.mybankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterSuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_success)

        // ****************** HOME LINK LOGIC *****************************************

        fun returnToLogin(users: MutableList<Registration>){
            val login = findViewById<TextView>(R.id.btnReturnLogin)
            login.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java);
                startActivity(intent)
            }
        }

        returnToLogin(DataStorage.users)
    }
}