package com.algorithm.imodupsy.solvingproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author iModupsy
 * @created 25/06/2022
 */
public class RemoveFromArray {

    public static void main(String[] args) {
        String[] animals = {"Cat", "Dog", "Rat", "Monkey", "Pig", "Goat"};

        /** ================================== (1) =====================================
        Loop through an array using stream API */
//        Stream<String> stream = Arrays.stream(animals);
//        stream.forEach(System.out::println);

        Arrays.stream(animals).forEach(System.out::println);

        /** ================================== (1) =====================================
         Remove all string that ending with "at" */
        deleteTargetFromArray(animals);
//
    }

    private static void deleteTargetFromArray(String[] animals) {
        List<String> animalList = Arrays.asList(animals); // Convert array to an immutable list
        List<String> allAnimals = new ArrayList<>(animalList); // Convert immutable list to mutable list

        Iterator<String> iterator = allAnimals.iterator();

        while(iterator.hasNext()) {
            if (iterator.next().endsWith("at")) {
                iterator.remove();
            }
        }

        System.out.println("After removing strings that end with 'at' " +  allAnimals);
    }


}
