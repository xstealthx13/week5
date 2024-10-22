package model

import kotlin.random.Random

data class soal1_model(
    var guess: Int,
    var score: Int
) {
    fun letter() {
        val huruf = arrayOf(
            "a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
            "j",
            "k",
            "l",
            "m",
            "n",
            "o",
            "p",
            "q",
            "r",
            "s",
            "t",
            "u",
            "v",
            "w",
            "x",
            "y",
            "z"
        )
        val random = Random(1)
        val size = random.nextInt(0, 25)
        huruf[size]
    }

    fun score() {
        score = 0
    }

    fun guess() {
        guess = 0
    }

}