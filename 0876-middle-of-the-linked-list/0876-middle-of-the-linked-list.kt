/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        if(head?.next==null) return head
        var n = head?.next
        var nn = head?.next?.next
        while(nn?.next?.next!=null) {
            n = n?.next
            nn = nn?.next?.next
        }
        return if(nn?.next!=null) n?.next else n
    }
}