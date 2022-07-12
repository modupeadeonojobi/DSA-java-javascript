package com.algorithm.imodupsy.avecemma.array;

import java.util.HashSet;

/**
 * @author iModupsy
 * @created 12/07/2022
 */
public class RemoveDuplicateFromArray {

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'a', 'c', 'c'};
        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};


       removeDuplicate(arr);
    }

    private static void removeDuplicate(char[] arr) {
        HashSet<Character> uniqueChar = new HashSet<>();
        for (char c : arr) {
            uniqueChar.add(c);
        }
        System.out.println(uniqueChar);
    }
}
