package io.github.budacab.libdemo

// Pads a String
interface StringPadder {
    fun padLeft(stringToPad: String, totalLength: Int): String
    fun padLeft(stringToPad: String, totalLength: Int, paddingCharacter: Char): String
    fun padRight(stringToPad: String, totalLength: Int): String
    fun padRight(stringToPad: String, totalLength: Int, paddingCharacter: Char): String
}