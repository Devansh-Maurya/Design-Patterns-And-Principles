package state.gumballmachine.state

import state.gumballmachine.context.GumballMachine
import kotlin.random.Random

/**
 * Created by devansh on 26/09/20.
 */

class HasQuarterState(private val gumballMachine: GumballMachine): State {

    private val randomWinner = Random(System.currentTimeMillis())

    override fun insertQuarter() {
        println("You can't insert another quarter")
    }

    override fun ejectQuarter() {
        println("Quarter returned")
        gumballMachine.state = gumballMachine.noQuarterState
    }

    override fun turnCrank() {
        println("You turned...")
        val winner = randomWinner.nextInt(10)
        gumballMachine.state = if (winner == 0 && gumballMachine.count > 1) {
            gumballMachine.winnerState
        } else {
            gumballMachine.soldState
        }
    }

    override fun dispense() {
        println("No gumball dispensed")
    }
}