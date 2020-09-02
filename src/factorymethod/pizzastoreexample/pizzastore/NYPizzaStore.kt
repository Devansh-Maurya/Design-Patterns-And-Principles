package factorymethod.pizzastoreexample.pizzastore

import factorymethod.pizzastoreexample.pizza.NYStyleCheesePizza
import factorymethod.pizzastoreexample.pizza.Pizza

/**
 * Created by devansh on 02/09/20.
 */

class NYPizzaStore : PizzaStore() {

    override fun createPizza(type: String): Pizza? =
        when(type) {
            "cheese" -> NYStyleCheesePizza()
            else -> null
        }
}