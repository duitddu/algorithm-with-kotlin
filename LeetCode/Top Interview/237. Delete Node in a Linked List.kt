class `Delete Node in a Linked List` {
    inner class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun deleteNode(node: ListNode?) {
        val next = node?.next
        if (next != null) {
            node.`val` = next.`val`
        }
        node?.next = next?.next
    }
}