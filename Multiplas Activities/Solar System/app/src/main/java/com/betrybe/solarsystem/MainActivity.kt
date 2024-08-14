package com.betrybe.solarsystem

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.betrybe.solarsystem.common.SolarSystemDatabase
import com.betrybe.solarsystem.domain.planet.PlanetAdapter
import com.betrybe.solarsystem.domain.planet.PlanetItemListener

class MainActivity : AppCompatActivity(), PlanetItemListener {

    private val planetList: RecyclerView by lazy { findViewById(R.id.main_rv_planets) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val planets = SolarSystemDatabase.getPlanets()

        val planetAdapter = PlanetAdapter(planets)
        planetAdapter.setPlanetListener(this)

        planetList.layoutManager = LinearLayoutManager(baseContext)
        planetList.adapter = planetAdapter
    }

    override fun onPlanetClick(view: View, position: Int) {
        val intent = Intent(baseContext, InfoActivity::class.java)
        intent.putExtra("planet_id", position)
        startActivity(intent)
    }
}