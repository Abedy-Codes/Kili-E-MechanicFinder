package com.example.kemf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_select_user.*

class select_user() : AppCompatActivity() {
    private lateinit var spinner: Spinner
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_user)

        spinner = select_user_spinner
        button = select_user_button

        val users = listOf("Choose your option", "Join as a mechanic" , "Join as a car owner")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, users)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        button.setOnClickListener {
            val selectedItem = spinner.selectedItem.toString()
            if (selectedItem == "Choose your option") {
                Toast.makeText(this, "Please choose an option", Toast.LENGTH_SHORT).show()
            } else if (selectedItem == "Join as a mechanic") {
                val intent = Intent(this, login_mechanic::class.java)
                startActivity(intent)
            } else if (selectedItem == "Join as a car owner" ) {
                val intent = Intent(this, login_carowner::class.java)
                startActivity(intent)
            }
        }
    }
}

