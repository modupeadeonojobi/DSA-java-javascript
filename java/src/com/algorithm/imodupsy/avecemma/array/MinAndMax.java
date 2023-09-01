package com.algorithm.imodupsy.avecemma.array;

import java.util.TreeSet;

/**
 * @author iModupsy
 * @created 13/07/2022
 */
public class MinAndMax {

    public static void main(String[] args) {

        int[] nums = {4, 2, 5, 0, 50, 28, 2};

        findMinAndMax(nums);
    }

    private static void findMinAndMax(int[] nums) {
        TreeSet<Object> sorted = new TreeSet<>();

        for (int n : nums) {
            sorted.add(n);
        }

        System.out.println("Min value " + sorted.first() + " " + "Max value " + sorted.last());
    }
}
