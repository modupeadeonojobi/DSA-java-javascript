package com.algorithm.imodupsy.solvingproblem;

import java.util.Arrays;

/**
 * @author iModupsy
 * @created 26/05/2022
 */
public class ManipulateArray {

    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c", "d"};

//        addToAnArray(array1);

        removeFromAnArray(array1);
    }

    public static boolean addToAnArray(String[] arr) {

        int n = arr.length;
        String[] newArray = new String[n + 1];

        for (int i = 0; i < n; i++) {
            newArray[i] = arr[i];
        }
        newArray[n] = "e";
        System.out.println(Arrays.toString(newArray));
        return false;
    }

    public static boolean removeFromAnArray(String[] arr) {

        String[] completeArray = new String[arr.length - 1];

        for (int i = 0,  k = 0; i < arr.length; i++) {
            if (arr[i] != "c") {
                completeArray[k++] = arr[i];
            }

        }

        System.out.println(Arrays.toString(completeArray));
        return false;
    }
}
