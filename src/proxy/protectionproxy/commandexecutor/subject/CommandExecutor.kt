package proxy.protectionproxy.commandexecutor.subject

/**
 * Created by devansh on 27/09/20.
 */

interface CommandExecutor {

    fun runCommand(cmd: String)
}