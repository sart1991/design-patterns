package com.designpatterns.learn.domains.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordWrapTest {

    public static final int LINE_LENGTH = 5;

    // a method that beaks words on specified space with new line, like a word processor would.

    @Test
    public void shouldBreakLineIfInputOverLineLength() {
        String wrappedInput = WordWrap.wrap("The Sleepy", LINE_LENGTH);
        assertEquals("The S\nleepy", wrappedInput);
    }

    @Test
    public void shouldNotBreakLineIfShortInput() {
        String wrappedInput = WordWrap.wrap("The", LINE_LENGTH);
        assertEquals("The", wrappedInput);
    }

    @Test
    public void shouldBreakMultipleTimesIfInputIsMuchLonger() {
        String wrappedInput = WordWrap.wrap("The Sleepy Head Is Awake For All This Trouble", LINE_LENGTH);
        assertEquals("The S\nleepy\n Head\n Is A\nwake \nFor A\nll Th\nis Tr\nouble", wrappedInput);
    }

}
