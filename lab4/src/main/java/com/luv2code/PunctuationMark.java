package com.luv2code;

public class PunctuationMark {
    private final char value;

    public PunctuationMark(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
