class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hm = HashMap<Int, Int>()
        for(i in nums.indices) {
            val comp = target - nums[i]
            if(comp in hm) {
                return intArrayOf(hm[comp]!!, i)
            }
            hm[nums[i]] = i
        }
        throw IllegalArgumentException("No two solution")
    }
}