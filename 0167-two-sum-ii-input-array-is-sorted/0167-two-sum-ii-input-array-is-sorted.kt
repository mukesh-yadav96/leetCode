class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.lastIndex

        while (left < right) {
            val sum = numbers[left] + numbers[right]
            if (sum < target) {
                left++
                continue
            } else if (sum > target) {
                right--
                continue
            } else return intArrayOf(++left, ++right)
        }

        return intArrayOf(0)
    }
}