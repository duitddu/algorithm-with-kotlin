// https://leetcode.com/problems/count-and-say/

import java.lang.StringBuilder

class CountAndSay {
    fun countAndSay(n: Int): String {
        var answer = "1"

        for(i in 1 until n) {
            val newAnswer = StringBuilder()
            var numCount = 0
            var numCache: Char = answer[0]

            for(j in answer.indices) {
                val num = answer[j]

                if(numCache != num) {
                    newAnswer.append("$numCount$numCache")
                    numCache = num
                    numCount = 1
                } else {
                    numCount += 1
                }
            }

            newAnswer.append("$numCount$numCache")
            answer = newAnswer.toString()
        }
        return answer
    }
}