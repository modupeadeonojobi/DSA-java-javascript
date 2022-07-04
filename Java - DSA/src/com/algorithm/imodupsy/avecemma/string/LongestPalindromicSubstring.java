package com.algorithm.imodupsy.avecemma.string;

/**
 * @author iModupsy
 * @created 03/07/2022
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String s = "sssqrf";
        char[] c = s.toCharArray();
        System.out.println(c.length);
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                System.out.println("true");
                System.out.println(c[i] + " " + c[i + 1]);
            } else {
                System.out.println("false");
            }
        }


    }
}
