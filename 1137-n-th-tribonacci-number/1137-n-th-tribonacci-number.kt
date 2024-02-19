class Solution {
    val memo = IntArray(38){-1}

    fun tribonacci(n: Int): Int {
        if(memo[n] == -1) {

            memo[n] = when(n) {
                0 -> 0
                1 -> 1
                2 -> 1
                else -> tribonacci(n-3) + tribonacci(n-2) + tribonacci(n-1)
            }
        }
        return memo[n]        
    }
}