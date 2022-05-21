package com.algorithm.imodupsy.bigo;

/**
 * @author iModupsy
 * @created 21/05/2022
 */
public class FindNemo {

    public static void main(String[] args) {
        String[] nemo = {"nemo"};

        findNemo(nemo);
    }

    public static void findNemo(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "nemo") {
                System.out.println("Found NEMO!!!");
            }
        }
    }


}
