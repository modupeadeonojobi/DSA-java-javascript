package com.algorithm.imodupsy.avecemma.integer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author iModupsy
 * @created 28/06/2022
 */
public class CountOccurrence {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        getOccurrence(arr);

    }

    private static void getOccurrence(int[] arr) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();

        for (Integer num : arr ) {
            Integer value = occurrenceMap.get(num);

            if (value == null) {
                occurrenceMap.put(num, 1);
            } else {
                occurrenceMap.put(num, value +1);
            }
        }
        System.out.println(occurrenceMap);


    }
}
