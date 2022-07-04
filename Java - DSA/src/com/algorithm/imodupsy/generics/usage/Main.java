package com.algorithm.imodupsy.generics.usage;

/**
 * @author iModupsy
 * @created 04/07/2022
 */
public class Main {

    public static void main(String[] args) {
        CustomerList<String> list = new CustomerList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
        System.out.println(list);
        String s = list.get(0);
        System.out.println(s);

        CustomerList<Integer> list2 = new CustomerList<>();
        list2.add(1);
        list2.add(12);
        list2.add(23);
        list2.add(65);
        System.out.println(list2);
        Integer integer = list2.get(0);
        System.out.println(integer);
    }
}
