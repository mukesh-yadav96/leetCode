class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if(strs.size==1) return listOf(listOf<String>(strs[0]))
        
        val hm  = HashMap<String,MutableList<String>>()
        for(i in strs.indices) {
            val s = strs[i].toCharArray().sorted().joinToString("")
            hm.getOrPut(s) { mutableListOf() }.add(strs[i])
        }
        return hm.values.toList()
    }
}