package state.gumballmachine.state

/**
 * Created by devansh on 26/09/20.
 */

interface State {

    fun insertQuarter()

    fun ejectQuarter()

    fun turnCrank()

    fun dispense()

}