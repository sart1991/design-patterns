package com.designpatterns.learn.domains.tdd;

public class LeapYear {
    public static boolean isLeapYear(final int year) {
        return isDivisible(year, 4) && (!isDivisible(year, 100) || isDivisible(year, 400));
    }

    private static boolean isDivisible(int number, int denominator) {
        return number % denominator == 0;
    }

}
