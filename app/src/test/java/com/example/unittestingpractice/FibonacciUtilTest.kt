package com.example.unittestingpractice

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class FibonacciUtilTest {

    @Test
    fun `value 0 should return 0`() {
        val result = FibonacciUtil.fib(0)

        assertThat(result).isEqualTo(0L)
    }

    @Test
    fun `value 1 should return 1`() {
        val result = FibonacciUtil.fib(1)

        assertThat(result).isEqualTo(1L)
    }

    @Test
    fun `value bigger thant 1 returns `() {
        val result = FibonacciUtil.fib(0)

        assertThat(result).isEqualTo(1L)
    }

    @Test
    fun `value bigger thant 1  `() {
        val result = FibonacciUtil.fib(0)

        assertThat(result).isEqualTo(1L)
    }
}