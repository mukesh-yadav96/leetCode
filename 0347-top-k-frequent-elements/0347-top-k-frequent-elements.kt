class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    return nums.groupBy { it }.entries
        .sortedByDescending { it.value.size }
        .take(k).map { it.key }.toIntArray()
    }
}