package facade.hometheaterexample.subsystems

/**
 * Created by devansh on 17/09/20.
 */
class Amplifier {

    fun on() {
        println("Amplifier on")
    }

    fun setDvd(dvdPlayer: DvdPlayer) {
        println("Amplifier setting DVD player")
    }

    fun setSurroundSound() {
        println("Amplifier surround sound on (5 speakers, 1 subwoofer)")
    }

    fun setVolume(level: Int) {
        println("Amplifier setting volume to $level")
    }

    fun off() {
        println("Amplifier off")
    }
}