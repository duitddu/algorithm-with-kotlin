class `Happy Nubber` {
    fun isHappy(n: Int): Boolean =
            isHappy(n, mutableSetOf<Int>())

    private fun isHappy(n: Int, mutableSet: MutableSet<Int>) : Boolean = when {
        n == 1 -> true
        mutableSet.contains(n) -> false
        else -> isHappy(toHappyNumber(n), mutableSet.apply { add(n) })
    }


    fun toHappyNumber(n: Int) : Int {
        var happyNumber = 0
        var computeN = n

        while (computeN > 0) {
            val num = computeN % 10
            happyNumber += (num * num)
            computeN /= 10
        }

        return happyNumber
    }
}