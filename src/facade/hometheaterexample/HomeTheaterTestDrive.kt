package facade.hometheaterexample

import facade.hometheaterexample.facade.HomeTheaterFacade
import facade.hometheaterexample.subsystems.*

/**
 * Created by devansh on 17/09/20.
 */

fun main() {
    val homeTheater = HomeTheaterFacade(Amplifier(), DvdPlayer(), Projector(),
            Screen(), TheaterLights(), PopcornPopper())

    homeTheater.apply {
        watchMovie("Tamashaa")
        endMovie()
    }
}