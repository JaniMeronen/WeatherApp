package com.example.weatherapp

import java.time.LocalDateTime

data class Forecast(
    val date: LocalDateTime,
    val icon: String,
    val temperature: Double,
)

data class Weather(
    val forecasts: List<Forecast>,
    val location: String
)

abstract class WeatherProvider {
    abstract suspend fun provide(latitude: Double, longitude: Double): Weather
}