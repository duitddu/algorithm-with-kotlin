/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class LinkedListCycle {
//    fun hasCycle(head: ListNode?): Boolean {
//        val hashSet = mutableSetOf<ListNode>()
//        var _head = head
//
//        while(_head != null) {
//            if (hashSet.contains(_head)) {
//                return true
//            } else {
//                hashSet.add(_head)
//            }
//
//            _head = _head.next
//        }
//
//        return false
//    }

    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) return false

        var oneStepHead = head
        var twoStepHead = head.next

        while(oneStepHead != twoStepHead) {
            if (twoStepHead?.next == null) return false

            oneStepHead = oneStepHead?.next
            twoStepHead = twoStepHead.next?.next

        }
        return true
    }
}