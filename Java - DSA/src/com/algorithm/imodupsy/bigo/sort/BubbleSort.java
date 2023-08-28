package com.algorithm.imodupsy.bigo.sort;

import java.util.Arrays;

/**
 * @author iModupsy
 * @created 28/08/2023
 */
public class BubbleSort {

    private static int[] bubbleSort(int[] arr) {
        int temp;
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j < (n-i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap element
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};

        int[] ints = bubbleSort(arr);
        System.out.println("Bubble sort::  " + Arrays.toString(ints));
    }


}
