package templatemethod.caffeinebeverage.beverages

import java.io.IOException

/**
 * Created by devansh on 19/09/20.
 */

class Tea : CaffeineBeverage() {

    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding Lemon")
    }

    override fun customerWantsCondiments(): Boolean =
            getUserInput().startsWith("y", ignoreCase = true)

    private fun getUserInput(): String {
        var answer: String? = null

        println("Would you like lemon with your tea (y/n)? ")

        try {
            answer = readLine()
        } catch (ioe: IOException) {
            System.err.println("IO error trying to read your answer")
        }

        return answer ?: "no"
    }
}