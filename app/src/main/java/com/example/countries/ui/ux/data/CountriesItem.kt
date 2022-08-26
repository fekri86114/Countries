package com.example.countries.ui.ux.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CountriesItem(
    val flagUrl: String,
    val countryName: String,
    val governmentType: String,
    val aboutCountry: String,

    // Universities Url
    val imgNatureUrl: String,
    val imgUniversity1Url: String,
    val imgUniversity2Url: String,
    val imgUniversity3Url: String,

    val countrySite: String,

    // Nature Url
    val imgNature1Url: String,
    val imgNature2Url: String,
    val imgNature3Url: String,

) : Parcelable
