package com.algorithm.imodupsy.datastructure.queue;

import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.function.Predicate;

/**
 * @author iModupsy
 * @created 27/06/2022
 */

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(), value2.length());
    }
}

public class PriorityQueue {

    public static void main(String[] args) {
        java.util.PriorityQueue<String> queue = new java.util.PriorityQueue<>();
        queue.addAll(List.of("Pig", "Zebra", "Monkey", "Cat", "Goat"));
//        System.out.println(queue);

//        queue.peek();
        queue.peek();
        System.out.println(queue);

//        Queue
//        PriorityQueue priorityQueue;
    }
}

