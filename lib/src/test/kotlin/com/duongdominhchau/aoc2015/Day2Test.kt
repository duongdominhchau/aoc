package com.duongdominhchau.aoc2015

import kotlin.test.Test
import org.junit.jupiter.api.BeforeAll
import strikt.api.*
import strikt.assertions.*

class Day2Test {
    companion object {
        @BeforeAll @JvmStatic fun setup() {}
    }
    val companion = Companion

    @Test
    fun runReturnsCorrectAnswer() {
        expectThat(Day2().run(input)).isEqualTo(138)
    }
}
