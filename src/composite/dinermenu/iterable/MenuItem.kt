package composite.dinermenu.iterable

import composite.dinermenu.iterator.NullIterator

/**
 * Created by devansh on 26/09/20.
 */

class MenuItem(
        override val name: String,
        override val description: String,
        override val isVegetarian: Boolean,
        override val price: Double
) : MenuComponent() {

    override fun print() {
        print(" $name")
        if (isVegetarian) { print("(v)") }
        println(", $price")
        println("\t-- $description")
    }

    override fun iterator(): Iterator<MenuComponent?> = NullIterator()
}