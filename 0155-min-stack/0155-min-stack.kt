class MinStack() {
    val ll = LinkedList<Int>()
    
    fun push(x: Int) = ll.add(0,x)

    fun pop() = ll.remove() 

    fun top() = ll.first()

    fun getMin() = ll.minOrNull()

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */