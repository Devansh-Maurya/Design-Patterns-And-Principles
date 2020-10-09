package templatemethod.caffeinebeverage

import templatemethod.caffeinebeverage.beverages.Coffee
import templatemethod.caffeinebeverage.beverages.Tea

/**
 * Created by devansh on 19/09/20.
 */

fun main() {

    val tea = Tea()

    val coffee = Coffee()

    println("\nMaking tea...")
    tea.prepareRecipe()

    println("\nMaking coffee...")
    coffee.prepareRecipe()
}