package io.github.budacab.libdemo;

// Factory for creating instances of StringPadder
public final class StringPadderFactory {

    private StringPadderFactory() {
    }

    /**
     * Creates an instance of {@link StringPadder}.
     *
     * @return the new instance
     */
    public static StringPadder createStringPadder() {
        return new StringPadderImpl();
    }

}
