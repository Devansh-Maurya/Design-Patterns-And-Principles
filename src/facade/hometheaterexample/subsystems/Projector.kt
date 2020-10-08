package facade.hometheaterexample.subsystems

/**
 * Created by devansh on 17/09/20.
 */
class Projector {

    fun on() {
        println("Projector on")
    }

    fun wideScreenMode() {
        println("Projector in widescreen mode (16x9 aspect ratio)")
    }

    fun off() {
        println("Projector off")
    }
}