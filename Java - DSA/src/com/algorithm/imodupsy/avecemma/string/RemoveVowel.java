package com.algorithm.imodupsy.avecemma.string;

/**
 * @author iModupsy
 * @created 01/07/2022
 */
public class RemoveVowel {

    public static void main(String[] args) {
        String word = "welcome to geeksforgeeks";

//        removeTheVowels(word);
        removeTheVowelsUsingRegex(word);
    }

    private static void removeTheVowels(String word) {

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' ||
                    word.charAt(i) == 'i' || word.charAt(i) == 'o' ||
                    word.charAt(i) == 'u' || word.charAt(i) == 'A' ||
                    word.charAt(i) == 'E' || word.charAt(i) == 'I' ||
                    word.charAt(i) == 'O' || word.charAt(i) == 'U') {
                continue;
            } else {
                System.out.println(word.charAt(i));
            }

        }
    }

    private static void removeTheVowelsUsingRegex(String word) {
        String newStr = word.replaceAll("[aeiouAEIOU]", "");
        System.out.println(newStr);
    }
}
