package observer.weatherdata.scratch

/**
 * Created by devansh on 26/08/20.
 */

interface DisplayElement<T> {
    fun display(data: T)
}