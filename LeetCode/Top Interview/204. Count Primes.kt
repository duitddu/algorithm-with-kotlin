class `Count Primes` {
    fun countPrimes(n: Int): Int = if (n < 2) {
        0
    } else {
        var count = 0

        val isPrime = BooleanArray(n) { true }

        for (i in 2..(n-1)/2) {
            if (isPrime[i]) {
                var j = 2
                while (i*j < n) {
                    isPrime[i*j] = false
                    j += 1
                }
            }
        }

        isPrime.count { it } - 2
    }
}