package com.algorithm.imodupsy.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author iModupsy
 * @created 20/09/2023
 */
public class UniqueMorseCodeWords {

    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        int result = numOfUniqueMorseCode(words);
        System.out.println(result);
    }

    private static int numOfUniqueMorseCode(String[] words) {
        Set<String> set = new HashSet<>();
        String[] morseChar = {".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.","---",".--.",
                "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for (String word : words) {
            StringBuilder morseString = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                // 97
                morseString.append(morseChar[word.charAt(i) - 'a']);
            }

            set.add(morseString.toString());
        }

        return set.size();
    }
}
