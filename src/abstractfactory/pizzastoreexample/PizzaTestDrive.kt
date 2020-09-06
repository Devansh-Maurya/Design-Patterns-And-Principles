package abstractfactory.pizzastoreexample

import abstractfactory.pizzastoreexample.pizzastore.NYPizzaStore


/**
 * Created by devansh on 06/09/20.
 */

fun main() {
    val nyStore = NYPizzaStore()

    var pizza = nyStore.orderPizza("cheese")
    println("Ethan ordered a ${pizza?.name}\n")

    pizza = nyStore.orderPizza("clam")
    println("Joel ordered a ${pizza?.name}\n")
}