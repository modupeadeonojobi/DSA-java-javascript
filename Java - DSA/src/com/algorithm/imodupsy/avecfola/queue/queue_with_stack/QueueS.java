package com.algorithm.imodupsy.avecfola.queue.queue_with_stack;

import java.util.Stack;

/**
 * @author iModupsy
 * @created 24/04/2023
 */
public class QueueS {

    Stack<Integer> stack1 =  new Stack<>();
    Stack<Integer> stack2 =  new Stack<>();

    public QueueS() {}

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            // remove item from the back and add to a new stack
            stack2.push(stack1.pop());
        }

        // now, the first item from stack1 is now the last in stack2
        int itemPopped = stack2.pop();

        // now, stack1 is empty we need to add the items back in
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return itemPopped;
    }

    public int peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int itemPeek = stack2.peek();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return itemPeek;

    }

    public boolean empty() {
        // we applied on stack1 because stack1 is the dominant stack
        return stack1.isEmpty();
    }

    public void display() {
        while (!stack1.isEmpty()) {
//            System.out.println(stack1);
        }
    }
}
