package com.algorithm.imodupsy.avecfola.stack.impl;

/**
 * @author iModupsy
 * @created 07/04/2023
 */
public class Runner {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
//        stack.pop();
        stack.push(3);
        stack.push(4);

        stack.pop();
        stack.peek();

//        stack.display();
    }
}
