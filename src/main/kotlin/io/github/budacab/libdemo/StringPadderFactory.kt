package io.github.budacab.libdemo

// Factory for creating instances of StringPadder
class StringPadderFactory {
    companion object {
        fun createStringPadder(): StringPadder {
            return StringPadderImpl();
        }
    }
}