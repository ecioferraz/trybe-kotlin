package com.betrybe.solarsystem

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.betrybe.solarsystem.common.SolarSystemDatabase

class InfoActivity : AppCompatActivity() {

    private val name: TextView by lazy { findViewById(R.id.planet_info_name) }
    private val image: ImageView by lazy { findViewById(R.id.planet_info_image) }
    private val meanDiameter: TextView by lazy { findViewById(R.id.mean_diameter) }
    private val surfaceArea: TextView by lazy { findViewById(R.id.surface_area) }
    private val meanDensity: TextView by lazy { findViewById(R.id.mean_density) }
    private val volume: TextView by lazy { findViewById(R.id.volume) }
    private val mass: TextView by lazy { findViewById(R.id.mass) }
    private val surfaceGravity: TextView by lazy { findViewById(R.id.surface_gravity) }
    private val description: TextView by lazy { findViewById(R.id.description) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val planetId = intent.getIntExtra("planet_id", 0)
        val planet = SolarSystemDatabase.getPlanetById(planetId + 1)!!

        name.text = planet.name
        image.setImageResource(planet.photo)
        meanDiameter.text = planet.meanDiameter.toString()
        surfaceArea.text = planet.surfaceArea.toString()
        meanDensity.text = planet.meanDensity.toString()
        volume.text = planet.volume.toString()
        mass.text = planet.mass.toString()
        surfaceGravity.text = planet.surfaceGravity.toString()
        description.text = planet.description
    }
}