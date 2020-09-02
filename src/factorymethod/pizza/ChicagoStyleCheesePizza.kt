package factorymethod.pizza

/**
 * Created by devansh on 02/09/20.
 */

class ChicagoStyleCheesePizza : Pizza() {

    override val name: String = "Chicago Style Deep Dish Cheese Pizza"
    override val dough: String = "Extra Thick Crust Dough"
    override val sauce: String = "Plum Tomato Sauce"

    init {
        toppings.add("Shredded Mozzarella Cheese")
    }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}