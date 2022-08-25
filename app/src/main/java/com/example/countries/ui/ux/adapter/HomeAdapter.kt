package com.example.countries.ui.ux.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.countries.R
import com.example.countries.databinding.ItemHomeBinding
import com.example.countries.ui.ux.data.CountriesItem

class HomeAdapter(private val data: ArrayList<CountriesItem>, val itemEvents: ItemEvents) :
    RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    lateinit var binding: ItemHomeBinding

    inner class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindViews(countriesItem: CountriesItem) {

            Glide
                .with(itemView.context)
                .load(countriesItem.flagUrl)
                .error(R.drawable.broken_img)
                .into(binding.imgHomeMain)

            Glide
                .with(itemView.context)
                .load(countriesItem.imgUniversityUrl)
                .error(R.drawable.broken_img)
                .into(binding.imgShowUniversity1)

            Glide
                .with(itemView.context)
                .load(countriesItem.imgNatureUrl)
                .error(R.drawable.broken_img)
                .into(binding.imgShowUniversity2)

            binding.txtExploreTitle.text = countriesItem.countryName
            binding.txtHomeSubtitle.text = countriesItem.governmentType
            binding.txtExploreDetail.text = countriesItem.aboutCountry

            itemView.setOnClickListener {
                itemEvents.onItemClicked(countriesItem)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bindViews(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}