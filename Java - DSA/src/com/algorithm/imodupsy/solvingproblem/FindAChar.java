package com.algorithm.imodupsy.solvingproblem;

/**
 * @author iModupsy
 * @created 17/06/2022
 */
public class FindAChar {

    public static void main(String[] args) {

       String letters = "asdfghjklpoiuytrewqzxcvbnm";
        findALetter(letters);
        findOneLetter(letters);
    }

    private static void findALetter(String letter) {
        boolean val = letter.contains("m");
        if (val)
            System.out.println("Found it!!!");
        else
            System.out.println("Cannot be found!!!");
    }

    private static void findOneLetter (String letter) {
        int indexOfValue = letter.indexOf("m");
        if (indexOfValue != -1)
            System.out.println("Found it!!!");
        else
            System.out.println("Cannot be found!!!");
    }


}
