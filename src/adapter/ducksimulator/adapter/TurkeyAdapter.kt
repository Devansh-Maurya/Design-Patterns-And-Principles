package adapter.ducksimulator.adapter

import adapter.ducksimulator.duck.Duck
import adapter.ducksimulator.turkey.Turkey

/**
 * Created by devansh on 12/09/20.
 */

class TurkeyAdapter(private val turkey: Turkey) : Duck {

    override fun quack() {
        turkey.gobble()
    }

    // Turkeys fly in short spurts - they can't do long-distance flying like ducks.
    // To map between a Duck's fly() method and a Turkey's,
    // we need to call Turkey's fly() method five times to make up for it.
    override fun fly() {
        repeat(5) {
            turkey.fly()
        }
    }
}