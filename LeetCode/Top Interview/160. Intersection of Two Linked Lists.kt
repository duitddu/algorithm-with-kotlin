import kotlin.math.abs

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class `Intersection of Two Linked Lists` {
    inner class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun getIntersectionNode(headA:ListNode?, headB:ListNode?): ListNode? {
        var curA = headA
        var curB = headB

        val aSize = calcSize(headA)
        val bSize = calcSize(headB)
        val diff = abs(aSize - bSize)

        if (aSize > bSize) { curA = adjustOffset(curA, diff) }
        else { curB = adjustOffset(curB, diff) }

        return findCycle(curA, curB)
    }

    private fun calcSize(head: ListNode?) : Int {
        var size = 0
        var cur = head
        while (cur != null) {
            size += 1
            cur = cur.next
        }
        return size
    }

    private fun adjustOffset(node: ListNode?, offset: Int) : ListNode? {
        var adjust = node

        for (i in 0 until offset) {
            adjust = adjust?.next
        }
        return adjust
    }

    private fun findCycle(a: ListNode?, b: ListNode?) : ListNode? {
        var cycleNode: ListNode? = null

        var curA = a
        var curB = b

        while (curA != null && curB != null) {
            if (curA == curB) {
                cycleNode = curA
                break
            }
            curA = curA.next
            curB = curB.next
        }
        return cycleNode
    }
}