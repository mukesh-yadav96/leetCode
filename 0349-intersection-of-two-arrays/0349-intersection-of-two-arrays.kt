class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val n1 = nums1.toSet()
    val n2 = nums2.toSet()
    val list = mutableListOf<Int>()
    n1.forEach { 
        if(it in n2)
            list.add(it)
    }
    return list.toSet().toIntArray()
    }
}