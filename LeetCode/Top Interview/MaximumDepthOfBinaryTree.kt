import kotlin.math.max

// https://leetcode.com/problems/maximum-depth-of-binary-tree/

class MaximumDepthOfBinaryTree {
    fun maxDepth(root: TreeNode?): Int {
        if(root == null) return 0
        return travel(root.left, root.right, 1)
    }

    private fun travel(left: TreeNode?, right: TreeNode?, depth: Int): Int {
        if (left == null && right == null) return depth

        return max(travel(left?.left, left?.right, depth+1),
                travel(right?.left, right?.right, depth+1))
    }
}