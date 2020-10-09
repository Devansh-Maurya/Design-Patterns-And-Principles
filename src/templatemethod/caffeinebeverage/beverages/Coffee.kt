package templatemethod.caffeinebeverage.beverages

import java.io.IOException

/**
 * Created by devansh on 19/09/20.
 */

class Coffee : CaffeineBeverage() {

    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        println("Adding Sugar and Milk")
    }

    override fun customerWantsCondiments(): Boolean =
            getUserInput().startsWith("y", ignoreCase = true)

    private fun getUserInput(): String {
        var answer: String? = null

        println("Would you like milk and sugar with your coffee (y/n)? ")

        try {
            answer = readLine()
        } catch (ioe: IOException) {
            System.err.println("IO error trying to read your answer")
        }

        return answer ?: "no"
    }
}