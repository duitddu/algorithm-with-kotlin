// https://leetcode.com/problems/maximum-subarray/

import kotlin.math.max

class MaximumSubArray {
    fun maxSubArray(nums: IntArray): Int {
        val dp = IntArray(nums.size)
        dp[0] = max(nums[0], 0)
        var output = dp[0]

        for(i in 1 until nums.size) {
            dp[i] = max(nums[i], dp[i-1] + nums[i])
            output = max(output, dp[i])
        }
        return output
    }
}