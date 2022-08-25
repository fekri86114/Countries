package com.example.countries.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.countries.R
import com.example.countries.databinding.ActivityMain2Binding
import com.example.countries.ui.fragments.SEND_DATA_TO_SECOND_ACTIVITY
import com.example.countries.ui.ux.data.CountriesItem

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarMain)

        binding.collapsingMain.setExpandedTitleColor(
            ContextCompat.getColor(
                this,
                android.R.color.transparent
            )
        )

        // set back item to app
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val dataCountry = intent.getParcelableExtra<CountriesItem>(SEND_DATA_TO_SECOND_ACTIVITY)

        Glide
            .with(this)
            .load(dataCountry!!.flagUrl)
            .error(R.drawable.broken_img)
            .into(binding.imgActivity2Flag)

        Glide
            .with(this)
            .load(dataCountry.imgUniversityUrl)
            .error(R.drawable.broken_img)
            .into(binding.imgUniversity1)

        binding.txtCountryName.text = dataCountry.countryName
        binding.txtAboutCountry.text = dataCountry.aboutCountry
        binding.txtGovernmentType.text = dataCountry.governmentType

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return true
    }
}