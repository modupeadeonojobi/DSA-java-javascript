package com.algorithm.imodupsy.avecfola;

/**
 * @author iModupsy
 * @created 24/02/2023
 */
public class SingleNum {

    public static void main(String[] args) {
       int[] nums = {4,1,2,1,2};

        int singleNum = findSingleNum(nums);
        System.out.println(singleNum);
    }

    private static int findSingleNum(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n;
        }
        return result;
    }
}
