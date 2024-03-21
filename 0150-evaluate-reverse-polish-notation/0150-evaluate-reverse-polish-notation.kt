class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val m = mapOf(
            "+" to "add",
            "-" to "sub",
            "*" to "mul",
            "/" to "div"
        )
        val s = Stack<Int>()
        for (t in tokens) {
            val value = m[t]
            value?.let {
                val v2 = s.pop()
                val v1 = s.pop()
                when {
                    value == "add" -> {
                        val res = v1+v2
                        s.push(res)
                    }
                    value == "sub" -> {
                        val res = v1-v2
                        s.push(res)
                    }
                    value == "mul" -> {
                        val res = v1*v2
                        s.push(res)
                    }
                    value == "div" -> {
                        val res = v1/v2
                        s.push(res)
                    }
                    else -> {
                        throw IllegalArgumentException("Not a defined operator")
                    }
                }
                
            } ?: run {
                s.push(t.toInt())
            }
        }
        return s.first()
    }
}