package com.example.countries.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.countries.databinding.FragmentSearchBinding

class SearchFragment: Fragment() {
    lateinit var binding: FragmentSearchBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentSearchBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}