package com.algorithm.imodupsy.datastructure.hasttable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author iModupsy
 * @created 27/06/2022
 */
public class CountRecurring {

    public static void main(String[] args) {
        String str = "This is awesome. It has never happened before awesome";

        numberOfCharInAString(str);

        numberOfWordsInAString(str);

    }

    private static void numberOfCharInAString(String str) {
        Map<Character, Integer> occurrence = new HashMap<>();

        char[] characters = str.toCharArray();

        for (Character character : characters) {
            Integer value = occurrence.get(character);
            if (value == null) {
                occurrence.put(character, 1);
            } else {
                occurrence.put(character, value++);
            }
        }

        System.out.println("Char count " + occurrence);
    }

    private static void numberOfWordsInAString(String str) {

        String[] words = str.split(" ");

        Map<String, Integer> stringOccurrences = new HashMap<>();

        for (String word : words) {
            Integer numberOfTimes = stringOccurrences.get(word);
            if (numberOfTimes == null) {
                stringOccurrences.put(word, 1);
            } else {
                stringOccurrences.put(word, numberOfTimes++);
            }
        }
        System.out.println("Words count " + stringOccurrences);
    }
}
