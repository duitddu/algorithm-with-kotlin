class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        return if (numRows == 0) return emptyList()
        else generatePascals(numRows)
    }

    private fun generatePascals(numRows: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>().apply {
            add(listOf(1))
        }

        for (i in 1 until numRows) {
            val prevRow = result[i - 1]
            val row = mutableListOf<Int>().apply {
                add(1)
                for (j in 1 until i) {
                    add(prevRow[j - 1] + prevRow[j])
                }
                add(1)
            }
            result.add(row)
        }

        return result
    }
}

fun main() {
    val sol = Solution()
    println(sol.generate(5))
}