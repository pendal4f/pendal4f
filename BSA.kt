class BSA {
    ///BSA - bubble sort algorithm///
    fun bubbleSort(array: IntArray): IntArray {
        for (i in 0 until array.size - 1) {
            for (p in 0 until array.size - i - 1) {
                if (array[p] > array[p + 1]) {
                    val temp = array[p]
                    array[p] = array[p + 1]
                    array[p+ 1] = temp
                }
            }
        }
        return array
    }
    fun main() {
        val numbers = intArrayOf(1,2,3,4,5,10,20,30,40,50)
        println("orig array: ${numbers.joinToString(", ")}")
        bubbleSort(numbers)
        println("current array: ${numbers.joinToString(", ")}")
    }
}