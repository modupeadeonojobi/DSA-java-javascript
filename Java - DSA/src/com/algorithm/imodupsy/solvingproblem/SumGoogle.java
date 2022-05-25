package com.algorithm.imodupsy.solvingproblem;

import java.util.HashSet;

/**
 * @author iModupsy
 * @created 25/05/2022
 */
public class SumGoogle {

    public static void main(String[] args) {
        int target = 8;
        int[] arr1 = {1, 2, 3, 9}; // false
        int[] arr2 = {1, 2, 4, 4}; // true

        boolean isEqualToTarget = sumPairsToGetTarget(arr1, target);
        System.out.println(isEqualToTarget);

        boolean isEqualToTarget2 = sumPairsToGetTarget2(arr2, target);
        System.out.println(isEqualToTarget2);
    }

    /** ================================== (2) =====================================
     Brute force approach                                                          */
    public static boolean sumPairsToGetTarget(int[] arr1, int target) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (arr1[i] + arr1[j] == target)
                    return true;
            }
        }
        return false;

    }

    /** ================================== (2) =====================================
     Efficient approach                                                            */
    public static boolean sumPairsToGetTarget2(int[] arr1, int target) {
        HashSet<Integer> pairs = new HashSet();

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != target) {
                pairs.add(arr1[i]);
            }
        }

        for (int j = 0; j < pairs.size(); j++) {
            if (pairs.contains(target - arr1[j])) {
                return true;
            }
        }
        return false;

    }
}
