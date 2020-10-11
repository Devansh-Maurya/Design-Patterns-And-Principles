package iterator.dinermenu.scratch

import iterator.dinermenu.scratch.client.Waitress
import iterator.dinermenu.scratch.iterable.DinerMenu

/**
 * Created by devansh on 21/09/20.
 */

fun main() {
    val dinerMenu = DinerMenu()

    val waitress = Waitress(dinerMenu)
    waitress.printMenu()
}