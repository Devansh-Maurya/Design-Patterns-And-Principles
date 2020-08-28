package decorator.coffeeshop

/**
 * Created by devansh on 28/08/20.
 */

abstract class Beverage {

    open val description: String = "Unknown beverage"

    abstract fun cost(): Double
}