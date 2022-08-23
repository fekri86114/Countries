package com.example.countries.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.countries.databinding.ActivityLoginBinding
import com.example.countries.ui.fragments.ProfileFragment
import com.example.countries.ui.ux.Person

const val SEND_PERSON_DATA_KEY = "PERSON_DATA_KEY"

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNextPage.setOnClickListener {

            val name = binding.edtNameLoginPerson.text.toString()
            val job = binding.edtJobLoginPerson.text.toString()
            val about = binding.edtAboutLoginPerson.text.toString()
            val age = binding.edtAgeLoginPerson.text.toString()

            if (name.isNotEmpty() && job.isNotEmpty() && about.isNotEmpty()) {

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

                val data = Person(name, job, about, age)

                val bundle = Bundle()
                bundle.putParcelable(SEND_PERSON_DATA_KEY, data)

                val fragment = ProfileFragment()
                fragment.arguments = bundle

            } else {
                Toast.makeText(this, "Please, fill out all!", Toast.LENGTH_SHORT).show()
            }

        }

    }
}