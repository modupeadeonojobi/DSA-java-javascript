package com.algorithm.imodupsy.avecfola.stack.stack_with_queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author iModupsy
 * @created 28/04/2023
 */
public class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int popValue = queue1.remove();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return popValue;
    }

    public int top() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int topValue = queue1.peek();
        queue2.add(queue1.remove());
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return topValue;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    public void display() {
        while (!queue1.isEmpty()) {
            System.out.println(queue1);
            return;
        }
    }
}

/**
 *  For a stack, you keep adding to the top so when you remove, you remove the top
 *  ie the last one that was added. - pop()
 *  In a nutshell, stack add from right to left
 *  stack.push(1)
 *  1
 *  stack.push(2)
 *  21
 *  stack.push(3)
 *  321
 *  stack.pop() // the last one that was added is remove
 *  21
 * */
