class `Factorial Trailing Zeroes` {
    fun trailingZeroes(n: Int): Int {
        var zeros = 0
        var computeN = n

        while (computeN > 0) {
            zeros += computeN / 5
            computeN /= 5
        }

        return zeros
    }
}