package com.hardsoftday.countryrecycler.data

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hardsoftday.countryrecycler.PlaceDescription
import com.hardsoftday.countryrecycler.R
import com.hardsoftday.countryrecycler.model.Place


class PlaceListAdapter :RecyclerView.Adapter<PlaceListAdapter.ViewHolder>() {

    var countrys: MutableList<Place> = ArrayList()
    lateinit var contexto: Context

    fun PlaceListAdapter(lista: MutableList<Place>, contexto: Context) {
        this.countrys = lista
        this.contexto = contexto
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val country = countrys[position]
        holder.bind(country, contexto)

        holder.itemView.setOnClickListener {
            val i = Intent(contexto, PlaceDescription::class.java)
            contexto.startActivity(i)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.card_layout, parent, false))
    }


    override fun getItemCount(): Int {
        return countrys.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var countryName = view.findViewById<TextView>(R.id.countryId)
        private var city = view.findViewById<TextView>(R.id.cityId)
        private var imagenUrl = view.findViewById<ImageView>(R.id.flagCountry)


        fun bind(country: Place, context: Context) {

            countryName.text = country.countryName
            city.text = country.cityName
            imagenUrl.setImageResource(country.imagenUrl)


        }

    }


}
