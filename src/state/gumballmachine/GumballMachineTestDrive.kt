package state.gumballmachine

import state.gumballmachine.context.GumballMachine

/**
 * Created by devansh on 27/09/20.
 */

fun main() {
    val gumballMachine = GumballMachine(5)

    gumballMachine.apply {

        repeat(3) {
            insertQuarter()
            turnCrank()
        }
    }
}