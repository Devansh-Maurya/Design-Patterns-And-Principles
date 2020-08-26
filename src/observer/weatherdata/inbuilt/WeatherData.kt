package observer.weatherdata.inbuilt

import java.util.Observable

/**
 * Created by devansh on 26/08/20.
 */

class WeatherData : Observable() {

    var temperature: Float = 0f
        private set

    var humidity: Float = 0f
        private set

    var pressure: Float = 0f
        private set

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        onMeasurementsChanged()
    }

    private fun onMeasurementsChanged() {
        setChanged()
        notifyObservers()
    }
}