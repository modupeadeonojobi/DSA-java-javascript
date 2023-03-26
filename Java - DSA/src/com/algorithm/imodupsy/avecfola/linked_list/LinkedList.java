package com.algorithm.imodupsy.avecfola.linked_list;

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
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void print() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
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
}
