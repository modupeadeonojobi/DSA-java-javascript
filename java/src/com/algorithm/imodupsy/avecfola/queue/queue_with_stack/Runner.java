package com.algorithm.imodupsy.avecfola.queue.queue_with_stack;

/**
 * @author iModupsy
 * @created 24/04/2023
 */
public class Runner {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(2);
        queue.push(3);
        queue.push(4);

        queue.display();

        queue.peek();
        queue.pop();
        queue.display();
    }
}
