package com.hardsoftday.cardview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hardsoftday.cardview.R
import com.hardsoftday.cardview.models.Animal

class AdapterAnimal : RecyclerView.Adapter<AdapterAnimal.ViewHolder>(){

    var animales: MutableList<Animal> = ArrayList()
    lateinit var contexto: Context

    fun AdapterAnimal(lista: MutableList<Animal>, contexto: Context) {
        this.animales = lista
        this.contexto = contexto
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animal = animales[position]
        holder.bind(animal, contexto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_list_animal, parent, false))
    }

    override fun getItemCount(): Int {
        return animales.size
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

        private val name = view.findViewById<TextView>(R.id.animalName)
        private val latin = view.findViewById<TextView>(R.id.animalLatin)
        private val imagen = view.findViewById<ImageView>(R.id.imageView)

        fun bind (animal: Animal, context: Context) {
            name.text = animal.name
            latin.text = animal.latin
            imagen.setImageResource(animal.imagen)
        }

    }
}
