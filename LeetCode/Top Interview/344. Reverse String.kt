class `Reverse String` {
    fun reverseString(s: CharArray): Unit {
        for(i in 0 until s.size / 2) {
            val end = s.lastIndex - i
            val leftChar = s[i]
            val rightChar = s[end]

            s[i] = rightChar
            s[end] = leftChar
        }
    }
}