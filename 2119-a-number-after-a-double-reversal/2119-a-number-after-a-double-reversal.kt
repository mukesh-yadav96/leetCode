class Solution {
    fun isSameAfterReversals(num: Int): Boolean {
        if(num<10) return true
        return num.toString().reversed().trimStart('0')==num.toString().reversed()
    }
}