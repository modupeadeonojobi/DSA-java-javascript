package com.algorithm.imodupsy.agiletechnicalpracticedistilled.classictdd.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author iModupsy
 * @created 23/07/2022
 */
class FizzBuzzTest {

    /**
     * Write a function that takes numbers from 1 to 100 and outputs them as a string, but for
     * multiples of 3, it returns Fizz instead of the number, and for multiples of 5, it returns
     * Buzz. For numbers that are multiples of both 3 and 5, it returns FizzBuzz.
     */

    @Test
    public void testFizzBuzz() {
        assertEquals("1", fizzBuzz(1));
        assertEquals("2", fizzBuzz(2));
        assertEquals("Fizz", fizzBuzz(3));
        assertEquals("Fizz", fizzBuzz(6));
        assertEquals("Buzz", fizzBuzz(5));
        assertEquals("Buzz", fizzBuzz(10));
        assertEquals("FizzBuzz", fizzBuzz(15));
    }

    private String fizzBuzz(int input) {
        String output = "";
        if (input % 3 == 0) {
            output += "Fizz";
        }
        if (input % 5 == 0) {
            output += "Buzz";
        }
        if (input % 3 != 0 && input % 5 != 0) {
            output = String.valueOf(input);
        }
        return output;
    }

}