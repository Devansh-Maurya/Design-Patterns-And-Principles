package observer.weatherdata.scratch

/**
 * Created by devansh on 26/08/20.
 */

class CurrentConditionsDisplay(weatherData: Subject<WeatherData>) : Observer<WeatherData>, DisplayElement<WeatherData> {

    init {
        weatherData.registerObserver(this)
    }

    override fun update(data: WeatherData) {
        display(data)
    }

    override fun display(data: WeatherData) {
        println("Current conditions: ${data.temperature} F degrees and ${data.humidity}% humidity")
    }
}