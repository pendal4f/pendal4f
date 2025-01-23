class SS {
    ///SS = selection sort algorithm///
    fun sortOfSelection(array: IntArray) {
        for (i in array.indices) {
            var minIndex = i
            for (p in i + 1 until array.size) {
                if (array[p] < array[minIndex]) {
                    minIndex = p
                }
            }
                val temp = array[i]
                array[i] = array[minIndex]
                array[minIndex] = temp
            }
        }
        fun main() {
            val numbers = intArrayOf(6, 3, 8, 5, 2)
            println("original array: ${numbers.joinToString(", ")}")
            sortOfSelection(numbers)
            println("sorted by choosing array: ${numbers.joinToString(", ")}")
        }
    }