class `Move Zeros` {
    fun moveZeroes(nums: IntArray): Unit {
        var nonZeroIndex = 0

        nums.forEach {
            if (it != 0) {
                nums[nonZeroIndex] = it
                nonZeroIndex += 1
            }
        }

        for (i in nonZeroIndex until nums.size) {
            nums[i] = 0
        }
    }
}