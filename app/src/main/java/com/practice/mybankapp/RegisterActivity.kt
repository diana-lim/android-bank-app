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
            val intent = Intent(this, RegisterActivity::class.java)

            var fName = findViewById<EditText>(R.id.editTextFirstName) as EditText
            var lName  = findViewById<EditText>(R.id.editTextLastName) as EditText
            var email = findViewById<EditText>(R.id.editTextEmail) as EditText
            var username = findViewById<EditText>(R.id.editTextUsername) as EditText
            var password = findViewById<EditText>(R.id.editTextPassword) as EditText

            user.lastName = lName.text.toString()
            user.email = email.text.toString()
            user.username = username.text.toString()
            user.password = password.text.toString()
            user.firstName = fName.text.toString()

//            Log.d("register", )

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