// https://leetcode.com/problems/valid-parentheses/

import java.util.*

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for(bracket in s) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.add(bracket)
            } else {
                if(stack.isEmpty()) {
                    return false
                } else {
                    val pair = getPairOfBracket(bracket)
                    val prev = stack.pop()

                    if (pair != prev) {
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }

    private fun getPairOfBracket(bracket: Char) = when(bracket) {
        ')' -> '('
        ']' -> '['
        '}' -> '{'
        else -> ""
    }
}