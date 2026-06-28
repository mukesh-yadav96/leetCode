class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val ans = IntArray(nums.size) { 0 }
        ans.mapIndexed { index, _ ->
            ans[index] = nums.count { it < nums[index] }
        }
        return ans
    }
}