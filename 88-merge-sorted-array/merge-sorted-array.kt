class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var a1 = m - 1
        var a2 = n - 1

        for (i in nums1.size - 1 downTo 0) {
            if (a1 >= 0 && (a2 < 0 || nums1[a1] >= nums2[a2])) {
                nums1[i] = nums1[a1]
                a1--
            } else {
                nums1[i] = nums2[a2]
                a2--
            }
        }
    } 
}