package abstractfactory.pizzastoreexample.pizzastore

import abstractfactory.pizzastoreexample.factory.NYPizzaIngredientFactory
import abstractfactory.pizzastoreexample.factory.PizzaIngredientFactory
import abstractfactory.pizzastoreexample.pizza.CheesePizza
import abstractfactory.pizzastoreexample.pizza.ClamPizza
import abstractfactory.pizzastoreexample.pizza.Pizza

/**
 * Created by devansh on 06/09/20.
 */

class NYPizzaStore : PizzaStore() {

    private val ingredientFactory: PizzaIngredientFactory

    init {
        ingredientFactory = NYPizzaIngredientFactory()
    }

    override fun createPizza(type: String): Pizza? =
            when(type) {
                "cheese" -> {
                    CheesePizza(ingredientFactory).apply {
                        name = "New York Style Cheese Pizza"
                    }
                }
                "clam" -> {
                    ClamPizza(ingredientFactory).apply {
                        name = "New York Style Clam Pizza"
                    }
                }
                else -> null
        }
}