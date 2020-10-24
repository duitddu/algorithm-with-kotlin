class Sqrt {
    fun mySqrt(x: Int): Int {
        if(x < 2) return x

        val _x = x.toLong()
        var left: Long = 1
        var right: Long = x.toLong()
        var answer: Long = 1

        while (left <= right) {
            val mid: Long = (left + right) / 2
            val sq: Long = mid * mid

            if (sq == _x) {
                return mid.toInt()
            } else if(sq > _x){
                right = mid-1
            } else {
                left = mid+1
                answer = mid
            }
        }
        return answer.toInt()
    }
}