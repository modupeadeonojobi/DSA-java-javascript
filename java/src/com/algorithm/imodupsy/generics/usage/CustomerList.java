package com.algorithm.imodupsy.generics.usage;

import java.util.ArrayList;

/**
 * @author iModupsy
 * @created 04/07/2022
 */
public class CustomerList<T> {

    ArrayList<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    public String toString() {
        return list.toString();
    }

    public T get(int idx) {
        return list.get(idx);
    }
}
