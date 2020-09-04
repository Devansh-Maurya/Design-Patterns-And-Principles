package factorymethod.pizzastoreexample

import factorymethod.pizzastoreexample.pizzastore.ChicagoPizzaStore
import factorymethod.pizzastoreexample.pizzastore.NYPizzaStore

/**
 * Created by devansh on 02/09/20.
 */

fun main() {
    val nyStore = NYPizzaStore()
    val chicagoStore = ChicagoPizzaStore()

    var pizza = nyStore.orderPizza("cheese")
    println("Ethan ordered a ${pizza?.name}\n")

    pizza = chicagoStore.orderPizza("cheese")
    println("Joel ordered a ${pizza?.name}\n")
}