package com.algorithm.imodupsy.solvingproblem;

/**
 * @author iModupsy
 * @created 26/05/2022
 */
public class ManipulateString {

    public static void main(String[] args) {
        String name = "john";
        String strNew = name.replace("o", "");
//        System.out.println(strNew);

        reverseAString(name);
    }

    public static void reverseAString(String name) {

        for (int i = name.length() -1; i >= 0; i--) {
            System.out.println(name.charAt(i));

        }

    }

}
