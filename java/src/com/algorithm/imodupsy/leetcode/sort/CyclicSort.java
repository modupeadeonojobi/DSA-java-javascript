package com.algorithm.imodupsy.leetcode.sort;

import java.util.Arrays;

/**
 * @author iModupsy
 * @created 23/09/2023
 */
public class CyclicSort {

    private static int[] cyclicSort(int[] arr) {

        int n = arr.length;
        int i = 0;

        while (i < n) {
            if (arr[i] != i + 1) {
                // Swap arr[i] with the element at its correct position
                int correctIndex = arr[i] - 1;
                if (correctIndex >= 0 && correctIndex < n) {
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                }
            } else {
                i++;
            }

        }

        return arr;

    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 5, 1, 4};
        cyclicSort(nums);

        System.out.println("Cyclic sort ::: " + Arrays.toString(nums));


    }


}
