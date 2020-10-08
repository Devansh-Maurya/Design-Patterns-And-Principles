package facade.hometheaterexample.facade

import facade.hometheaterexample.subsystems.*

/**
 * Created by devansh on 17/09/20.
 */

class HomeTheaterFacade(private val amp: Amplifier,
                        private val dvd: DvdPlayer,
                        private val projector: Projector,
                        private val screen: Screen,
                        private val lights: TheaterLights,
                        private val popper: PopcornPopper) {

    fun watchMovie(movie: String) {
        println("Get ready to watch a movie...")
        popper.on()
        popper.pop()

        lights.dim(10)

        screen.down()

        projector.on()
        projector.wideScreenMode()

        amp.on()
        amp.setDvd(dvd)
        amp.setSurroundSound()
        amp.setVolume(5)

        dvd.on()
        dvd.play(movie)
    }

    fun endMovie() {
        println("Shutting movie theater down...")
        popper.off()

        lights.on()

        screen.up()

        projector.off()

        amp.off()

        dvd.stop()
        dvd.eject()
        dvd.off()
    }
}