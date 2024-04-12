package com.duongdominhchau.aoc2015

class Day2 {
    fun run(input: String): Int =
        input
            .asIterable()
            .map { if (it == '(') 1 else -1 }
            .fold(0) { sum, current -> sum + current }
}

