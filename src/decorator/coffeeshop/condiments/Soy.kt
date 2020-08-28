package decorator.coffeeshop.condiments

import decorator.coffeeshop.Beverage
import decorator.coffeeshop.CondimentDecorator

/**
 * Created by devansh on 28/08/20.
 */

class Soy(private val beverage: Beverage) : CondimentDecorator() {

    override val description: String
        get() = "${beverage.description}, Soy"

    override fun cost(): Double = beverage.cost() + .15
}