class Solution {
    
    fun reverseVowels(s: String): String {
        val str = StringBuilder()
        val vw = mutableListOf('a','e','i','o','u', 'A', 'E', 'I', 'O', 'U')
        val existedVowel = s.filter{it in vw}.toMutableList()
        
        s.forEachIndexed {i, v->
            if(v !in vw) {
                str.append(v.toString())
            } else {
                if(existedVowel.isNotEmpty()) {
                	str.append(existedVowel.removeLastOrNull())   
                }
            }   
        }
        return str.toString()
}
}