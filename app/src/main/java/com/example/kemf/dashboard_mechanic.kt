package com.example.kemf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_dashboard_mechanic.*

class dashboard_mechanic : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_mechanic)

        val drawerLayout : DrawerLayout = dashboard_mechanic_drawerLayout
        val navView : NavigationView = nav_view_mechanic

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        navView.setNavigationItemSelectedListener {

            when(it.itemId){

                R.id.nav_home -> Toast.makeText(applicationContext, "clicked Home", Toast.LENGTH_SHORT).show()
                R.id.nav_Profile -> Toast.makeText(applicationContext, "clicked Profile", Toast.LENGTH_SHORT).show()
                R.id.nav_reviews -> Toast.makeText(applicationContext, "clicked Reviews", Toast.LENGTH_SHORT).show()
                R.id.nav_logout-> Toast.makeText(applicationContext, "clicked Logout", Toast.LENGTH_SHORT).show()
                R.id.nave_deleteAccount-> Toast.makeText(applicationContext, "clicked Delete Account", Toast.LENGTH_SHORT).show()

            }

            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){

            return true
        }

        return super.onOptionsItemSelected(item)
    }

}