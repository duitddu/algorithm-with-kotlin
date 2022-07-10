class `Valid Anagram` {
    fun isAnagram(s: String, t: String): Boolean =
        if (s.length != t.length) false
        else {
            val table = IntArray(26) { 0 }.toMutableList()

            for (i in s.indices) {
                val sChar = s[i]
                val tChar = t[i]

                table[sChar - 'a'] += 1
                table[tChar - 'a'] -= 1
            }

            table.count { it != 0 } == 0
        }
}