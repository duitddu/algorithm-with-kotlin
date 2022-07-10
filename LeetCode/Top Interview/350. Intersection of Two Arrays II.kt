class `Intersection of Two Arrays II` {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val numMap = mutableMapOf<Int, Int>()
        val resultNums = mutableListOf<Int>()

        nums1.forEach {
            val value = numMap[it]
            if (value != null) {
                numMap[it] = value + 1
            } else {
                numMap[it] = 1
            }
        }

        nums2.forEach {
            val value = numMap[it]

            if (value != null && value > 0) {
                resultNums.add(it)
                numMap[it] = value-1
            }
        }

        return resultNums.toIntArray()
    }
}