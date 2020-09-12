package command.receiver

/**
 * Created by devansh on 12/09/20.
 */

class Light(private val name: String) {

    fun on() {
        println("$name light is on")
    }

    fun off() {
        println("$name light is off")
    }
}