package observer.weatherdata.scratch

/**
 * Created by devansh on 26/08/20.
 */

fun main() {
    val weatherData = WeatherData()

    CurrentConditionsDisplay(weatherData)

    weatherData.setMeasurements(80f, 60f, 30.4f)
    weatherData.setMeasurements(82f, 70f, 29.2f)
    weatherData.setMeasurements(78f, 90f, 29.2f)
}