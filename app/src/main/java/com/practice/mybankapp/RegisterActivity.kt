package com.practice.mybankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        var user = Registration()
//        var storage = DataStorage()
        var registerBtn = findViewById<Button>(R.id.btnRegister)

        registerBtn.setOnClickListener(){
            val intent = Intent(this, RegisterActivity::class.java);
            user.firstName = findViewById<EditText>(R.id.editTextFirstName).toString()
            user.lastName = findViewById<EditText>(R.id.editTextLastName).toString()
            user.email = findViewById<EditText>(R.id.editTextEmail).toString()
            user.username = findViewById<EditText>(R.id.editTextUsername).toString()
            user.password = findViewById<EditText>(R.id.editTextPassword).toString()

            DataStorage.users.add(user)

            if(DataStorage.users.size > 0){

                Log.i("RegisterActivity", "Storage works!")

                fun successMessage(users: MutableList<Registration> = mutableListOf()){
                    val intent = Intent(this, RegisterSuccessActivity::class.java);
                    startActivity(intent)
                }
                successMessage(DataStorage.users)


            }
        }

// ****************** HOME LINK LOGIC *****************************************
        val homeLink = findViewById<TextView>(R.id.tvHome)

        // Navigating from link to Home View
        homeLink.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent)
        }
    }
}