class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var maxCount = 1
        var count = 1
        val sa = nums.sorted()
        for (i in 1 until sa.size) {
            if (sa[i] < sa[i - 1]) {
                maxCount = maxOf(maxCount, count)
                count = 1
            } else {
                if (Math.abs(sa[i] - sa[i - 1]) == 1) {
                    count++
                } else {
                    if (Math.abs(sa[i] - sa[i - 1]) > 1) {
                        maxCount = maxOf(maxCount, count)
                        count = 1
                    }
                }
            }
        }
        return maxOf(maxCount, count)
    }
}