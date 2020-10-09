package iterator.dinermenu.inbuilt

import iterator.dinermenu.inbuilt.client.Waitress
import iterator.dinermenu.inbuilt.iterable.DinerMenu

/**
 * Created by devansh on 22/09/20.
 */

fun main() {
    val dinerMenu = DinerMenu()

    val waitress = Waitress(dinerMenu)
    waitress.printMenu()
}