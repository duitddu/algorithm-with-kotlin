class `Majority Element` {
    fun majorityElement(nums: IntArray): Int {
        var majority = 0
        var count = 0

        nums.forEach {
            if (majority == 0) {
                majority = it
            }
            count += if (it == majority) 1 else -1
        }

        return majority
    }
}