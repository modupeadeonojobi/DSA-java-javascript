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
        reverse(name);
    }

    public static void reverseAString(String name) {

        for (int i = name.length() -1; i >= 0; i--) {
            System.out.println(name.charAt(i));

        }

    }

    public static void reverse(String name) {

        String strReverse = "";

        if (name == null || name == "" || name.length() < 2) {
            System.out.println("Hey!, this is not a string");
        }

        char[] charName = name.toCharArray();

        for (int i = charName.length -1; i >= 0; i--) {
            strReverse += charName[i];
        }

        System.out.println(strReverse);
    }

}
