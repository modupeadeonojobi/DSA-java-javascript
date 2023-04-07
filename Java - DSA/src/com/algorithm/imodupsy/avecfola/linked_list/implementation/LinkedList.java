package com.algorithm.imodupsy.avecfola.linked_list.implementation;


import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * @author iModupsy
 * @created 24/03/2023
 */
public class LinkedList {

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
        }
        else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }

    }

    public void print() {
        Node node = head;
        while (nonNull(node)) {
            System.out.println(node.data);
            node = node.next;
        }

    }

    public void delete(int data) {
        Node temp = head;
        Node prev = null;


        if (temp == null) {
            System.out.println("The linked lis is empty");
        }

        if (temp.data == data) {
            temp = temp.next;
            return;
        }

        while (temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;


    }


    // REDO

    public void add(int data) {
        Node node = new Node();
        node.data = data;

        if (isNull(head)) {
            head = node;
        } else {
            Node last = new Node();
            while (nonNull(last.next)) {
                last = last.next;
            }
            last.next = node;
        }
    }
}
