package com.algorithm.imodupsy.avecfola.queue.queue_with_stack;

import java.util.Stack;

/**
 * @author iModupsy
 * @created 28/04/2023
 */
public class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {}
    public void push(int x) {
        stack1.push(x);
    }

    public int peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

       int itemPeeked = stack2.peek();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        System.out.println(itemPeeked);
        return itemPeeked;
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int itemPop = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return itemPop;
    }

    boolean empty() {
        return stack1.isEmpty();
    }

    public void display() {
        while (!stack1.isEmpty()) {
            System.out.println(stack1);
            return;
        }
    }
}
