/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class SortedArrayToBST {
    fun sortedArrayToBST(nums: IntArray): TreeNode? = if (nums.isEmpty()) {
        null
    } else {
        generateBST(nums, 0, nums.lastIndex)
    }

    private fun generateBST(nums: IntArray, start: Int, end: Int): TreeNode? = if (start > end) {
        null
    } else {
        val mid = start + (end - start) / 2
        TreeNode(nums[mid]).apply {
            left = generateBST(nums, start, mid-1)
            right = generateBST(nums, mid+1, end)
        }
    }
}