package factorymethod.pizzastoreexample.pizzastore

import factorymethod.pizzastoreexample.pizza.Pizza

/**
 * Created by devansh on 02/09/20.
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