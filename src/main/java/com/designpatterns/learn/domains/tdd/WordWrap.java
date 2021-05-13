package com.designpatterns.learn.domains.tdd;

public class WordWrap {
    public static String wrap(String input, int lineLength) {
        final StringBuilder accumulator = new StringBuilder();
        accumulator.append(input, 0, Math.min(input.length(), lineLength));
        if (input.length() > lineLength) {
            accumulator.append("\n");
        }
        if (input.length() / lineLength > 1) {
            accumulator.append(wrap(input.substring(lineLength), lineLength));
        } else {
            accumulator.append(input, lineLength, input.length());
        }
        return accumulator.toString();
    }
}
