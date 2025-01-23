class BiSA {
    ///BiSA = binary search algorithm///
    fun binarySearch(array: IntArray, target: Int): Int {
        var left = 0
        var right = array.size - 1

        while (left <= right) {
            val middle = (left + right) / 2
            if (array[middle] == target) {
                return middle
            } else if (array[middle] < target) {
                left = middle + 1
            } else {
                right = middle - 1
            }
        }
        return -1
    }
    fun main() {
        val sortedNumbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val target = 5
        val result = binarySearch(sortedNumbers, target)
        if (result != -1) {
            println("element $target is found $result")
        } else {
            println("element $target not found:/")
        }
    }
}