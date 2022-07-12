package com.algorithm.imodupsy.avecemma.array;

import java.util.HashMap;

/**
 * @author iModupsy
 * @created 12/07/2022
 */
public class CountFrequency {

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        
        count(arr);
    }

    private static void count(int[] arr) {
        HashMap<Integer, Integer> frequencyCounter = new HashMap<>();

        for (int num : arr) {
            Integer value = frequencyCounter.get(num);
            if (value == null) {
                frequencyCounter.put(num, 1);
            }else {
                frequencyCounter.put(num, value + 1);
            }
        }
        System.out.println(frequencyCounter);
    }
}
