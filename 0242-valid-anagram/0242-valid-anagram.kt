class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val hm = HashMap<Char, Int>()
        s.forEach {
            hm[it] = hm.getOrDefault(it, 0) + 1
        }
        t.forEach {
            hm[it] = hm.getOrDefault(it, 0) - 1
        }
        return hm.filterValues { it > 0 }.isEmpty()
    }
}