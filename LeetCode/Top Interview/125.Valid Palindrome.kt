class ValidPalindrome() {
    fun isPalindrome(s: String): Boolean = s
            .toLowerCase()
            .filter { it.isLetterOrDigit() }
            .let {
                println("$it / ${it.reversed()}")
                it == it.reversed()
            }
}

fun main() {
    ValidPalindrome().run {
        isPalindrome("A man, a plan, a canal: Panama")
        isPalindrome("race a car")
    }
}