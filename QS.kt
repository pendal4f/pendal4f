class QS {
    ///QS = quick sort algorithm///
    fun quicklySort(array: IntArray, start: Int, end: Int) {
        if (start < end) {
            val partitionIndex = partition(array, start, end)
            quicklySort(array, start, partitionIndex - 1)
            quicklySort(array, partitionIndex + 1, end)
        }
    }

    fun partition(array: IntArray, start: Int, end: Int): Int {
        val pivot = array[end]
        var i = start - 1
        for (p in start until end) {
            if (array[p] < pivot) {
                i++
                val temp = array[i]
                array[i] = array[p]
                array[p] = temp
            }
        }
        val temp = array[i + 1]
        array[i + 1] = array[end]
        array[end] = temp
        return i + 1
    }

    fun main() {
        val numbers = intArrayOf(10, 7, 8, 9, 1, 5)
        println("original array: ${numbers.joinToString(", ")}")
        quicklySort(numbers, 0, numbers.size - 1)
        println("quickly sorted array: ${numbers.joinToString(", ")}")
    }
}