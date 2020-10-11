package state.gumballmachine.state

import state.gumballmachine.context.GumballMachine

/**
 * Created by devansh on 27/09/20.
 */

class WinnerState(private val gumballMachine: GumballMachine) : State {

    override fun insertQuarter() {
        println("Please wait, we're already giving you a gumball")
    }

    override fun ejectQuarter() {
        println("Sorry, you already turned the crank")
    }

    override fun turnCrank() {
        println("Turning twice doesn't get you another gumball!")
    }

    override fun dispense() {
        gumballMachine.releaseBall()

        if (gumballMachine.count == 0) {
            gumballMachine.state = gumballMachine.soldOutState
        } else {
            gumballMachine.releaseBall()
            println("YOU'RE A WINNER! You got two gumballs for your quarter")
            gumballMachine.state = if (gumballMachine.count > 0) {
                gumballMachine.noQuarterState
            } else {
                println("Oops, out of gumballs!")
                gumballMachine.soldOutState
            }
        }
    }
}