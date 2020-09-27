package proxy.protectionproxy.commandexecutor.proxy

import proxy.protectionproxy.commandexecutor.realsubject.CommandExecutorImpl
import proxy.protectionproxy.commandexecutor.subject.CommandExecutor
import javax.naming.NoPermissionException

/**
 * Created by devansh on 27/09/20.
 */

class CommandExecutorProxy(user: String, password: String) : CommandExecutor {

    private val isAdmin: Boolean = user == "Devansh" && password == "Maurya"
    private val executor: CommandExecutor by lazy { CommandExecutorImpl() }

    override fun runCommand(cmd: String) {
        if (isAdmin) {
            executor.runCommand(cmd)
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw NoPermissionException("rm command is not allowed for non-admin users.")
            } else {
                executor.runCommand(cmd)
            }
        }
    }
}