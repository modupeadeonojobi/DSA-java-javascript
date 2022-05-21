package com.algorithm.imodupsy;

public class Main {

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
