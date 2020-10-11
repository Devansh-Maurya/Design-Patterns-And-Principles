package templatemethod.caffeinebeverage.beverages

/**
 * Created by devansh on 19/09/20.
 */

abstract class CaffeineBeverage {

    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        if (customerWantsCondiments()) {
            addCondiments()
        }
    }

    abstract fun brew()

    abstract fun addCondiments()

    fun boilWater() {
        println("Boiling water")
    }

    fun pourInCup() {
        println("Pouring into cup")
    }

    // hook
    open fun customerWantsCondiments(): Boolean = true
}