package facade.hometheaterexample.subsystems

/**
 * Created by devansh on 17/09/20.
 */

class DvdPlayer {

    private var currentMovie: String = ""

    fun on() {
        println("DVD Player on")
    }

    fun play(movie: String) {
        currentMovie = movie
        println("DVD Player playing \"$movie\"")
    }

    fun stop() {
        println("DVD Player stopped \"$currentMovie\"")
    }

    fun eject() {
        println("DVD Player eject")
        currentMovie = ""
    }

    fun off() {
        println("DVD Player off")
    }
}