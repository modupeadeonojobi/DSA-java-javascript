package com.algorithm.imodupsy.leetcode.sort;

/**
 * @author iModupsy
 * @created 29/08/2023
 */
public class SelectionSort {

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int lowestNumIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowestNumIndex]) {
                    lowestNumIndex = j;
                }
            }

            int smallestNum = arr[lowestNumIndex];

            // position 0 put arr[3] since 2 is the smallest number
            // lowest numberIndex become the former 0
            arr[lowestNumIndex] = arr[i];
            arr[i] = smallestNum;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,14,3,2,43,11,58,22};
        selectionSort(arr);
        System.out.println(arr);
    }

}
