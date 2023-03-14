package com.example.unittestingpractice

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty userName returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid userName and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Andre",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `userName alreadys exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Andre",
            "",
            ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password was repeated incorrectly returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Andre",
            "123",
            "122"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password has less than 2 digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Andre",
            "andre1",
            "andre1"
        )

        assertThat(result).isFalse()
    }
}