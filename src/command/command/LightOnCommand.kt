package command.command

import command.receiver.Light

/**
 * Created by devansh on 12/09/20.
 */

class LightOnCommand(private val light: Light) : Command {

    override fun execute() {
        light.on()
    }
}