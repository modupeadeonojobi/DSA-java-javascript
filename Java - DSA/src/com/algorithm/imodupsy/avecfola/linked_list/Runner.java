package com.algorithm.imodupsy.avecfola.linked_list;

/**
 * @author iModupsy
 * @created 24/03/2023
 */
public class Runner {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insert(3);
        linkedList.insert(5);
        linkedList.insert(9);
        linkedList.insert(1);
        linkedList.insert(7);
//        linkedList.print();

        linkedList.delete(1);
        linkedList.print();


    }
}
