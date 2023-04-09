package com.algorithm.imodupsy.avecfola.stack.impl;

/**
 * @author iModupsy
 * @created 07/04/2023
 */
public class Stack {

    Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int d) {
        Node temp = new Node();

        temp.data = d;
        temp.link = top;
        top = temp;
    }

    public void display() {
        Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }

    public void pop() {
        top = top.link;
    }

    public void peek() {

        if (top != null) {
            System.out.println(top.data);
        }
    }
}
