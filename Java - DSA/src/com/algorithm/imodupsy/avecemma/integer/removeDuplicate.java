package com.algorithm.imodupsy.avecemma.integer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author iModupsy
 * @created 28/06/2022
 */
public class removeDuplicate {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 1, 5, 1, 4, 5, 3, 5};


        removeDuplicateFromArray(arr);
    }

    private static void removeDuplicateFromArray(int[] arr) {
        Set<Integer> noDuplicate = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            noDuplicate.add(arr[i]);
        }

        System.out.println(noDuplicate);
    }
}
