package proxy.protectionproxy.commandexecutor.realsubject

import proxy.protectionproxy.commandexecutor.subject.CommandExecutor

/**
 * Created by devansh on 27/09/20.
 */

class CommandExecutorImpl : CommandExecutor {

    override fun runCommand(cmd: String) {
        Runtime.getRuntime().exec(cmd)
        println("'$cmd' command executed.")
    }
}