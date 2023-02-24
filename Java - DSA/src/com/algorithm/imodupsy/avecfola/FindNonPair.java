package com.algorithm.imodupsy.avecfola;

import java.util.HashMap;
import java.util.Map;

/**
 * @author iModupsy
 * @created 20/02/2023
 */
public class FindNonPair {

    public static void main(String[] args) {

        int nums[] = {2,3,4,2,3,4,1};

        int nonPair = getNonPair(nums);
        System.out.println(nonPair);
    }

    // ChatGPT
    /**
     * XOR (exclusive OR) is a logical operation that takes two operands and returns
     * a value of true if and only if exactly one of the operands is true.
     * In other words, the XOR operation returns true if the operands are different,
     * and false if they are the same.
     * */
    public static int findNonPair(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    private static int getNonPair(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
           Integer value = numMap.get(num);

            if (value == null) {
                numMap.put(num, 1);
            } else {
                numMap.put(num, value + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()){
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
