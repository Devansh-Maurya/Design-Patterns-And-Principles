package iterator.dinermenu.scratch.iterator

/**
 * Created by devansh on 21/09/20.
 */

interface Iterator<out T> {

    fun hasNext(): Boolean

    fun next(): T
}