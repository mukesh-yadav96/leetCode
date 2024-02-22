class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val set = nums.toSet()
        for(n in 0 until set.size) {
            nums[n]=set.elementAt(n)
        }
        return set.size
    }
}