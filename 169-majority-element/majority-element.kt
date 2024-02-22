class Solution {
    fun majorityElement(nums: IntArray): Int {
        var hm = HashMap<Int,Int>()
        for(num in nums) {
            hm[num] = hm.getOrDefault(num, 0)+1
        }
        return hm.entries.maxBy { it.value }.key
        
    }
}