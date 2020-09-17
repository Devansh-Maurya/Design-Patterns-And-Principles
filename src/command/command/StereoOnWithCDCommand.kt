package command.command

import command.receiver.Stereo

/**
 * Created by devansh on 12/09/20.
 */

class StereoOnWithCDCommand(private val stereo: Stereo) : Command {

    override fun execute() {
        stereo.run {
            on()
            setCd()
            setVolume(11)
        }
    }

    override fun undo() {
        stereo.off()
    }
}