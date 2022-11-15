package com.example.weatherapp

import android.Manifest.permission.ACCESS_COARSE_LOCATION
import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.location.LocationServices.getFusedLocationProviderClient
import com.google.android.gms.location.Priority.PRIORITY_HIGH_ACCURACY
import java.time.format.DateTimeFormatter.ofLocalizedDateTime
import java.time.format.FormatStyle.*
import kotlinx.coroutines.launch

class WeatherActivity : ComponentActivity() {
    private var weather by mutableStateOf(Weather(emptyList(), "Locating..."))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { WeatherContent() }

        requestPermissions(arrayOf(ACCESS_COARSE_LOCATION, ACCESS_FINE_LOCATION), 0)
        if (checkSelfPermission(ACCESS_COARSE_LOCATION) == PERMISSION_GRANTED || checkSelfPermission(ACCESS_FINE_LOCATION) == PERMISSION_GRANTED)
            getFusedLocationProviderClient(this)
                .getCurrentLocation(PRIORITY_HIGH_ACCURACY, null)
                .addOnSuccessListener {
                    lifecycleScope.launch {
                        weather = OpenWeatherMapProvider.provide(it.latitude, it.longitude)
                    }
                }
    }

    @Composable
    @OptIn(ExperimentalMaterialApi::class)
    private fun WeatherContent() {
        MaterialTheme {
            Scaffold(topBar = { TopAppBar({ Text(weather.location) }) }) {
                LazyColumn(Modifier.padding(it)) {
                    items(weather.forecasts) { (date, icon, temperature) ->
                        ListItem(
                            icon = {
                                resources
                                    .getIdentifier("ic_${icon}", "drawable", packageName)
                                    .let { id -> painterResource(id) }
                                    .let { painter -> Image(painter, null) }
                            },
                            overlineText = { Text("") },
                            secondaryText = {
                                date
                                    .format(ofLocalizedDateTime(SHORT))
                                    .let { text -> Text(text) }
                            },
                            text = {
                                temperature
                                    .toInt()
                                    .toString()
                                    .plus("°C")
                                    .let { text -> Text(text) }
                            },
                        )
                    }
                }
            }
        }
    }
}