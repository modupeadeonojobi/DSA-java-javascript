package com.algorithm.imodupsy.avecfola.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author iModupsy
 * @created 25/02/2023
 */
public class UniqueCharacter {
    public static void main(String[] args) {
        // Is it case-sensitive?
        // What if it has capital letter J and small letter j, is it still unique?
        String name = "Joyjo";

        boolean hasUniqueCharacter = hasUniqueCharacter(name);
        System.out.println(hasUniqueCharacter);
    }

    private static boolean hasUniqueCharacter(String name) {
        HashMap<Character, Integer> nameMap = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {
            nameMap.put(name.charAt(i), nameMap.getOrDefault(name.charAt(i), 0)+ 1);
        }

        for (Map.Entry<Character, Integer> entry : nameMap.entrySet()) {
            if (entry.getValue() > 1) {
                return false;
            }

        }
        return true;
    }


    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;
        boolean[] charSet = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }
}
