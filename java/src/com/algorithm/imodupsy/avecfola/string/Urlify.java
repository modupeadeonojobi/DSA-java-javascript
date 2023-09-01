package com.algorithm.imodupsy.avecfola.string;

/**
 * @author iModupsy
 * @created 25/02/2023
 */
public class Urlify {

    public static void main(String[] args) {
        String str = "Mr John Smith ";

        String url = fixUrl(str);
        System.out.println(url);
    }

    private static String fixUrl(String str) {
        return str.trim().replace(" ", "%20");

    }
}
