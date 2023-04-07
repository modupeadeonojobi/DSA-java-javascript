package com.algorithm.imodupsy.avecemma.stack.impl;

import static java.lang.System.exit;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * @author iModupsy
 * @created 07/04/2023
 */
public class StackUsingLinkedList {

    Node top;

    public StackUsingLinkedList () {
        this.top = null;
    }

    public void push (int x) {
        Node temp = new Node();

        if (isNull(temp)) {
            System.out.println("Stack overflow");
        }

        // initialize data into temp data field
        temp.data = x;

        // put top reference into temp link ie linking to the prev top
        temp.link = top;

        // update top reference
        top = temp;

    }

    public void pop() {

        if (isNull(top)) {
            System.out.println("Stack underflow");
        }

        top = top.link;
    }

    public void peek()
    {
        // check for empty stack
        if (nonNull(top)) {
            System.out.println(top.data);
        }
        else {
            System.out.println("Stack is empty");
        }
    }


    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.print(temp.data);

                // assign temp link to temp
                temp = temp.link;
                if(temp != null)
                    System.out.print(" -> ");
            }
        }
    }


}
