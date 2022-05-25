package com.algorithm.imodupsy.solvingproblem;

import java.util.Hashtable;

/**
 * @author iModupsy
 * @created 24/05/2022
 */
public class CompareArrays {

    public static void main(String[] args) {
        // Test case 1
        String[] array1 = {"a", "b", "c", "d"};
        String[] array2 = {"x", "y", "z"};


        // Test case 2
        String[] arr1 = {"a", "b", "c", "x"};
        String[] arr2 = {"x", "y", "z"};

        boolean isSameItem = containSameItem1(array1, array2);
        System.out.println("O(n^2) => " + isSameItem);

        boolean isSameItem2 = containSameItem2(arr1, arr2);
        System.out.println("O(n) => " + isSameItem2);

    }


    /** ================================== (1) =====================================
    Brute force approach with a time complexity of O(n^2) and space complexity of O(1)  */
    public static boolean containSameItem1(String[] array1, String[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    return true;
            }
        }
        return false;
    }


    /** ================================== (2) =====================================
     Efficient approach with a time complexity of O(n) and space complexity of O(n)  */
    public static boolean containSameItem2(String[] array1, String[] array2) {
        Hashtable<String, Boolean> firstArrayObj = new Hashtable<>();
        for (int i = 0; i < array1.length; i++) {
            firstArrayObj.put(array1[i], true);
        }

        for (int j = 0; j < array2.length; j++) {
            if (firstArrayObj.containsKey(array2[j]))
                return true;
        }
        return false;
    }

}
