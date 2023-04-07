package com.algorithm.imodupsy.avecemma.stack.impl;

/**
 * @author iModupsy
 * @created 07/04/2023
 */
public class Runner {

    public static void main(String[] args) {
        StackUsingLinkedList obj = new StackUsingLinkedList();
        obj.push(1);
        obj.push(2);
        obj.push(3);

        obj.peek();
        obj.display();

    }
}
