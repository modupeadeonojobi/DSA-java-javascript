package com.algorithm.imodupsy.avecfola.string;

/**
 * @author iModupsy
 * @created 03/03/2023
 */
public class removeVowel {

    public static void main(String[] args) {
        String name = "Hello world";

        String remove = remove(name);
        System.out.println(remove);

    }

    private static String remove(String name) {
      return name.replaceAll("[aeiouAEIOU]", "");
    }
}
