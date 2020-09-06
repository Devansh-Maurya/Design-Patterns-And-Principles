package abstractfactory.pizzastoreexample.pizzastore

import abstractfactory.pizzastoreexample.pizza.Pizza

/**
 * Created by devansh on 06/09/20.
 */

abstract class PizzaStore {

    fun orderPizza(type: String): Pizza? =
            createPizza(type)?.apply {
                prepare()
                bake()
                cut()
                box()
            }

    protected abstract fun createPizza(type: String): Pizza?
}