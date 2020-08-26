package observer.weatherdata.scratch

/**
 * Created by devansh on 26/08/20.
 */

interface Subject<T> {

    fun registerObserver(observer: Observer<T>)

    fun removeObserver(observer: Observer<T>)

    fun notifyObservers()

}