package ru.otus.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class SumoftwoTest {

    @Test
    fun `overflow must not produce a false match`() {
        assertThrows<IllegalArgumentException> {
            sumOfTwo(intArrayOf(Int.MAX_VALUE, 1), Int.MIN_VALUE)
        }
    }

    @Test
    fun `duplicate values use different indices`() {
        assertArrayEquals(intArrayOf(0, 1), sumOfTwo(intArrayOf(3, 3), 6))
    }

    @Test
    fun `testcase 1`() {
        val actual = sumOfTwo(intArrayOf(2, 7, 11, 15), 9)
        val expected = intArrayOf(0, 1)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `testcase 2`() {
        val actual = sumOfTwo(intArrayOf(3, 2, 4), 6)
        val expected = intArrayOf(1, 2)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `testcase 3`() {
        assertThrows<IllegalArgumentException> {
            sumOfTwo(intArrayOf(3, 2), 6)
        }
    }
}
