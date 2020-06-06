
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

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        return depth(root)
    }
    private fun depth(node: TreeNode?): Int {
        if (node == null) { return 0 }
        val leftDepth = depth(node.left)
        val rightDepth = depth(node.right)
        return 1 +  maxOf(leftDepth, rightDepth)
    }
}

