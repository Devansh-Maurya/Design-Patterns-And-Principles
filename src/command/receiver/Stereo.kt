package command.receiver

/**
 * Created by devansh on 12/09/20.
 */

class Stereo(private val name: String) {

    fun on() {
        println("$name stereo is on")
    }

    fun off() {
        println("$name stereo is off")
    }

    fun setCd() {
        println("$name stereo is set for CD input")
    }

    fun setDvd() {
        println("$name stereo is set for DVD input")
    }

    fun setRadio() {
        println("$name stereo is set for radio input")
    }

    fun setVolume(volume: Int) {
        println("$name stereo volume set to $volume")
    }
}