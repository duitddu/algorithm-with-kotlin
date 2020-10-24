class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = 0
        var j = 0
        var k = 0

        val tempArray = IntArray(m+n)

        while(i < m && j < n) {
            val num1 = nums1[i]
            val num2 = nums2[j]

            if(num1 > num2) {
                tempArray[k] = num2
                j += 1
            } else {
                tempArray[k] = num1
                i += 1
            }

            k += 1
        }

        while(i < m) {
            tempArray[k] = nums1[i]
            k += 1
            i += 1
        }

        while(j < n) {
            tempArray[k] = nums2[j]
            k += 1
            j += 1
        }

        for(i in nums1.indices) {
            nums1[i] = tempArray[i]
        }
    }
}