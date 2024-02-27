class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n:Int):Int {
    var num  = n
    num = num and -0x10000 ushr 16 or (num and 0x0000ffff shl 16)
    num = num and -0xff0100 ushr 8 or (num and 0x00ff00ff shl 8)
    num = num and -0xf0f0f10 ushr 4 or (num and 0x0f0f0f0f shl 4)
    num = num and -0x33333334 ushr 2 or (num and 0x33333333 shl 2)
    num = num and -0x55555556 ushr 1 or (num and 0x55555555 shl 1)
    return num
    }
}