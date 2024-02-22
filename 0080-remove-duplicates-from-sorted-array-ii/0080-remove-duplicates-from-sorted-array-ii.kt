class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val hm = LinkedHashMap<Int,Int>()
        for(s in nums) {
            hm[s] = hm.getOrDefault(s, 0)+1
        }
        var counter = 0
        for(n in hm) {
            if(n.value>1) {
                nums[counter]=n.key
                counter++
                nums[counter]=n.key
                counter++
            } else {
                nums[counter]=n.key
                counter++
            }
        }
        return counter
    }
}