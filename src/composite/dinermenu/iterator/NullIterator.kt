package composite.dinermenu.iterator

/**
 * Created by devansh on 26/09/20.
 */

class NullIterator<T> : Iterator<T?> {

    override fun hasNext(): Boolean = false

    override fun next(): T? = null

}