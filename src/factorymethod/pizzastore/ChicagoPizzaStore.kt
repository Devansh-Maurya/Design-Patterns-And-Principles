package factorymethod.pizzastore

import factorymethod.pizza.ChicagoStyleCheesePizza
import factorymethod.pizza.Pizza

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