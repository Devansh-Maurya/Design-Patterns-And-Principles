package singleton.scratch

/**
 * Created by devansh on 06/09/20.
 */

class Singleton private constructor() {

    companion object {
        @Volatile
        private var instance: Singleton? = null

        fun getInstance(): Singleton {
            if (instance == null) {
                synchronized(Singleton::class) {
                    if (instance == null) {
                        instance = Singleton()
                    }
                }
            }
            return instance!!
        }
    }

}