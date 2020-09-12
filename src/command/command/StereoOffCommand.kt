package command.command

import command.receiver.Stereo

/**
 * Created by devansh on 12/09/20.
 */

class StereoOffCommand(private val stereo: Stereo) : Command {

    override fun execute() {
        stereo.off()
    }
}