package com.example.kemf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_register_carowner2.*
import kotlinx.android.synthetic.main.activity_register_mechanics.*

class register_carowner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_carowner2)


        val loginhere_text_carowner: TextView = register_loginheretext_carowner

        loginhere_text_carowner.setOnClickListener {
            val intentloginhere_register_mechanic = Intent(this, login_carowner::class.java)
            startActivity(intentloginhere_register_mechanic)
        }
    }
}