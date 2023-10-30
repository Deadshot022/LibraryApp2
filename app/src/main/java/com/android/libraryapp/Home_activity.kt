package com.android.libraryapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView



class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private var drawerLayout: DrawerLayout? = null
    private var toolbar: Toolbar?=null


    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


        drawerLayout = findViewById(R.id.drawer_layout)
        actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerLayout?.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        drawerLayout?.addDrawerListener(actionBarDrawerToggle)

//        val toolbar: Toolbar = findViewById(R.id.toolbar) //Ignore red line errors
//        setSupportActionBar(toolbar)
//        drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
//        val toggle = ActionBarDrawerToggle(
//            this, drawerLayout, toolbar, R.string.navigation_drawer_open,
//            R.string.navigation_drawer_close
//        )
//        drawerLayout?.addDrawerListener(toggle)
//        toggle.syncState()

//
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.framelayout, AccountFragment()).commit()
            navigationView.setCheckedItem(R.id.nav_home)
        }

        drawerLayout!!.closeDrawer(GravityCompat.START)
//    }
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, AccountFragment()).commit()

            R.id.nav_settings -> supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, SettingsFragment()).commit()

            R.id.nav_share -> supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, ShareFragment()).commit()

            R.id.nav_about -> supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, AboutFragment()).commit()

            R.id.nav_logout -> Toast.makeText(this, "Logout!", Toast.LENGTH_SHORT).show()
        }
        drawerLayout!!.closeDrawer(GravityCompat.START)

        return true
    }

    override fun onBackPressed() {
        if (drawerLayout!!.isDrawerOpen(GravityCompat.START)) {
            drawerLayout!!.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }
//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        val inflater = MenuInflater()
//        inflater.inflate(R.menu.main, menu)
//        return true
//    }

}

