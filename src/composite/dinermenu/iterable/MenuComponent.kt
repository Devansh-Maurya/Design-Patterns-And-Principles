package composite.dinermenu.iterable

/**
 * Created by devansh on 26/09/20.
 */

abstract class MenuComponent : Iterable<MenuComponent?> {

    open val name: String
        get() { throw UnsupportedOperationException() }

    open val description: String
        get() { throw UnsupportedOperationException() }

    open val price: Double
        get() { throw UnsupportedOperationException() }

    open val isVegetarian: Boolean
        get() { throw UnsupportedOperationException() }

    open fun add(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun getChild(i: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    open fun print() {
        throw UnsupportedOperationException()
    }

}