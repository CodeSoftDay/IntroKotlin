package com.hardsoftday.recycler.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hardsoftday.recycler.AnimalDetails
import com.hardsoftday.recycler.R
import com.hardsoftday.recycler.models.Animal


class AdapterAnimal : RecyclerView.Adapter<AdapterAnimal.ViewHolder>() {

    var animales: MutableList<Animal> = ArrayList()
    lateinit var contexto: Context

    fun AdapterAnimal(lista: MutableList<Animal>, contexto: Context) {
        this.animales = lista
        this.contexto = contexto
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animal = animales[position]
        holder.bind(animal, contexto)

        holder.itemView.setOnClickListener {
            val i = Intent(contexto, AnimalDetails::class.java)
            contexto.startActivity(i)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.elementos_listas_animales, parent, false))

    }

    override fun getItemCount(): Int {
        return animales.size
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        private val name = view.findViewById(R.id.animalName) as TextView
        private val latin = view.findViewById(R.id.animalNameLatin) as TextView
        private val imagen = view.findViewById(R.id.imageView) as ImageView

        fun bind(animal: Animal, context: Context) {
            name.text = animal.name
            latin.text = animal.latin
            imagen.setImageResource(animal.imagen)  

        }

    }

}