package com.algorithm.imodupsy.avecfola.string;

/**
 * @author iModupsy
 * @created 03/03/2023
 */
public class ShuffleString {

    public static void main(String[] args) {

        String name = "MEDIUM";
        int[] indices = {2, 4, 5, 0, 1, 3};

        String shuffle = shuffle(name, indices);
        System.out.println(shuffle);
    }

    private static String shuffle(String name, int[] indices) {
        StringBuilder con = new StringBuilder();
        if (name.length() == 1) {
            return name;
        }

        for (int i = 0; i < indices.length; i++) {
            System.out.println(indices[i]);
            char c = name.charAt(indices[i]);
            System.out.println(c);
             con.append(c);
        }

        return con.toString();
    }

}
