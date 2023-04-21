package com.algorithm.imodupsy.avecfola.queue_with_node;

import com.algorithm.imodupsy.avecfola.stack.impl.Node;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * @author iModupsy
 * @created 14/04/2023
 */
public class QueueN {

    Node head;

    public QueueN() {
        this.head = null;
    }

    public void enqueue(int item) {
        Node newNode = new Node();
        newNode.data = item;

        if (isNull(head)) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp != null && temp.link != null) {
                temp = temp.link;
            }

            temp.link = newNode;

        }
    }

    public int dequeue() {
        Node temp = head;

        int item = temp.data;
        head = temp.link;
        return item;

    }

    public void print() {
        Node node = head;
        while (nonNull(node)) {
            System.out.println(node.data);
            node = node.link;
        }

    }
}
