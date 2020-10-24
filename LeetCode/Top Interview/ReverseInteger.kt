// https://leetcode.com/problems/reverse-integer/

import kotlin.math.abs
import kotlin.math.pow

class ReverseInteger {
    fun reverse(x: Int): Int {
        var answer: Long = 0
        var num = x

        while(num != 0) {
            answer = answer * 10 + (num % 10)
            num /= 10
        }

        if(answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
            return 0
        }

        return answer.toInt()
    }
}