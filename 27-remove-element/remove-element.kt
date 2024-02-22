class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var li = nums.size-1
        var temp = 0
        while(temp<=li) {
            if(nums[temp]==`val`) {
                nums[temp]=nums[li].also {
                    nums[li]=nums[temp]
                }
                li--
            } else {
                temp++
            }
        }
        return nums.filter{it!=`val`}.size
    }
}