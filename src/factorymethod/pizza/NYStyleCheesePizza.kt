package factorymethod.pizza

/**
 * Created by devansh on 02/09/20.
 */

class NYStyleCheesePizza : Pizza() {

    override val name: String = "NY Style Sauce and Cheese Pizza"
    override val dough: String = "Thin Crust Dough"
    override val sauce: String = "Marinara Sauce"

    init {
        toppings.add("Grated Reggiano Cheese")
    }
}