package com.algorithm.imodupsy.avecfola.string;

/**
 * @author iModupsy
 * @created 01/03/2023
 */
public class CompressString {

    public static void main(String[] args) {

        String str = "aabcccccaaa";  // a2blc5a3

        String compress = compress(str);
        System.out.println(compress);
    }

    private static String compress(String str) {
        int count = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            count++;

            if ((i + 1) >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                result.append(str.charAt(i));
                result.append(count);
                count = 0;
            }
        }

        return result.length() < str.length() ? result.toString() : str;

    }
}
