package com.example.practicekotlinfundamentals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.practicekotlinfundamentals.ui.theme.PracticeKotlinFundamentalsTheme

/*fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages >= 100) {
        println("Your phone is blowing up! You have 99+ notifications.")
    } else {
        println("You have $numberOfMessages notifications.")
    }
}*/

/*
fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age in 0..12 -> 15 // Детский билет
        age in 13..60 -> if (isMonday) 25 else 30 // Стандартный билет: скидка в понедельник
        age in 61..100 -> 20 // Билет для пожилых людей
        else -> -1 // Некорректный возраст
    }
}*/

/*
fun main() {
    // Цельсий в Фаренгейт
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { celsius ->
        (celsius * 9 / 5) + 32
    }

    // Кельвин в Цельсий
    printFinalTemperature(350.0, "Kelvin", "Celsius") { kelvin ->
        kelvin - 273.15
    }

    // Фаренгейт в Кельвин
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { fahrenheit ->
        (fahrenheit - 32) * 5 / 9 + 273.15
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // две десятичные цифры
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}*/

/*class Song(
    val title: String,
    val artist: String,
    val year: Int,
    var playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("\"$title\" в исполнении $artist было выпущено в $year.")
    }
}

fun main() {
    // Пример использования класса Song
    val song1 = Song("Imagine", "John Lennon", 1971, 500)
    val song2 = Song("Blinding Lights", "The Weeknd", 2019, 1200)

    song1.printDescription()
    println("Популярность: ${if (song1.isPopular) "популярна" else "не популярна"}")

    song2.printDescription()
    println("Популярность: ${if (song2.isPopular) "популярна" else "не популярна"}")
}*/

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        println("Likes to ${hobby ?: "do nothing"}.")

        if (referrer != null) {
            println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {
            println("Doesn't have a referrer.")
        }
    }
}