package com.algorithm.imodupsy.avecemma.string;

/**
 * @author iModupsy
 * @created 01/07/2022
 */
public class DefangedIPAddress {

    public static void main(String[] args) {
        String addressIP = "255.100.50.0";

        usingRegex(addressIP);
//        usingCharArray(addressIP);
    }

    private static void usingRegex(String addressIP) {
        String defangedIP = addressIP.replace(".", "[.]");
        System.out.println(defangedIP);
    }

    private static void usingCharArray(String addressIP) {
        String defangedIp =  "";

        for (int i = 0; i < addressIP.length(); i++) {
            char digit = addressIP.charAt(i);

            if (digit == '.') {
                defangedIp += "[.]";
            } else {
                defangedIp += digit;
            }
        }
        System.out.println(defangedIp);
    }
}