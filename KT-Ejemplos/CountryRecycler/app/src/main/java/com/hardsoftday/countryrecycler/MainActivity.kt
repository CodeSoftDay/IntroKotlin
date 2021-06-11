package com.hardsoftday.countryrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hardsoftday.countryrecycler.data.PlaceListAdapter
import com.hardsoftday.countryrecycler.model.Place

class MainActivity : AppCompatActivity() {

    private val adaptador : PlaceListAdapter = PlaceListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerCountry = findViewById<RecyclerView>(R.id.recyclerCountry)
        recyclerCountry.setHasFixedSize(true)
        recyclerCountry.layoutManager = LinearLayoutManager(this)
        adaptador.PlaceListAdapter(  createListCountry(), this)
        recyclerCountry.adapter = adaptador

    }

    private fun createListCountry(): MutableList<Place> {
        val country: MutableList<Place> = arrayListOf()
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))
        country.add(Place("Mexico", "Mexico DF", R.drawable.mexico))
        country.add(Place("Canada", "Otawa", R.drawable.canada))
        country.add(Place("USA", "Mexico DF", R.drawable.usa))
        country.add(Place("Argentina", "Buenos Aires", R.drawable.argentina))


        return country


    }

}