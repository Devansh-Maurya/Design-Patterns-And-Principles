package abstractfactory.pizzastoreexample.pizza

import abstractfactory.pizzastoreexample.ingredients.*

/**
 * Created by devansh on 06/09/20.
 */

abstract class Pizza {
    var name: String = ""
    var dough: Dough? = null
    var sauce: Sauce? = null
    val veggies: ArrayList<Veggies> = arrayListOf()
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null
    var clam: Clams? = null

    abstract fun prepare()

    open fun bake() {
        println("Bake for 25 minutes at 350")
    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    open fun box() {
        println("Place pizza in official PizzaStore box")
    }
}