package iterator.dinermenu.inbuilt.iterable

import iterator.dinermenu.inbuilt.iterator.DinerMenuIterator
import iterator.dinermenu.scratch.data.MenuItem

/**
 * Created by devansh on 22/09/20.
 */

class DinerMenu : Iterable<MenuItem>{

    companion object {
        const val MAX_ITEMS = 6
    }

    private var numberOfItems = 0
    private val menuItems = arrayOfNulls<MenuItem>(MAX_ITEMS)

    init {
        addItem("Vegetarian BLT",
                " (Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99)
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99)
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29)
        addItem("Hotdog",
                "A hot dog with saurkraut, relish, onions, topped with cheese", false, 3.05)
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu")
        } else {
            menuItems[numberOfItems++] = menuItem
        }
    }

    override fun iterator(): Iterator<MenuItem> = DinerMenuIterator(menuItems)
}