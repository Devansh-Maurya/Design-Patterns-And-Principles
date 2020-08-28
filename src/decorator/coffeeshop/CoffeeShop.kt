package decorator.coffeeshop

import decorator.coffeeshop.beverages.Espresso
import decorator.coffeeshop.beverages.HouseBlend
import decorator.coffeeshop.condiments.Mocha
import decorator.coffeeshop.condiments.Soy
import decorator.coffeeshop.condiments.Whip

/**
 * Created by devansh on 28/08/20.
 */

fun main() {

    val beverage = Espresso()

    println("${beverage.description} $${beverage.cost()}")

    val beverage2 =
        Whip(
            Mocha(
                Soy(
                    HouseBlend()
                )
            )
        )

    println("${beverage2.description} $${beverage2.cost()}")

}