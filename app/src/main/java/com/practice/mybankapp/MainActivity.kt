package com.practice.mybankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerLink = findViewById<TextView>(R.id.tvRegister)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            openAccount(DataStorage.users)
        }




        // **************Navigating from link to Registration View ***************************************

        registerLink.setOnClickListener {
           val intent = Intent(this, RegisterActivity::class.java);
            startActivity(intent)
        }
        // ************************************************************************************************
    }

    private fun errorMessage(){
        val intent = Intent(this, ErrorMessageActivity::class.java);
        startActivity(intent)
    }

    private fun openAccount(users: MutableList<Registration>){
        var username = findViewById<TextInputEditText>(R.id.editUsername) as EditText
        var password = findViewById<TextInputEditText>(R.id.editPassword) as EditText

        Log.d("MainActivity", username.text.toString() )
        Log.d("MainActivity", password.text.toString())
        Log.d("MainActivity", DataStorage.users.elementAt(0).getUserName().toString())
        Log.d("MainActivity", DataStorage.users.elementAt(0).getPassword().toString())

        if(DataStorage.users.elementAt(0).getUserName() == username.text.toString() && DataStorage.users.elementAt(0).getPassword() == password.text.toString()){
//        if(DataStorage.users.contains(username) && DataStorage.users.contains(password)){
            val intent = Intent(this, AccountActivity::class.java);
            startActivity(intent)
        } else {
            errorMessage()
        }
    }
}