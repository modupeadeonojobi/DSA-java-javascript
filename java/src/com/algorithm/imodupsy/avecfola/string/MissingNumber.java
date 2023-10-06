package com.algorithm.imodupsy.avecfola.string;

/**
 * @author iModupsy
 * @created 06/10/2023
 */
public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int[] nums2 = {9,6,4,2,3,5,7,0,1};

        int result = missingNumber(nums2);
        System.out.println(result);

    }

    private static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;

    }
}
