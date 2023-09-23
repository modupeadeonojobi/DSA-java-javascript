package com.algorithm.imodupsy.leetcode.sort;

import java.util.Arrays;

/**
 * @author iModupsy
 * @created 23/09/2023
 */
public class InsertionSort {

    private static int[] insertion(int[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        return arr;
    }


    public static void main(String[] args) {

        int[] nums = {3, 2, 5, 1, 4};
        insertion(nums);

        System.out.println("Insertion sort ::: " + Arrays.toString(nums));

    }


}
