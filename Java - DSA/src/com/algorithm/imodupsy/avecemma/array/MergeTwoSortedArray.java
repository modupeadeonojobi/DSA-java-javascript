package com.algorithm.imodupsy.avecemma.array;

import java.util.TreeSet;

/**
 * @author iModupsy
 * @created 11/07/2022
 */
public class MergeTwoSortedArray {

    public static void main(String[] args) {
      int arr1[] = { 1, 3, 4, 5};
      int arr2[] = {2, 4, 6, 8};

      mergeSorted(arr1, arr2);
    }

    private static void mergeSorted(int[] arr1, int[] arr2) {
        TreeSet<Integer> merged = new TreeSet<>();

        for (Integer a1 : arr1) {
            merged.add(a1);
        }
        for (Integer a2 : arr2) {
            merged.add(a2);
        }
        System.out.println(merged);

    }
}
