package com.algorithm.imodupsy.agiletechnicalpracticedistilled.classictdd.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * @author iModupsy
 * @created 24/07/2022
 */
class LeapYearTest {

    /**
     * Write a function that returns true or false depending on whether its input integer is a
     * leap year or not. A leap year is defined as one that is divisible by 4, but is not otherwise
     * divisible by 100 unless it is also divisible by 400. For example, 2001 is a typical common
     * year and 1996 is a typical leap year, whereas 1900 is an atypical common year and 2000
     * is an atypical leap year.
     */

    @Test
    public void testLeapYear() {
        assertEquals(true, leapYear(1996));
        assertEquals(false , leapYear(2001));
        assertEquals(false, leapYear(1900));
        assertEquals(true, leapYear(2000));
    }

    private boolean leapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }
}
