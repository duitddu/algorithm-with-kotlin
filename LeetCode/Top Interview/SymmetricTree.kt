
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class SymmetricTree {
    fun isSymmetric(root: TreeNode?): Boolean = isMirror(root?.left, root?.right)

    private fun isMirror(n1: TreeNode?, n2: TreeNode?): Boolean = when {
        n1 == null && n2 == null -> true
        n1 == null || n2 == null -> false
        else -> (n1.`val` == n2.`val`) && isMirror(n1?.left, n2?.right) && isMirror(n1?.right, n2?.left)
    }
}