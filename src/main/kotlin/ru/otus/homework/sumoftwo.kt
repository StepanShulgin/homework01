package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val indexesByNumber = mutableMapOf<Long, Int>()

    numbers.forEachIndexed { index, number ->
        val matchingIndex = indexesByNumber[target.toLong() - number.toLong()]
        if (matchingIndex != null) {
            return intArrayOf(matchingIndex, index)
        }
        indexesByNumber[number.toLong()] = index
    }

    throw IllegalArgumentException("No two numbers add up to $target")
}
