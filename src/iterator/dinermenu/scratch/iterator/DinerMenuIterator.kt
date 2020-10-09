package iterator.dinermenu.scratch.iterator

import iterator.dinermenu.scratch.data.MenuItem

/**
 * Created by devansh on 21/09/20.
 */

class DinerMenuIterator(private val items: Array<MenuItem?>) : Iterator<MenuItem> {

    private var position = 0

    override fun hasNext(): Boolean {
        return position < items.size && items[position] != null
    }

    override fun next(): MenuItem {
        return items[position++]!!
    }
}