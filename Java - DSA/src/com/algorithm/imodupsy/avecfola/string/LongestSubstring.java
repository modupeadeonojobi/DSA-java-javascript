package com.algorithm.imodupsy.avecfola.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author iModupsy
 * @created 10/03/2023
 */
public class LongestSubstring {

    public static void main(String[] args) {
        String s = "pwwkew";

        int lngest = lngSubstring(s);
        System.out.println(lngest);
    }

    private static int lngSubstring(String s) {
        List temp = new ArrayList();
        int longest = 0;

        for (int i = 0; i < s.length(); i++) {
            while (temp.contains(s.charAt(i))) {
                temp.remove(0);
            }
            temp.add(s.charAt(i));
            longest = Integer.max(longest, temp.size());


        }
        return longest;
    }
}
