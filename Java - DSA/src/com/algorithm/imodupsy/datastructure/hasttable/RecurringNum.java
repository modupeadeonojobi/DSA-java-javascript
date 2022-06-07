package com.algorithm.imodupsy.datastructure.hasttable;

import java.util.HashMap;

/**
 * @author iModupsy
 * @created 06/06/2022
 */
public class RecurringNum {

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 7, 3, 5, 1, 2, 4};

        int recurringChar = firstRecurringNum(nums);
        System.out.println(recurringChar);
    }

    public static int firstRecurringNum(int[] nums) {
        HashMap allNums = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (allNums.containsKey(nums[i])) {
                return nums[i];
            }
            allNums.put(nums[i], i);
        }
        return 0;
    }
}
