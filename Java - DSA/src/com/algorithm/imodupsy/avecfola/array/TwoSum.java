package com.algorithm.imodupsy.avecfola.array;

import java.util.*;

/**
 * @author iModupsy
 * @created 24/02/2023
 */
public class TwoSum {

    public static void main(String[] args) throws Exception {
        int[] nums = {2,5,5,11};
        int target = 10;

        int[] indicesOfSum = findIndicesOfSum(nums, target);
        System.out.println("ChatGPT " + Arrays.toString(indicesOfSum) );

        mineFindIndicesOfSum(nums, target);
    }

    // ChatGPT
    private static int[] findIndicesOfSum(int[] nums, int target) throws Exception {
        if (nums.length <= 1) {
            throw new IllegalArgumentException("Array does not have a pair");
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // Mine
    private static void mineFindIndicesOfSum(int[] nums, int target) throws Exception {
        if (nums.length <= 1) {
            throw new IllegalArgumentException("Array does not have a pair");
        }
        List<Integer> numSet = new ArrayList<>();
        int[] sum = new int[2];

        for (int num : nums) {
            if (num != target) {
                numSet.add(num);
            }
        }

        for (int n : numSet) {
            if (numSet.contains(target - n)) {
                sum = new int[]{n, target - n};
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == sum[0]) {
                System.out.println(i);
            } else if (nums[i] == sum[1]) {
                System.out.println(i);

            }
        }

    }
}
