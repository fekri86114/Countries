package com.example.countries.ui.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.countries.R
import com.example.countries.databinding.ActivityMainBinding
import com.example.countries.ui.fragments.HomeFragment
import com.example.countries.ui.fragments.InternetFragment
import com.example.countries.ui.fragments.ProfileFragment
import com.example.countries.ui.fragments.SearchFragment
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarMain)

        val actionbarDrawerToggle = ActionBarDrawerToggle(
            this,
            binding.draweLayoutMain,
            binding.toolbarMain,
            R.string.open_drawer,
            R.string.close_drawer
        )

        binding.draweLayoutMain.addDrawerListener(actionbarDrawerToggle)
        actionbarDrawerToggle.syncState() // set icon and give an anim to icon

        binding.navigationViewMin.setNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.menu_open_site_travel -> {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(""))
                }
            }

            true
        }

        firstRun()

        // bottom navigation part
        binding.bottomNavigationMain.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.menu_search_countries -> {
                    replaceFragment(SearchFragment())
                }
                R.id.menu_home -> {
                    replaceFragment(HomeFragment())
                }

                R.id.menu_profile -> {
                    replaceFragment(ProfileFragment())
                }

            }

            true
        }

        binding.bottomNavigationMain.setOnItemReselectedListener { } // cancel reselect items
    }

    fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_main_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun firstRun() {
        replaceFragment(HomeFragment())
        binding.bottomNavigationMain.selectedItemId = R.id.menu_home
    }

}