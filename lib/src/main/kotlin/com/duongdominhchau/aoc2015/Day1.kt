package com.duongdominhchau.aoc2015

class Day1 {
    private val input: String

    constructor(input: String) {
        this.input = input
    }
    fun firstPart(): Int =
            input.asIterable().map { if (it == '(') 1 else -1 }.fold(0) { sum, current ->
                sum + current
            }

    fun secondPart(): Int {
        var count = 0
        for ((index, ch) in input.withIndex()) {
            if (ch == '(') {
                count += 1
            } else {
                count -= 1
            }
            if (count < 0) {
                return index + 1
            }
        }
        throw IllegalStateException("Unreachable code path")
    }
}
