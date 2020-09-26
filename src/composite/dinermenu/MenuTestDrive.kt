package composite.dinermenu

import composite.dinermenu.client.Waitress
import composite.dinermenu.iterable.Menu
import composite.dinermenu.iterable.MenuItem

/**
 * Created by devansh on 26/09/20.
 */

fun main() {
    val pancakeMenu = Menu("PANCAKE HOUSE MENU", "Breakfast")
    val dinerMenu = Menu("DINER MENU", "Lunch")
    val cafeMenu = Menu("CAFE MENU", "Dinner")
    val dessertMenu = Menu("DESSERT MENU", "Dessert of course!")

    // Top-level menu
    val allMenus = Menu("ALL MENUS", "All menus combined").apply {
        add(pancakeMenu)
        add(dinerMenu)
        add(cafeMenu)
    }

    dinerMenu.apply {
        add(MenuItem(
                name = "Pasta",
                description = "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                isVegetarian = true,
                price = 3.89))
        add(dessertMenu)
        add(MenuItem(
                name = "Apple Pie",
                description = "Apple pie wit a flakey crust, topped with vanilla icecream",
                isVegetarian = true,
                price = 1.59
        ))
    }

    val waitress = Waitress(allMenus)
    waitress.printMenu()
}