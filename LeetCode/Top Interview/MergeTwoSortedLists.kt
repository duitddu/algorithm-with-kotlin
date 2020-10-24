// https://leetcode.com/problems/merge-two-sorted-lists/

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MergeTwoSortedLists {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var sortedNode = ListNode(0)
        var headNode: ListNode? = sortedNode

        var _l1 = l1
        var _l2 = l2

        while(_l1 != null && _l2 != null) {
            if(_l1.`val` < _l2.`val`) {
                headNode?.next = _l1
                _l1 = _l1.next
            } else {
                headNode?.next = _l2
                _l2 = _l2.next
            }

            headNode = headNode?.next
        }

        headNode?.next = when {
            _l1 == null -> _l2
            else -> _l1
        }

        return sortedNode.next
    }
}