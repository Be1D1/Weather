package com.example.weather

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.weather.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cityName.text = "Москва"
        binding.temperature.text = "Температура: 25°C"
        binding.weatherDescription.text = "Описание: Солнечно"
        binding.weatherIcon.setImageResource(R.drawable.ic_weather_placeholder)


        binding.updateButton.setOnClickListener {
            updateWeather()
        }
    }

    private fun updateWeather() {
        // всякие значения
        val cities = listOf("Москва", "Санкт-Петербург", "Казань", "Екатеринбург", "Новосибирск")
        val temperatures = listOf("20°C", "22°C", "25°C", "30°C", "15°C")
        val descriptions = listOf("Солнечно", "Облачно", "Дождливо", "Ветреная погода", "Снег")

        // рандомчик
        val randomCity = cities.random()
        val randomTemperature = temperatures.random()
        val randomDescription = descriptions.random()

        // обновляем текстик
        binding.cityName.text = randomCity
        binding.temperature.text = "Температура: $randomTemperature"
        binding.weatherDescription.text = "Описание: $randomDescription"
    }
}