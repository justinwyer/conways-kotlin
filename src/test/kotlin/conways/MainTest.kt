package conways

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import java.util.*

class MainTests {

    @Test
    fun `assert Any live cell with fewer than two live neighbours dies`() {
        val initBoard = arrayOf(
                arrayOf("■", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□")
        )
        val secondGenBoard = arrayOf(
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□")
        )
        val board = Board(initBoard)
        val result = board.playGame()
        println(" \nFirst Rule")
        for (i in result.indices) { println(result[i].contentToString()) }
        assertThat(result.contentDeepEquals(secondGenBoard)).isEqualTo(true)
    }


    @Test
    fun `assert Any live cell with Two or Three live neighbours lives`() {
        val initBoard = arrayOf(
                arrayOf("■", "■", "□", "□", "□"),
                arrayOf("■", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□")
        )
        val secondGenBoard = arrayOf(
                arrayOf("■", "■", "□", "□", "□"),
                arrayOf("■", "■", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□")
        )
        val board = Board(initBoard)
        val result = board.playGame()
        println(" \nSecond Rule")
        for (i in result.indices) { println(result[i].contentToString()) }
        assertThat(result.contentDeepEquals(secondGenBoard)).isEqualTo(true)
    }

    @Test
    fun `assert Any live cell with more than three live neighbours dies`() {
        val initBoard = arrayOf(
                arrayOf("■", "■", "□", "□", "□"),
                arrayOf("■", "■", "□", "□", "□"),
                arrayOf("■", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□")
        )
        val secondGenBoard = arrayOf(
                arrayOf("■", "■", "■", "□", "□"),
                arrayOf("□", "□", "■", "□", "□"),
                arrayOf("■", "■", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□")
        )
        val board = Board(initBoard)
        val result = board.playGame()
        println("\nThird Rule ")
        for (i in result.indices) { println(result[i].contentToString()) }
        assertThat(result.contentDeepEquals(secondGenBoard)).isEqualTo(true)
    }


    @Test
    fun `assert Any dead cell with exactly three live neighbours becomes alive`() {
        val initBoard = arrayOf(
                arrayOf("■", "■", "□", "□", "□"),
                arrayOf("■", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□")
        )
        val secondGenBoard = arrayOf(
                arrayOf("■", "■", "□", "□", "□"),
                arrayOf("■", "■", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□"),
                arrayOf("□", "□", "□", "□", "□")
        )
        val board = Board(initBoard)
        val result = board.playGame()
        println("\nFourth Rule ")
        for (i in result.indices) { println(result[i].contentToString()) }
        assertThat(result.contentDeepEquals(secondGenBoard)).isEqualTo(true)
    }

}