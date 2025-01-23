class SR {
    ///SR - square root///
    fun squareRoot(number: Double): Double {
        if (number < 0) {
            println("cannot find the root of a negative number!")
            return -1.0
        }
        var left = 0.0
        var right = number
        var mid: Double
        val accuracy = 0.0001

        while (right - left > accuracy) {
            mid = (left + right)/2
            if (mid * mid > number) {
                right = mid
            } else {
                left = mid
            }
        }
        return (left + right)/2
    }
    fun main() {
        val number = 16.0
        val squareRoot = squareRoot(number)
        if (squareRoot != -1.0) {
            println("approximate rot of number $number = $squareRoot")
        }
    }
}