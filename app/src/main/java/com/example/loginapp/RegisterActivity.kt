package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*
import java.time.Instant

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        txtLoginListener()
        btnbackListener()
    }
    private fun txtLoginListener() {
        txt_login.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
    private fun btnbackListener() {
        R_img_1.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}