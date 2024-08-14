package com.betrybe.solarsystem.common

import com.betrybe.solarsystem.R
import com.betrybe.solarsystem.domain.planet.Planet

object SolarSystemDatabase {
    private val planets = listOf(
        Planet(
            1,
            "Mercury",
            4879.4,
            7.48e7,
            5.427,
            6.083e10,
            3.3011e23,
            3.7,
            "Mercury is the smallest and innermost planet in the Solar System.",
            R.drawable.mercury
        ),
        Planet(
            2,
            "Venus",
            12103.6,
            4.6e8,
            5.243,
            9.2843e11,
            4.8675e24,
            8.87,
            "Venus is the second planet from the Sun and is Earth's closest planetary neighbor.",
            R.drawable.venus
        ),
        Planet(
            3,
            "Earth",
            12756.2,
            5.10072e8,
            5.515,
            1.08324e10,
            5.97236e24,
            9.780327,
            "Earth is the third planet from the Sun and the only astronomical object known to harbor life.",
            R.drawable.earth
        ),
        Planet(
            4,
            "Mars",
            6792.4,
            1.447985e8,
            3.933,
            1.6318e11,
            6.4171e23,
            3.711,
            "Mars is the fourth planet from the Sun and is often referred to as the Red Planet.",
            R.drawable.mars
        ),
        Planet(
            5,
            "Jupiter",
            142984.0,
            6.21796e10,
            1.326,
            1.43128e15,
            1.8982e27,
            24.79,
            "Jupiter is the fifth planet from the Sun and the largest in the Solar System.",
            R.drawable.jupiter
        ),
        Planet(
            6,
            "Saturn",
            120536.0,
            4.27e10,
            0.687,
            8.2713e14,
            5.6834e26,
            10.44,
            "Saturn is the sixth planet from the Sun and is known for its prominent ring system.",
            R.drawable.saturn
        ),
        Planet(
            7,
            "Uranus",
            51118.0,
            8.1156e9,
            1.27,
            6.833e13,
            8.6810e25,
            8.69,
            "Uranus is the seventh planet from the Sun and has a unique sideways rotation.",
            R.drawable.uranus
        ),
        Planet(
            8,
            "Neptune",
            49528.0,
            7.6183e9,
            1.638,
            6.254e13,
            1.02413e26,
            11.15,
            "Neptune is the eighth and farthest planet from the Sun in the Solar System.",
            R.drawable.neptune
        )
    )

    fun getPlanetById(id: Int) = planets.find { it.id === id }

    fun getPlanets() = planets
}
