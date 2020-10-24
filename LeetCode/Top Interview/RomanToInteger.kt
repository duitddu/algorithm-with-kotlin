// https://leetcode.com/problems/roman-to-integer/

class RomanToInteger {
    companion object {
        val ROMAN_MAP = hashMapOf(
                "I" to 1,
                "V" to 5,
                "X" to 10,
                "L" to 50,
                "C" to 100,
                "D" to 500,
                "M" to 1000,
                "IV" to 4,
                "IX" to 9,
                "XL" to 40,
                "XC" to 90,
                "CD" to 400,
                "CM" to 900
        )
    }

    fun romanToInt(s: String): Int {
        var answer = 0

        var index = 0
        while(index < s.length) {
            val cur: String = s[index].toString()
            val next: String = s.getOrNull(index+1).toString()

            if(ROMAN_MAP.containsKey("$cur$next")) {
                answer += ROMAN_MAP.getOrDefault("$cur$next", 0)
                index += 2
            } else {
                answer += ROMAN_MAP.getOrDefault(cur, 0)
                index += 1
            }
        }
        return answer
    }
}