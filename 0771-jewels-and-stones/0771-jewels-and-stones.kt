class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val s = jewels.split("")
        var count = 0
        stones.forEach {
            if(it.toString() in s)
                count++
        }
        return count
    }
}