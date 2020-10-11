package composite.dinermenu.client

import composite.dinermenu.iterable.MenuComponent

/**
 * Created by devansh on 26/09/20.
 */

class Waitress(private val allMenus: MenuComponent) {

    fun printMenu() {
        allMenus.print()
    }

    fun printVegetarianMenu() {
        val iterator = allMenus.iterator()

        println("\nVEGETARIAN MENU\n----")

        while (iterator.hasNext()) {
            iterator.next()?.let {
                try {
                    if (it.isVegetarian) {
                        it.print()
                    }
                } catch (e: UnsupportedOperationException) {}
            }
        }
    }

}