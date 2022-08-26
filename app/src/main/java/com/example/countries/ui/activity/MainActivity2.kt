package com.example.countries.ui.activity

import android.content.Intent
import android.net.Uri
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

        // Universities
        Glide
            .with(this)
            .load(dataCountry.imgUniversity1Url)
            .error(R.drawable.broken_img)
            .into(binding.imgUniversity1)

        Glide
            .with(this)
            .load(dataCountry.imgUniversity2Url)
            .error(R.drawable.broken_img)
            .into(binding.imgUniversity2)

        Glide
            .with(this)
            .load(dataCountry.imgUniversity3Url)
            .error(R.drawable.broken_img)
            .into(binding.imgUniversity3)

        // View (nature)
        Glide
            .with(this)
            .load(dataCountry.imgNature1Url)
            .error(R.drawable.broken_img)
            .into(binding.imgNature1)

        Glide
            .with(this)
            .load(dataCountry.imgNature2Url)
            .error(R.drawable.broken_img)
            .into(binding.imgNature2)

        Glide
            .with(this)
            .load(dataCountry.imgNature3Url)
            .error(R.drawable.broken_img)
            .into(binding.imgNature3)

        binding.txtCountryName.text = dataCountry.countryName
        binding.txtAboutCountry.text = dataCountry.aboutCountry
        binding.txtGovernmentType.text = dataCountry.governmentType

        binding.fabOpenWebsite.setOnClickListener {

            val url = dataCountry.countrySite
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return true
    }
}