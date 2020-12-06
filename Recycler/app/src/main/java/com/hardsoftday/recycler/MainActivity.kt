package com.hardsoftday.recycler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hardsoftday.recycler.adapter.AdapterAnimal
import com.hardsoftday.recycler.models.Animal


class MainActivity : AppCompatActivity() {

    private val adaptador : AdapterAnimal = AdapterAnimal()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerAnimal = findViewById<RecyclerView>(R.id.recyclerAnimal)
        recyclerAnimal.setHasFixedSize(true)
        recyclerAnimal.layoutManager = LinearLayoutManager(this)
        adaptador.AdapterAnimal(crearListaAnimales(), this)
        recyclerAnimal.adapter = adaptador

    }

    private fun crearListaAnimales(): MutableList<Animal> {
        val animals: MutableList<Animal> = arrayListOf()
        animals.add(Animal("Lechuga", "bubonis", R.drawable.owl))
        animals.add(Animal("Perro", "Canis luspus familiaris", R.drawable.dog))
        animals.add(Animal("Elefante", "elephantus nomine", R.drawable.elephant))
        animals.add(Animal("Cisne", "Cygnus olor", R.drawable.swan))
        animals.add(Animal("Gorrion", "Passer domesticus", R.drawable.kingfisher))
        animals.add(Animal("Venado Cola Blanca", "Odocoileus virginianus", R.drawable.fallow))
        animals.add(Animal("Gato", "Felis silvestris catus", R.drawable.gato))
        animals.add(Animal("Orangutan", "Pongo pygmaeus", R.drawable.orangutan))
        animals.add(Animal("Ardilla", "Sciurus vulgaris", R.drawable.ardilla))
        return animals
    }


}