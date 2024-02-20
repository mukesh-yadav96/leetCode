class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val hm = HashMap<Int,Int>()
    nums.forEach {
        hm[it] = hm.getOrDefault(it,0)+1
    }
    return hm.entries.sortedByDescending { it.value }.take(k).map { it.key }.toIntArray()
    }
}