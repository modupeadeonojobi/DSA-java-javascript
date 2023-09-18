package com.algorithm.imodupsy.leetcode.string;

/**
 * @author iModupsy
 * @created 18/09/2023
 */
public class ToLowerCase {

    public static void main(String[] args) {

        String s = "Hello";
        String result = toLowerCase(s);
        System.out.println(result);

    }

    public static String toLowerCase(String s) {

        StringBuilder word = new StringBuilder();

        for (char c : s.toCharArray()) {
            // 65 -90
            if (c >= 'A' && c <= 'Z') {
                word.append((char) (c + 32));
            } else {
                word.append(c);
            }

        }

        return word.toString();

    }
}

/**
 * https://leetcode.com/problems/to-lower-case/
 * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
 *
 * */
