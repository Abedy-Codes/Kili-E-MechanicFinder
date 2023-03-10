package com.example.kemf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login_carowner.*
import kotlinx.android.synthetic.main.activity_login_mechanic.*

class login_mechanic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_mechanic)


        val forgotpasswordmechanicsowner_text : TextView = text_forgotpassword

        forgotpasswordmechanicsowner_text.setOnClickListener {
            val intentforgotpasswordmechanic = Intent(this, forgotpassword_mechanic::class.java)
            startActivity(intentforgotpasswordmechanic)

        }

        val registernowmechanics_text : TextView = registernow_mechanics

        registernowmechanics_text.setOnClickListener {
            val intentregistertextmechanics = Intent(this, dashboard_mechanic::class.java)
            startActivity(intentregistertextmechanics)

        }
    }
}
