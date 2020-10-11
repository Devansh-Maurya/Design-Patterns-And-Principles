package facade.hometheaterexample.subsystems

/**
 * Created by devansh on 17/09/20.
 */
class TheaterLights {

    fun dim(level: Int) {
        println("Theater Ceiling Lights dimming to $level%")
    }

    fun on() {
        println("Theater Ceiling Lights on")
    }

}