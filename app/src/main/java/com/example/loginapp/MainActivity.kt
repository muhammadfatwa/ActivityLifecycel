package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btnLoginListener()
        btnRegisterListener()
    }


    private fun btnLoginListener() {
        btn_1.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))


        }
    }

    private fun btnRegisterListener() {
        btn_2.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        println("FATWA -> onStar")
    }

    override fun onResume() {
        super.onResume()
        println("FATWA-> onResume")
    }

    override fun onPause() {
        super.onPause()
        println("FATWA-> onPause")
    }

    override fun onStop() {
        super.onStop()
        println("FATWA -> onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("FATWA -> onDestroy")
    }
}
