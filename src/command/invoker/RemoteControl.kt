package command.invoker

import command.command.Command
import command.command.NoCommand

/**
 * Created by devansh on 12/09/20.
 */

class RemoteControl {

    private val onCommands = Array<Command>(7) { NoCommand() }
    private val offCommands = Array<Command>(7) { NoCommand() }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonPushed(slot: Int) {
        onCommands[slot].execute()
    }

    fun offButtonPushed(slot: Int) {
        offCommands[slot].execute()
    }

    override fun toString() =
            StringBuilder().apply {
                append("\n------Remote Control------\n")
                onCommands.zip(offCommands).forEachIndexed { index, pair ->
                    append("[slot $index] ${pair.first.javaClass.simpleName}\t${pair.second.javaClass.simpleName}\n")
                }
            }.toString()
}