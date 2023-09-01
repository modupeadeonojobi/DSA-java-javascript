package com.algorithm.imodupsy.avecfola.queue.queue_with_node;

/**
 * @author iModupsy
 * @created 14/04/2023
 */
public class Runner {

    public static void main(String[] args) {
        QueueN queueN = new QueueN();

        queueN.enqueue(2);
        queueN.enqueue(3);
        queueN.enqueue(5);
        queueN.enqueue(9);


        queueN.print();
        System.out.println("=================");

        queueN.dequeue();
        queueN.print();

    }
}
