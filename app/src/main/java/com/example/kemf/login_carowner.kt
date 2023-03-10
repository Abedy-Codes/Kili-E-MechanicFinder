package com.example.kemf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login_carowner.*

class login_carowner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_carowner)


        val forgotpasswordCarowner_text : TextView = text_forgotpassword_carowner

        forgotpasswordCarowner_text.setOnClickListener {
            val intentforgotpasswordcarowner = Intent(this, forgotpassword_carowner::class.java)
            startActivity(intentforgotpasswordcarowner)

        }

            val registernowCarowner_text : TextView = registertext_carowner

            registernowCarowner_text.setOnClickListener {
                val intentregistertextcarowner = Intent(this, register_carowner::class.java)
                startActivity(intentregistertextcarowner)

            }


        }
    }
