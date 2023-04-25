package com.algorithm.imodupsy.avecfola.stack.stack_with_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author iModupsy
 * @created 24/04/2023
 */
public class StackQ {

    Queue<Integer> queue;

    public StackQ() {
        this.queue  = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);

        for (int i = 0; i < queue.size()-1; i++) {
            queue.add(queue.poll());
        }

    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();

    }

    public boolean empty() {
        return queue.isEmpty();
    }


}
