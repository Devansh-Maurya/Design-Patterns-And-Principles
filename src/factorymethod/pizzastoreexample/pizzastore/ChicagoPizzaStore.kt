package factorymethod.pizzastoreexample.pizzastore

import factorymethod.pizzastoreexample.pizza.ChicagoStyleCheesePizza
import factorymethod.pizzastoreexample.pizza.Pizza

/**
 * Created by devansh on 02/09/20.
 */
class ChicagoPizzaStore : PizzaStore() {

    override fun createPizza(type: String): Pizza? =
        when(type) {
            "cheese" -> ChicagoStyleCheesePizza()
            else -> null
        }
}