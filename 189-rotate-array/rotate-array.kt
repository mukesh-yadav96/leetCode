class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
    val n = nums.size
    val rotations = k % n // Adjust k in case it's greater than the array length
    
    var count = 0 // Count the number of elements that have been moved
    var start = 0 // Start index for each cycle

    while (count < n) {
        var current = start
        var prev = nums[start]

        do {
            val next = (current + rotations) % n
            val temp = nums[next]
            nums[next] = prev
            prev = temp
            current = next
            count++
        } while (start != current) // Move until we reach the starting point of the cycle
        
        start++ // Move to the next cycle
    }
}

}