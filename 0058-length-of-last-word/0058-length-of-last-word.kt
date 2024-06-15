class Solution {
    fun lengthOfLastWord(s: String): Int {
        return s.split(" ").filter{it.isNotEmpty()}.last().length
    }
}