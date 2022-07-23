package com.algorithm.imodupsy.agiletechnicalpracticedistilled.classictdd.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author iModupsy
 * @created 23/07/2022
 */
class FizzBuzzTest {

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