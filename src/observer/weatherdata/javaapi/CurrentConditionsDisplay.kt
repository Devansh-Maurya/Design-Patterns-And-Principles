package observer.weatherdata.javaapi

import observer.weatherdata.scratch.DisplayElement
import java.util.*

/**
 * Created by devansh on 26/08/20.
 */

class CurrentConditionsDisplay(observable: Observable) : Observer, DisplayElement<WeatherData> {

    init {
        observable.addObserver(this)
    }

    override fun update(observable: Observable?, arg: Any?) {
        if (observable is WeatherData) {
            display(observable)
        }
    }

    override fun display(data: WeatherData) {
        println("Current conditions: ${data.temperature} F degrees and ${data.humidity}% humidity")
    }
}