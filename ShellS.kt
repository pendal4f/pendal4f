class ShellS {
    ///ShellS = Shell sort algorithm///
    fun shellSort(array: IntArray) {
        var donald = array.size / 2
        while (donald > 0) {
            for (i in donald until array.size) {
                val temp = array[i]
                var p = i
                while (p >= donald && array[p - donald] > temp) {
                    array[p] = array[p - donald]
                    p -= donald
                }
                array[p] = temp
            }
            donald /= 2
        }
    }

    fun main() {
        val numbers = intArrayOf(12, 34, 54, 2, 3)
        println("original array: ${numbers.joinToString(", ")}")
        shellSort(numbers)
        println("sorted by D.Shell array: ${numbers.joinToString(", ")}")
    }
}