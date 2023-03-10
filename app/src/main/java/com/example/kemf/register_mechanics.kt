package com.example.kemf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login_mechanic.*
import kotlinx.android.synthetic.main.activity_register_mechanics.*

class register_mechanics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_mechanics)

        val loginhere_text_mechanics : TextView = login_here_register_mechanics

        loginhere_text_mechanics.setOnClickListener {
            val intentloginhere_register_mechanic = Intent(this, login_mechanic::class.java)
            startActivity(intentloginhere_register_mechanic)

        }
    }
}