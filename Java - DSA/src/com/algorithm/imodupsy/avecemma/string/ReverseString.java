package com.algorithm.imodupsy.avecemma.string;

/**
 * @author iModupsy
 * @created 02/07/2022
 */
public class ReverseString {

    public static void main(String[] args) {
        String word = "Hello";

        getStringValue(word);
        getCharValue(word);
        getValueWithStringBuilder(word);
    }

    private static void getStringValue(String word) {
        char[] wordChar = word.toCharArray();
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += wordChar[i];
        }
        System.out.println("Printing string values " + reversedWord);
    }

    private static void getCharValue(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println(word.charAt(i));
        }

    }

    private static void getValueWithStringBuilder(String word) {
        StringBuilder wordBuilder = new StringBuilder();
        wordBuilder.append(word);
        System.out.println(wordBuilder.reverse());
    }
}
