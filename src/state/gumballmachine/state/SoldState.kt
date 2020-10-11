package state.gumballmachine.state

import state.gumballmachine.context.GumballMachine

/**
 * Created by devansh on 26/09/20.
 */

class SoldState(private val gumballMachine: GumballMachine): State {

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
        if (gumballMachine.count > 0) {
            gumballMachine.state = gumballMachine.noQuarterState
        } else {
            println("Oops, out of gumballs!")
            gumballMachine.state = gumballMachine.soldOutState
        }
    }
}