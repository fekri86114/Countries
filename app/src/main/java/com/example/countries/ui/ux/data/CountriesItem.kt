package com.example.countries.ui.ux.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CountriesItem(
    val flagUrl: String,
    val countryName: String,
    val governmentType: String,
    val aboutCountry: String,
    val imgUniversityUrl: String,
    val imgNatureUrl: String
): Parcelable
