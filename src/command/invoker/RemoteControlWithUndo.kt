package command.invoker

import command.command.Command
import command.command.NoCommand

/**
 * Created by devansh on 12/09/20.
 */

class RemoteControlWithUndo {

    private val onCommands: Array<Command>
    private val offCommands: Array<Command>
    private var undoCommand: Command

    init {
        val noCommand = NoCommand()
        onCommands = Array(7) { noCommand }
        offCommands = Array(7) { noCommand }
        undoCommand = noCommand
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonPushed(slot: Int) {
        onCommands[slot].run {
            execute()
            undoCommand = this
        }
    }

    fun offButtonPushed(slot: Int) {
        offCommands[slot].run {
            execute()
            undoCommand = this
        }
    }

    fun undoButtonPushed() {
        undoCommand.undo()
    }

    override fun toString() =
            StringBuilder().apply {
                append("\n------Remote Control------\n")
                onCommands.zip(offCommands).forEachIndexed { index, pair ->
                    append("[slot $index] ${pair.first.javaClass.simpleName}\t${pair.second.javaClass.simpleName}\n")
                }
                append("[undo] ${undoCommand.javaClass.simpleName}\n")
            }.toString()
}