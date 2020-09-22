package iterator.dinermenu.inbuilt.iterator

import iterator.dinermenu.scratch.data.MenuItem

/**
 * Created by devansh on 21/09/20.
 */

class DinerMenuIterator(private val list: Array<MenuItem?>) : MutableIterator<MenuItem> {

    private var position = 0

    override fun hasNext(): Boolean {
        return position < list.size && list[position] != null
    }

    override fun next(): MenuItem {
        return list[position++] ?: throw IllegalStateException("Trying to access a position with no MenuItem")
    }

    override fun remove() {
        if (position <= 0) {
            throw IllegalStateException("You can't remove an item until you've done at least one next()")
        }
        if (list[position-1] != null) {
            for (i in (position - 1) until (list.size - 1)) {
                list[i] = list[i + 1]
            }
            list[list.size - 1] = null
        }
    }
}