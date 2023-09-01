package com.algorithm.imodupsy.avecfola.string;

import java.util.Arrays;

/**
 * @author iModupsy
 * @created 25/02/2023
 */
public class Permutation {
    public static void main(String[] args) {
        // Is it case-sensitive?
        // Does white space at the beginning or end of the string matter?

        String s = "dog";
        String t = "god";

        boolean permutation = isPermutation(s, t);
        System.out.println(permutation);
    }

    public static String sort (String s) {
        char[] strChar = s.toCharArray();
        Arrays.sort(strChar);
        return new String(strChar);
    }

    private static boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return sort(s).equals(sort(t));
    }
}
