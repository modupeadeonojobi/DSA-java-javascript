package com.algorithm.imodupsy.avecfola.string;

/**
 * @author iModupsy
 * @created 06/10/2023
 */
public class FirstMissingPositive {

    public static void main(String[] args) {

        int[] nums = {3,4,-1,1};
        int[] nums2 = {7,8,9,11,12};

        int result = firstMissingPositive(nums);
        System.out.println(result);
    }

    private static int firstMissingPositive(int[] nums) {

        int n = nums.length;

        // Rearrange the elements to their correct positions
        for (int i = 0; i < n; i++) {
            while (nums[i] >= 1 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all integers from 1 to n are present, the missing integer is n + 1
        return n + 1;
    }
}
