package com.algorithm.imodupsy.interswitch;

/**
 * @author iModupsy
 * @created 26/05/2022
 */
public class Technical {
//
//
//    Write a method to replace all spaces in a string with %20. You may assume that the string
//    has sufficient space at the end to hold the additional characters and that you are given the
//    “true” length of the string.
//    Example
//    Input: “Mr John Smith “, 13
//    Output: “Mr%20John%20Smith”

    public static void main(String[] args) {

        String str = "Mr John Smith ";
        String strNew = str.trim().replaceAll(" ", "%20");
        System.out.println(strNew);



    }

}
