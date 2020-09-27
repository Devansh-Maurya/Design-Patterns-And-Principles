package state.gumballmachine.context

import state.gumballmachine.state.*
import kotlin.math.max

/**
 * Created by devansh on 26/09/20.
 */

class GumballMachine(numberOfGumballs: Int) {

    val soldOutState: State
    val noQuarterState: State
    val hasQuarterState: State
    val soldState: State
    val winnerState: State

    var state: State

    var count: Int = numberOfGumballs
        private set

    init {
        soldOutState = SoldOutState()
        noQuarterState = NoQuarterState(this)
        hasQuarterState = HasQuarterState(this)
        soldState = SoldState(this)
        winnerState = WinnerState(this)

        count = numberOfGumballs

        state = if (numberOfGumballs > 0) {
            noQuarterState
        } else {
            soldOutState
        }
    }

    fun insertQuarter() {
        state.insertQuarter()
    }

    fun ejectQuarter() {
        state.ejectQuarter()
    }

    fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

    fun releaseBall() {
        println("A gumball comes rolling out the slot...")
        count = max(count - 1, 0)
    }

}