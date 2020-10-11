package adapter.ducksimulator.turkey

/**
 * Created by devansh on 12/09/20.
 */

class WildTurkey : Turkey {

    override fun gobble() {
        println("Gobble gobble")
    }

    override fun fly() {
        println("I'm flying a short distance")
    }
}