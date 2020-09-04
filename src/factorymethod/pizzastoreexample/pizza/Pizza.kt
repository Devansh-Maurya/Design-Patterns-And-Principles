package factorymethod.pizzastoreexample.pizza

/**
 * Created by devansh on 02/09/20.
 */

abstract class Pizza {

    abstract val name: String
    abstract val dough: String
    abstract val sauce: String
    protected val toppings: ArrayList<String> = arrayListOf()

    open fun prepare() {
        println("Preparing $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings: ")
        toppings.forEach {
            println(" $it")
        }
    }

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