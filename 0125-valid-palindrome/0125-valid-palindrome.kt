class Solution {
    fun isPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length - 1
        while (i < j) {
            val start = s[i]
            val end = s[j]
            if (!start.isLetterOrDigit()) {
                i++
                continue
            }
            if (!end.isLetterOrDigit()) {
                j--
                continue
            }
            if (start.lowercaseChar() != end.lowercaseChar()) 
                return false
            i++
            j--
        }
        return true
    }
}