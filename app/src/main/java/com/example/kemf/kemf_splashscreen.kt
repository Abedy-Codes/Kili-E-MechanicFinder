package com.example.kemf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kemf_splashscreen.*

class kemf_splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kemf_splashscreen)

        splashscreen_img.alpha = 0f
        splashscreen_img.animate().setDuration(3000).alpha(1f).withEndAction {
            val i = Intent(this, select_user::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}