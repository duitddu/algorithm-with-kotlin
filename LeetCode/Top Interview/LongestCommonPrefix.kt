// https://leetcode.com/problems/longest-common-prefix/

import java.lang.StringBuilder

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()) return ""
        else if(strs.size == 1) return strs[0]

        val sortedStrs = strs.sortedBy { it.length }
        val stringBuilder = StringBuilder("")

        for (i in sortedStrs[0].indices) {
            val cur = sortedStrs[0][i]
            var isHasAllStr = true

            for (j in 1 until sortedStrs.size) {
                if(sortedStrs[j][i] != cur) {
                    isHasAllStr = false
                    break
                }
            }

            if(isHasAllStr) {
                stringBuilder.append(cur)
            } else {
                break
            }
        }

        return stringBuilder.toString()
    }
}