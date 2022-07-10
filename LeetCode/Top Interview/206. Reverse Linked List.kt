class `Reverse Linked List` {
    inner class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun isPalindrome(head: ListNode?): Boolean {
        val reversed = head.reversed()

        var curHead = head
        var curReversedHead = reversed

        while (curHead != null && curReversedHead != null) {
            if (curHead.`val` != curReversedHead.`val`) {
                return false
            }
            curHead = curHead.next
            curReversedHead = curReversedHead.next
        }

        return true
    }

    private fun ListNode?.reversed(): ListNode? {
        var reverseHead: ListNode? = null
        var curHead = this

        while (curHead != null) {
            val copy = ListNode(curHead.`val`)
            val next = curHead.next
            copy.next = reverseHead
            reverseHead = copy

            curHead = next
        }

        return reverseHead
    }
}