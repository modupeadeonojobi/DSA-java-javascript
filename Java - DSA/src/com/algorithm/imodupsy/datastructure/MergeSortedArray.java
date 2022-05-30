package com.algorithm.imodupsy.datastructure;

import java.util.Arrays;

/**
 * @author iModupsy
 * @created 30/05/2022
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] array1 = {0, 3, 4, 31};
        int[] array2 = {4, 6, 30};

        mergeSorted(array1, array2);

    }

    public static void mergeSorted (int[] array1, int[] array2) {
        int totalArray1 = array1.length;
        int totalArray2 = array2.length;
        int[] mergedArray = new int[totalArray1 + totalArray2];
        int positionArray1 = 0, positionArray2 = 0, positionArrayNew = 0;

        while(positionArray1 < totalArray1 && positionArray2 < totalArray2) {

            if (array1[positionArray1] < array2[positionArray2]) {
                mergedArray[positionArrayNew++] = array1[positionArray1++];
            }
            else {
                mergedArray[positionArrayNew++] = array2[positionArray2++];
            }
        }

        while (positionArray1 < totalArray1) {
            mergedArray[positionArrayNew++] = array1[positionArray1++];
        }

        while (positionArray2 < totalArray2) {
            mergedArray[positionArrayNew++] = array2[positionArray1++];
        }
        System.out.println(Arrays.toString(mergedArray));

    }

}
