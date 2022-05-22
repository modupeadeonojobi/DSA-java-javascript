package com.algorithm.imodupsy.bigo;

/**
 * @author iModupsy
 * @created 21/05/2022
 */
public class FindNemo {

    public static void main(String[] args) {
        String[] nemo = {"nemo"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8,};
        String[] alphabets = {"a", "b", "c", "x", "y", "z"};

        findNemo(nemo);
        findSix(numbers);
        printPairs(alphabets);
    }

    // The time complexity is O(n) ie linear time.
    public static void findNemo(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "nemo") {
                System.out.println("Found NEMO!!!");
                break; // This line make the code efficient
            }
        }
    }

    // The time complexity is O(1) ie constant time.
    public static void findSix(int[] nums) {
        System.out.println(nums[5]);
    }

    // The time complexity is O(n^2) ie quadratic time.
    public static void printPairs(String[] alpha) {
        for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                System.out.println("The pairs => " + alpha[i] + ", " + alpha[j]);
            }
        }

    }



}
