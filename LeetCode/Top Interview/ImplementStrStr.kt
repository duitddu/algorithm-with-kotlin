// https://leetcode.com/problems/implement-strstr/

class ImplementStrStr {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0

        for (i in 0 until haystack.length - needle.length + 1) {
            for (j in needle.indices) {
                if (needle[j] != haystack[i + j]) {
                    break
                } else if (j == needle.length - 1) {
                    return i
                }
            }
        }
        return -1
    }
}