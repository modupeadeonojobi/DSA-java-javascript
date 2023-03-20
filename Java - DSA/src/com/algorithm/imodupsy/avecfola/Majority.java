package com.algorithm.imodupsy.avecfola;

import java.util.*;

/**
 * @author iModupsy
 * @created 24/02/2023
 */
public class Majority {

    public static void main(String[] args) {
        int[] nums = {3,2,2,2,3};

        List<Integer> integers = majorityElement(nums);
        System.out.println(integers);
    }

    private static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> mapNums = new HashMap<>();
        List<Integer> elements = new ArrayList<>();
        int max = nums.length/3;


        for (int n : nums) {
            mapNums.put(n, mapNums.getOrDefault(n, 0) + 1);
        }


        for(Map.Entry<Integer, Integer> entry : mapNums.entrySet()) {
            if (entry.getValue() > max) {
                elements.add(entry.getKey());
            }
        }

        return elements;


    }
}
