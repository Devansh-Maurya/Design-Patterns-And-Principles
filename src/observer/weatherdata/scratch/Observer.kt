package observer.weatherdata.scratch

/**
 * Created by devansh on 26/08/20.
 */

interface Observer<T> {
    fun update(data: T)
}