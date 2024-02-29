class Solution {
    fun strStr(haystack: String, needle: String): Int {
        return if(needle in haystack) haystack.indexOf(needle) else -1
    }
}