class `First Unique Character in a String` {
    fun firstUniqChar(s: String): Int {
        val charMap = mutableMapOf<Char, Int>()

        s.forEach {
            charMap[it] = (charMap[it] ?: 0) + 1
        }

        s.forEachIndexed { index, c ->
            val value = charMap[c]
            if (value != null && value == 1) {
                return index
            }
        }

        return -1
    }
}