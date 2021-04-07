package com.practice.mybankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerLink = findViewById<TextView>(R.id.tvRegister)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        var username = findViewById<TextInputLayout>(R.id.inputUsername)
        var password = findViewById<TextInputLayout>(R.id.inputPassword)

        fun openAccount(users: MutableList<Registration>){
            btnLogin.setOnClickListener {
                val intent = Intent(this, AccountActivity::class.java);
                startActivity(intent)
            }
        }
        openAccount(DataStorage.users)

//        fun errorMessage(){
//            var btnLoginAgain = findViewById<Button>(R.id.btnLoginAgain)
//            btnLoginAgain.setOnClickListener {
//                val intent = Intent(this, MainActivity::class.java);
//                startActivity(intent)
//            }
//        }
//
//        if(DataStorage.users.contains(username) && DataStorage.users.contains(password)){
//
//            openAccount(DataStorage.users)
//
//        } //else {
//            errorMessage()
//        }



        // **************Navigating from link to Registration View ***************************************

        registerLink.setOnClickListener {
           val intent = Intent(this, RegisterActivity::class.java);
            startActivity(intent)
        }
    }
}