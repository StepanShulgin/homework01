package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    return Array(n) { number ->
        when {
            number % 15 == 0 -> "FizzBuzz"
            number % 3 == 0 -> "Fizz"
            number % 5 == 0 -> "Buzz"
            else -> number.toString()
        }
    }
}
