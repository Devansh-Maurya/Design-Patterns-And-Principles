package command.command

/**
 * Created by devansh on 12/09/20.
 */

class MacroCommand(private val commands: List<Command>) : Command {

    override fun execute() {
        commands.forEach {
            it.execute()
        }
    }

    override fun undo() {
        commands.forEach {
            it.undo()
        }
    }
}