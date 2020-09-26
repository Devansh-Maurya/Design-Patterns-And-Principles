package composite.dinermenu.iterator

import composite.dinermenu.iterable.MenuComponent
import java.util.*

/**
 * Created by devansh on 26/09/20.
 */

class CompositeIterator(iterator: Iterator<MenuComponent?>) : Iterator<MenuComponent?> {

    private val stack: Stack<Iterator<MenuComponent?>> = Stack()

    init {
        stack.push(iterator)
    }

    override fun hasNext(): Boolean =
            if (stack.empty()) {
                false
            } else {
                val iterator = stack.peek()
                if (iterator.hasNext().not()) {
                    stack.pop()
                    hasNext()
                } else {
                    true
                }
            }

    override fun next(): MenuComponent? =
            if (hasNext()) {
                val iterator = stack.peek()
                val component = iterator.next()
                stack.push(component?.iterator())
                component
            } else {
                null
            }
}