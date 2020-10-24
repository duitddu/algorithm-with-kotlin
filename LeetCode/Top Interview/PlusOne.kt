class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        var lastIndex = digits.lastIndex

        digits[lastIndex] = (digits[lastIndex] + 1) % 10
        var isCarry = digits[lastIndex] == 0

        while(isCarry && lastIndex >= 1) {
            digits[lastIndex-1] = (digits[lastIndex-1] + 1) % 10
            isCarry = digits[lastIndex-1] == 0
            lastIndex -= 1
        }

        return if(isCarry) intArrayOf(1) + digits else digits
    }
}