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
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val leaves1 = ArrayDeque<Int>()
        val leaves2 = ArrayDeque<Int>()
        dfs(root1, leaves1)
        dfs(root2, leaves2)
        return leaves1 == leaves2
    }

    private fun dfs(node: TreeNode?, leaves: ArrayDeque<Int>) {
        if (node == null) return
        if (node.left == null && node.right == null) {
            leaves.add(node.`val`)
        }
        dfs(node.left, leaves)
        dfs(node.right, leaves)
    }
}