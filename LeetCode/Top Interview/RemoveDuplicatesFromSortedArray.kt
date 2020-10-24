// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        val numSet = mutableSetOf<Int>()
        var duplicatedNumIndex = 0

        for(i in nums.indices) {
            val num = nums[i]

            if(!numSet.contains(num)) {
                numSet.add(num)
                nums[duplicatedNumIndex] = nums[i]
                duplicatedNumIndex += 1
            }
        }
        return numSet.size
    }
}