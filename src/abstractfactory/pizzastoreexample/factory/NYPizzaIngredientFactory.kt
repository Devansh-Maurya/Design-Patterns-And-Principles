package abstractfactory.pizzastoreexample.factory

import abstractfactory.pizzastoreexample.ingredients.*

/**
 * Created by devansh on 05/09/20.
 */

class NYPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough(): Dough = ThinCrustDough

    override fun createSauce(): Sauce = MarinaraSauce

    override fun createCheese(): Cheese = ReggianoCheese

    override fun createVeggies(): Array<Veggies> =
            arrayOf(Garlic, Onion, Mushroom, RedPepper)

    override fun createPepperoni(): Pepperoni = SlicedPepperoni

    override fun createClam(): Clams = FreshClams
}