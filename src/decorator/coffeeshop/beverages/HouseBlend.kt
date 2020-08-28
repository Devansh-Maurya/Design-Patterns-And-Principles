package decorator.coffeeshop.beverages

import decorator.coffeeshop.Beverage

/**
 * Created by devansh on 28/08/20.
 */

class HouseBlend : Beverage() {

    override val description: String = javaClass.simpleName

    override fun cost(): Double = .89
}