class `Fizz Buzz` {
    fun fizzBuzz(n: Int): List<String> =
            mutableListOf<String>().apply {
                for (i in 1..n) {
                    val by3 = i % 3
                    val by5 = i % 5

                    when {
                        by3 == 0 && by5 == 0 -> add(FIZZ_BUZZ)
                        by3 == 0 -> add(FIZZ)
                        by5 == 0 -> add(BUZZ)
                        else -> add(i.toString())
                    }
                }
            }


    companion object {
        private const val FIZZ_BUZZ = "FizzBuzz"
        private const val FIZZ = "Fizz"
        private const val BUZZ = "Buzz"
    }
}