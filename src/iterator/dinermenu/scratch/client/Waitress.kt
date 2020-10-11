package iterator.dinermenu.scratch.client

import iterator.dinermenu.scratch.data.MenuItem
import iterator.dinermenu.scratch.iterable.DinerMenu
import iterator.dinermenu.scratch.iterator.Iterator

/**
 * Created by devansh on 21/09/20.
 */

class Waitress(private val dinerMenu: DinerMenu) {

    fun printMenu() {
        val dinerIterator = dinerMenu.createIterator()

        println("MENU\n----\nBREAKFAST")
        printMenu(dinerIterator)
    }

    private fun printMenu(iterator: Iterator<MenuItem>) {
        while (iterator.hasNext()) {
            val menuItem = iterator.next()
            println("${menuItem.name}, ")
            println("${menuItem.price} -- ")
            println(menuItem.description)
        }
    }
}