class `Missing Number` {
    fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        val nSum = n * (n+1) / 2
        val numsSum = nums.sum()

        return nSum - numsSum
    }
}