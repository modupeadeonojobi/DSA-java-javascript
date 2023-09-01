package com.algorithm.imodupsy.avecemma.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author iModupsy
 * @created 12/07/2022
 */
public class CountFrequency {

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};

        int count = count(arr);
        System.out.println(count);
    }

    private static int count(int[] arr) {

        if (arr.length < 0) {
            return 0;
        }
        HashMap<Integer, Integer> frequencyCounter = new HashMap<>();

        for (int num : arr) {
            Integer value = frequencyCounter.get(num);
            if (value == null) {
                frequencyCounter.put(num, 1);
            } else {
                frequencyCounter.put(num, value + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyCounter.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;

    }
}
