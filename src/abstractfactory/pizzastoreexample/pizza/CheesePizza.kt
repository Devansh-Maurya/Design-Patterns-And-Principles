package abstractfactory.pizzastoreexample.pizza

import abstractfactory.pizzastoreexample.factory.PizzaIngredientFactory

/**
 * Created by devansh on 06/09/20.
 */

class CheesePizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}