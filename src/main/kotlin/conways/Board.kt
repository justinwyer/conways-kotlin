package conways

class Board(private var cells: Array<Array<String>>) {

    // update game board according to given rules
    fun playGame(): Array<Array<String>> {
        val resultBoard = Array(cells.size) { Array(cells[0].size) { "" } }
        for (i in cells.indices) {
            for (j in cells[i].indices) {
                val cell = Cell(i, j, cells[i][j])
                val count = getLiveNeighboursCount(cell)
                if (count < 2 || count > 3) cell.kill()
                else if (count == 3) cell.revive()
                else if(count == 2 && cell.representation == "■") cell.revive()
                else cell.representation = cells[i][j]
                resultBoard[i][j] = cell.representation
            }
        }
        cells = resultBoard;
        return resultBoard
    }

    // get count number of live neighbours to specific cell
    private fun getLiveNeighboursCount(cell: Cell): Int {
        var count = 0
        for (i in cell.row - 1..cell.row + 1) {
            for (j in cell.col - 1..cell.col + 1) {
                if (i >= 0 && i < cells.size &&
                        j >= 0 && j < cells.size &&
                        (i != cell.row || j != cell.col)) {
                    val item = Cell(i, j, cells[i][j])
                    if (item.isAlive)
                        count++
                }
            }
        }
        return count
    }

}