package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val indexesByNumber = mutableMapOf<Int, Int>()

    numbers.forEachIndexed { index, number ->
        val matchingIndex = indexesByNumber[target - number]
        if (matchingIndex != null) {
            return intArrayOf(matchingIndex, index)
        }
        indexesByNumber[number] = index
    }

    throw IllegalArgumentException("No two numbers add up to $target")
}
