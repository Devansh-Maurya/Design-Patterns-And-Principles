package abstractfactory.pizzastoreexample.pizza

import abstractfactory.pizzastoreexample.factory.PizzaIngredientFactory

/**
 * Created by devansh on 06/09/20.
 */

class ClamPizza(private val pizzaIngredientFactory: PizzaIngredientFactory) : Pizza() {

    override fun prepare() {
        println("Preparing $name")
        dough = pizzaIngredientFactory.createDough()
        sauce = pizzaIngredientFactory.createSauce()
        cheese = pizzaIngredientFactory.createCheese()
        clam = pizzaIngredientFactory.createClam()
    }
}