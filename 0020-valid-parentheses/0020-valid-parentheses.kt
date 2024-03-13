class Solution {
    fun isValid(s: String): Boolean {
        val map = mapOf(
            ')' to '(',
            '}' to '{',
            ']' to '[',
        )
        val stack = ArrayDeque<Char>()
        for (char in s) {
            val openBracket = map[char]
            if (openBracket != null && stack.isNotEmpty() && stack.last() == openBracket) {
                stack.removeLast()
            } else {
                stack.add(char)
            }
        }   
        return stack.isEmpty()   
    }
}