class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.size!=nums.distinct().size // easiest but not efficient
        
        // val hs = HashSet<Int>()
        // for(i in nums) {
        //     if (!hs.add(i)) {
        //         return true
        //     }
        // }
        // return false // efficient way
        
    }
}