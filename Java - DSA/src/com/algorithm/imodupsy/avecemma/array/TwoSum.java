package com.algorithm.imodupsy.avecemma.array;

import java.util.HashSet;

/**
 * @author iModupsy
 * @created 13/07/2022
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] nums ={9,5,1,23};
        int target = 10;

        sumToTarget(nums, target);
    }

    private static void sumToTarget(int[] nums, int target) {
        HashSet<Integer> pairs = new HashSet<>();
        for (int i = 0;  i < nums.length; i++) {
            if (nums[i] != target)
                pairs.add(nums[i]);
        }

        for (int j = 0; j < pairs.size(); j++) {
            if (pairs.contains(target - nums[j]))
                System.out.println("true" + (target - nums[j]) + nums[j]);
        }

    }
}
