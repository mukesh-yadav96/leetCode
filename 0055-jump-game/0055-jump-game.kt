class Solution {
    fun canJump(nums: IntArray): Boolean {
        var minReachable = nums.size - 1
        var i = minReachable 
        while (i >= 0) {
            if (i + nums[i] >= minReachable) {
                minReachable = i
            }
            i--
        }
        return minReachable == 0
    }
}