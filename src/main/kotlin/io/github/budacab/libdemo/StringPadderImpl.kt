package io.github.budacab.libdemo

class StringPadderImpl: StringPadder {

    override fun padLeft(stringToPad: String, totalLength: Int): String {
        return padLeft(stringToPad, totalLength, ' ')
    }

    override fun padLeft(stringToPad: String, totalLength: Int, paddingCharacter: Char): String {
        return getStringToBeAdded(stringToPad, totalLength, paddingCharacter) + stringToPad
    }

    override fun padRight(stringToPad: String, totalLength: Int): String {
        return padRight(stringToPad, totalLength, ' ')
    }

    override fun padRight(stringToPad: String, totalLength: Int, paddingCharacter: Char): String {
        return stringToPad + getStringToBeAdded(stringToPad, totalLength, paddingCharacter)
    }

    private fun getStringToBeAdded(stringToPad: String, totalLength: Int, paddingCharacter: Char): String {
        val quantity = totalLength - stringToPad.length

        return if (quantity > 0) {
            paddingCharacter.toString().repeat(quantity)
        } else {
            ""
        }
    }
}