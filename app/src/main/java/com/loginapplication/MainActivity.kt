package com.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //variable declaration
    lateinit var etEmail : EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    //val var
    val a = 10
    //variable declaration ended
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialization
        etEmail = findViewById(R.id.etName)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        //initialization ends

        //clicks started
        btnLogin.setOnClickListener {
            if(etEmail.text.toString().isNullOrEmpty()){
                etEmail.error = resources.getString(R.string.enter_email)
                val requestFocus = etEmail.requestFocus()
            }else if(etPassword.text.toString().isNullOrEmpty()){

            }
            else{

            }
        }
        //clicks ended
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, "wait app opening", Toast.LENGTH_LONG).show()
    }
}