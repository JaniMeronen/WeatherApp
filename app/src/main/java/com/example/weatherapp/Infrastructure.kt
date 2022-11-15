package com.example.weatherapp

import java.net.URL
import java.time.Instant.ofEpochSecond
import java.time.LocalDateTime.ofInstant
import java.util.TimeZone.getDefault
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext
import org.json.JSONObject

object OpenWeatherMapProvider : WeatherProvider() {
    override suspend fun provide(latitude: Double, longitude: Double): Weather =
        try {
            "https://api.openweathermap.org/data/2.5/forecast?appid=760628d3c2b9ede15fb9f57de25cd3ee&lat=$latitude&lon=$longitude&units=metric"
                .let(::URL)
                .let { withContext(IO) { it.readText() } }
                .let(::JSONObject)
                .let(::toWeather)
        } catch (_: Exception) { Weather(emptyList(), "") }

    private fun toWeather(root: JSONObject) =
        Weather(
            root
                .getJSONArray("list")
                .let { list ->
                    (0 until list.length()).map { index ->
                        list
                            .getJSONObject(index)
                            .let { item ->
                                Forecast(
                                    item
                                        .getLong("dt")
                                        .let { seconds ->
                                            seconds
                                                .let(::ofEpochSecond)
                                                .let { instant -> ofInstant(instant, getDefault().toZoneId()) }
                                        },
                                    item
                                        .getJSONArray("weather")
                                        .getJSONObject(0)
                                        .getString("icon"),
                                    item
                                        .getJSONObject("main")
                                        .getDouble("temp")
                                )
                            }
                    }
                },
            root
                .getJSONObject("city")
                .getString("name")
        )
}