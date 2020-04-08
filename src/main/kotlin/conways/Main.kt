package conways

import conways.Config.Companion.ALIVE
import conways.Config.Companion.DEAD
import conways.Config.Companion.cellStates
import conways.Config.Companion.loopCount
import conways.Config.Companion.x
import conways.Config.Companion.y

fun main() {

    //Empty dynamic 2d Array
    val randomBoard = Array(x) { Array(y) { "" } }

    // Init board with random values
    for (i in randomBoard.indices) {
        for (j in randomBoard[i].indices) {
            randomBoard[i][j] = cellStates.random()
        }
    }


    val board = Board(randomBoard)

    // Loop generation runs according to counter
    for (i in 1..loopCount) {
        println("Generation Number : $i ")
        val result = board.playGame()
        for (j in result.indices) { println(result[j].contentToString()) }
        println("\n ")
    }

}
