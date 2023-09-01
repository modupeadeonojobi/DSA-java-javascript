package com.algorithm.imodupsy.avecfola.queue.simple;

/**
 * @author iModupsy
 * @created 07/04/2023
 */
public class Queue {
    int front;
    int back;
    int size;
    int capacity;
    int array[];

    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        back = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull(Queue queue) {
        return queue.size == queue.capacity;
    }

    boolean isEmpty(Queue queue) {
        return queue.size == 0;
    }

    void enqueue(int item) {
        if (isFull(this)) {
            return;
        }

        this.back = (this.back + 1) % this.capacity;
        this.array[this.back] = item;
        this.size = this.size + 1;
        System.out.println(item);
    }

    int dequeue() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        }

        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    int front() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        }

        return  this.array[this.front];
    }

    int back() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        }

        return this.array[this.back];
    }
}
