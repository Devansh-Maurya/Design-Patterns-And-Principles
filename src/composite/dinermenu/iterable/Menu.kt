package composite.dinermenu.iterable

import composite.dinermenu.iterator.CompositeIterator

/**
 * Created by devansh on 26/09/20.
 */

class Menu(
        override val name: String,
        override val description: String) : MenuComponent() {

    private val menuComponents: ArrayList<MenuComponent> = arrayListOf()

    private val iterator: CompositeIterator by lazy { CompositeIterator(menuComponents.iterator()) }

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(i: Int): MenuComponent = menuComponents[i]

    override fun print() {
        print("\n$name")
        println(", $description")
        println("----------------------")

        val iterator = menuComponents.iterator()

        while (iterator.hasNext()) {
            val menuComponent = iterator.next()
            menuComponent.print()
        }
    }

    override fun iterator(): Iterator<MenuComponent?> = iterator
}