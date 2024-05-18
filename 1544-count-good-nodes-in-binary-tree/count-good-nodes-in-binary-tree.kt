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
    fun goodNodes(root: TreeNode?): Int {
         return if (root == null) 0 else countGoodNode(root, root.`val`)
    }
    
    fun countGoodNode(node:TreeNode?, maxSoFar: Int): Int {
        if (node==null) return 0
        
         val isGood = if (node.`val` >= maxSoFar) 1 else 0
        
        val newMaxSoFar = maxOf(maxSoFar, node.`val`)
        
        val leftGoodNodes = countGoodNode(node.left, newMaxSoFar)
        val rightGoodNodes = countGoodNode(node.right, newMaxSoFar)
        
        return isGood + leftGoodNodes + rightGoodNodes
        
        
        
    }
}