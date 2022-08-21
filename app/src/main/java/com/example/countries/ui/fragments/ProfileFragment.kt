package com.example.countries.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.countries.databinding.FragmentProfileBinding
import com.example.countries.ui.activity.SEND_PERSON_DATA_KEY
import com.example.countries.ui.ux.Person

class ProfileFragment : Fragment() {
    lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = arguments

        if (bundle != null) {

            val person = bundle.getParcelable<Person>(SEND_PERSON_DATA_KEY)!!

            binding.txtPersonName.text = person.name
            binding.txtPersonJobPosition.text = person.aboutPerson
            binding.txtAboutPerson.text = person.aboutPerson
            binding.txtPersonAge.text = person.age

        } else {

            binding.txtPersonName.text = "No information sent!"
            binding.txtPersonJobPosition.text = "No information sent!"
            binding.txtAboutPerson.text = "No information sent!"
            binding.txtPersonAge.text = "No information sent!"

        }

    }

}