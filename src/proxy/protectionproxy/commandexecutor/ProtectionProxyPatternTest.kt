package proxy.protectionproxy.commandexecutor

import proxy.protectionproxy.commandexecutor.proxy.CommandExecutorProxy

/**
 * Created by devansh on 27/09/20.
 */

fun main() {

    val executor = CommandExecutorProxy("Maurya", "Devansh")
    try {
        executor.runCommand("ls -ltr")
        executor.runCommand("  rm -rf abc.pdf")
    } catch (e: Exception) {
        println("Exception message: ${e.message}")
    }
}