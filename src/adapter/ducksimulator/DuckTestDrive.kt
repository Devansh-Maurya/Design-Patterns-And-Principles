package adapter.ducksimulator

import adapter.ducksimulator.adapter.TurkeyAdapter
import adapter.ducksimulator.duck.Duck
import adapter.ducksimulator.duck.MallardDuck
import adapter.ducksimulator.turkey.WildTurkey

/**
 * Created by devansh on 12/09/20.
 */

fun main() {
    val duck = MallardDuck()

    val turkey = WildTurkey()
    val turkeyAdapter = TurkeyAdapter(turkey)

    println("The Turkey says...")
    turkey.run {
        gobble()
        fly()
    }

    println("\nThe Duck says...")
    testDuck(duck)

    println("\nThe TurkeyAdapter says")
    testDuck(turkeyAdapter)
}

private fun testDuck(duck: Duck) {
    duck.run {
        quack()
        fly()
    }
}