package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnBackLoginListener()
        txtLoginListener()
    }
    private fun btnBackLoginListener() {
        L_img_1.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    private fun txtLoginListener() {
        txt_register.setOnClickListener{
            startActivity(Intent(this,RegisterActivity::class.java))
        }


    }
}