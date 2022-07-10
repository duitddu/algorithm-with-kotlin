class `Palindrome Linked List` {
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
            } else {
                curHead = curHead.next
                curReversedHead = curReversedHead.next
            }
        }

        return true
    }

    private fun ListNode?.reversed(): ListNode? {
        var reverseHead: ListNode? = null
        var curHead = this

        while (curHead != null) {
            val next = curHead.next

            curHead.next = reverseHead
            reverseHead = curHead

            curHead = next
        }

        return reverseHead
    }
}