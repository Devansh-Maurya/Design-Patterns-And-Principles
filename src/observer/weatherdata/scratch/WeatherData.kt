package observer.weatherdata.scratch

/**
 * Created by devansh on 26/08/20.
 */

class WeatherData : Subject<WeatherData> {

    var temperature: Float = 0f
        private set

    var humidity: Float = 0f
        private set

    var pressure: Float = 0f
        private set

    private val observers: ArrayList<Observer<WeatherData>> = arrayListOf()

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        onMeasurementsChanged()
    }

    fun onMeasurementsChanged() {
        notifyObservers()
    }

    override fun registerObserver(observer: Observer<WeatherData>) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer<WeatherData>) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(this)
        }
    }
}