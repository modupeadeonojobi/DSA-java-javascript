package com.algorithm.imodupsy.avecemma.string;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author iModupsy
 * @created 03/07/2022
 */
public class LongestSubstring {

    public static void main(String[] args) {
        String randomWord = "aafabccbb";

        solveWithQueue(randomWord);
    }

    private static void solveWithQueue(String randomWord) {
        Queue<Character> queue = new LinkedList<>();
        int count = 0;
        for (char c : randomWord.toCharArray()) {
            while (queue.contains(c)) {
                queue.poll();

            }
            queue.offer(c);
            count = Math.max(count, queue.size());

        }
        System.out.println(count);
    }
}
