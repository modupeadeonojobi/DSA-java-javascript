package com.algorithm.imodupsy.avecfola.stack.exercise;

import java.util.Stack;

/**
 * @author iModupsy
 * @created 23/09/2023
 */
public class MissingBracket {

    private static boolean missingBracket(String code) {
        Stack stack = new Stack<>();

        for (char c : code.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            if (!stack.isEmpty()) {
                char top = (char) stack.peek();
                if (top == ')' || c == '}' || c == ']') {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String code = "({]})";

        boolean result = missingBracket(code);
        System.out.println(result);
    }


}
