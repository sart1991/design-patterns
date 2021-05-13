package com.designpatterns.learn.domains.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    // a year is a leap year if it is divisible by four
    // but, years divisible by 100, are not leap years,
    // except years divisible by 400

    @Test
    public void shouldBeDivisibleByFourIfLeapYear() {

        assertTrue(LeapYear.isLeapYear(2020));

    }

    @Test
    public void shouldNotBeDivisibleByFourIfNotLeapYear() {

        assertFalse(LeapYear.isLeapYear(2021));

    }

    @Test
    public void shouldNotBeDivisibleByHundredIfNotLeapYear() {

        assertFalse(LeapYear.isLeapYear(1900));

    }

    @Test
    public void shouldBeDivisibleByFourHundredIfLeapYear() {
        assertTrue(LeapYear.isLeapYear(2000));
    }

}
