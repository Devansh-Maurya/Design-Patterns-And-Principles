package abstractfactory.pizzastoreexample.factory

import abstractfactory.pizzastoreexample.ingredients.*

/**
 * Created by devansh on 05/09/20.
 */

interface PizzaIngredientFactory {

    fun createDough(): Dough

    fun createSauce(): Sauce

    fun createCheese(): Cheese

    fun createVeggies(): Array<Veggies>

    fun createPepperoni(): Pepperoni

    fun createClam(): Clams
}