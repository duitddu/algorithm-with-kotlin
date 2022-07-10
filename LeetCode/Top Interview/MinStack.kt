import java.util.*

class MinStack() {

    private val stack = Stack<Int>()

    fun push(x: Int) {
        stack.push(x)
    }

    fun pop() = stack.pop()

    fun top(): Int = stack.peek()

    fun getMin(): Int = stack.min() ?: 0

}