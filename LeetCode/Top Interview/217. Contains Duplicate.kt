class `Contains Duplicate` {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numSet = mutableSetOf<Int>()

        nums.forEach {
            if (numSet.contains(it)) {
                return true
            } else {
                numSet.add(it)
            }
        }
        return false
    }
}