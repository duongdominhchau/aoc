package com.duongdominhchau.aoc2015

import kotlin.properties.Delegates
import kotlin.test.*
import org.junit.jupiter.api.BeforeAll
import strikt.api.*
import strikt.assertions.*

class Day1Test {
    companion object {
        var main: Day1 by Delegates.notNull()

        @BeforeAll
        @JvmStatic
        fun setup() {
            val input = object {}.javaClass.getResource("day1.txt").readText()
            this.main = Day1(input)
        }
    }
    val companion = Companion

    @Test
    fun testPart1() {
        expectThat(companion.main.firstPart()).isEqualTo(138)
    }
    @Test
    fun testPart2() {
        expectThat(companion.main.secondPart()).isEqualTo(1771)
    }
}
