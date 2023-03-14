package com.example.unittestingpractice

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class AssertBracesUtilTest {

    @Test
    fun `more ( thant ) returns false`() {
        val result = AssertBracesUtil.checkBraces("((myTest)")

        assertThat(result).isFalse()
    }

    @Test
    fun `more ) thant ( returns false`() {
        val result = AssertBracesUtil.checkBraces("(myTest))")

        assertThat(result).isFalse()
    }

    @Test
    fun `only one ) returns false`() {
        val result = AssertBracesUtil.checkBraces("myTest)")

        assertThat(result).isFalse()
    }


    @Test
    fun `only one ( returns false`() {
        val result = AssertBracesUtil.checkBraces("myTest)")

        assertThat(result).isFalse()
    }

    @Test
    fun `one ( and one ) returns true`() {
        val result = AssertBracesUtil.checkBraces("(myTest)")

        assertThat(result).isTrue()
    }

    @Test
    fun `one ( and one ) in order returns true`() {
        val result = AssertBracesUtil.checkBraces("(myTest)")

        assertThat(result).isTrue()
    }

    @Test
    fun `one ( and one ) out of order returns false`() {
        val result = AssertBracesUtil.checkBraces(")myTest(")

        assertThat(result).isFalse()
    }
}