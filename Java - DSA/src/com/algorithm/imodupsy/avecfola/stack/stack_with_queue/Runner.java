package com.algorithm.imodupsy.avecfola.stack.stack_with_queue;

/**
 * @author iModupsy
 * @created 24/04/2023
 */
public class Runner {

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.display();

        stack.pop();

        System.out.println("===========================");
        stack.display();

    }
}
