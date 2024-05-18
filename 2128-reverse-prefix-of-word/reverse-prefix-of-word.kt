class Solution {
    fun reversePrefix(word: String, ch: Char): String {
    with(word) {
        if(contains(ch)) {
        val i = indexOf(ch)
        val r = substring(0, i+1).reversed()
        return r+substring(i+1, length)
        } else {
            return word
        }
    }
        
}
}