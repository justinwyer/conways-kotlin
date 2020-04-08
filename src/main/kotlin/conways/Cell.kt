package conways

import conways.Config.Companion.ALIVE
import conways.Config.Companion.DEAD

data class Cell(val row: Int, val col: Int, var representation: String) {


    fun kill() {
        representation = DEAD
    }

    fun revive() {
        representation = ALIVE
    }

    val isAlive: Boolean
        get() {
            return representation == ALIVE
        }


}