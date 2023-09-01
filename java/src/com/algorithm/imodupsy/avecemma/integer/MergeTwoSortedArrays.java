package com.algorithm.imodupsy.avecemma.integer;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author iModupsy
 * @created 28/06/2022
 */
public class MergeTwoSortedArrays {

    public static void main(String[] args) {
       int[] arr1 = { 1, 3, 4, 5};
       int[] arr2 = {2, 4, 6, 8};

       mergeSorted(arr1, arr2);

    }

    private static void mergeSorted(int[] arr1, int[] arr2) {
        Map<Integer, Integer> mergeSorted = new TreeMap<>();

        for (int i = 0; i < arr1.length; i++) {
            mergeSorted.put(arr1[i], i);
        }

        for (int i = 0; i < arr2.length; i++) {
            mergeSorted.put(arr2[i], i);
        }
        System.out.println(mergeSorted.keySet());
    }
}
