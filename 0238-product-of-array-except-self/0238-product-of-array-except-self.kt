class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
    val arr = IntArray(nums.size)
    val ap = nums.filter { it!=0 }.foldIndexed(1) { i, acc, e ->
        acc*e
    }
    val containsZero = 0 in nums
    for (i in nums.indices) {
        if (containsZero) {
            if (nums[i]==0)
                arr[i] = if (nums.filter{it==0}.count() > 1) 0 else ap
            else
                arr[i] = 0
        } else {
            arr[i] = ap/nums[i]
        }
    }
    return arr
}
}