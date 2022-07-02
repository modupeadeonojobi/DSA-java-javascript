package com.algorithm.imodupsy.avecemma.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author iModupsy
 * @created 02/07/2022
 */
public class JewelAndStone {

    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        jewelCount(jewels, stones);
    }

    private static void jewelCount(String jewels, String stones) {
        Map<Character, Integer> stoneMap = new HashMap<>();
        for (char stone : stones.toCharArray()) {
            Integer value = stoneMap.get(stone);

            if (value == null) {
                stoneMap.put(stone, 1);
            } else {
                stoneMap.put(stone, value +1);
            }
        }

        int count = 0;
        for (char jewel : jewels.toCharArray()) {
            if (stoneMap.containsKey(jewel)) {
                count+=stoneMap.get(jewel);
            }
        }
        System.out.println(count);
    }
}
