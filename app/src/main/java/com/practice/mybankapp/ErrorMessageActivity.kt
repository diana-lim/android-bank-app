package com.practice.mybankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ErrorMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error_message)

        // ************************* RETURN TO LOGIN ************************

        fun returnToLogin(users: MutableList<Registration>){
            val login = findViewById<TextView>(R.id.btnLoginAgain)
            login.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java);
                startActivity(intent)
            }
        }

        returnToLogin(DataStorage.users)
    }
}