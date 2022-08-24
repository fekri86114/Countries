package com.example.countries.ui.ux

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(

    val name: String,
    val job: String,
    val aboutPerson: String,
    val age: String

): Parcelable
