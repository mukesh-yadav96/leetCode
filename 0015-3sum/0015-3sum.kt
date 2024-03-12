class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = mutableListOf<List<Int>>()

        for (i in 0 until nums.size - 2) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                var left = i + 1
                var right = nums.size - 1
                val target = 0 - nums[i]

                while (left < right) {
                    val sum = nums[left] + nums[right]

                    when {
                        sum == target -> {
                            result.add(listOf(nums[i], nums[left], nums[right]))
                            while (left < right && nums[left] == nums[left + 1]) left++
                            while (left < right && nums[right] == nums[right - 1]) right--
                            left++
                            right--
                        }
                        sum < target -> left++
                        else -> right--
                    }
                }
            }
        }
        return result
    }
}
