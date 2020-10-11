package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = getIntegers(5);
        printArray(array);
        array = sortIntegers(array);
        printArray(array);
    }

    public static int[] getIntegers (int number) {
        int[] array = new int[number];
        for (int i = 0;i < number;i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray (int[] array) {
        for (int i = 0;i < array.length;i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }
    }

    public static int[] sortIntegers (int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0;i < array.length;i++) {
            sortedArray[i] = array[i];
        }

        sortedArray = Arrays.copyOf(array,array.length); //outro jeito de copiar array

        //array[0] = -100;
        //System.out.println(sortedArray[0]);
        int count = 1;
        int temp;
        while (count > 0) {

                count = 0;
                for (int ii = 0; ii < sortedArray.length -1; ii++) {
                    if (sortedArray[ii]<sortedArray[ii+1]) {
                        temp = sortedArray[ii];
                        sortedArray[ii] = sortedArray[ii+1];
                        sortedArray[ii+1] = temp;
                        count++;
                    }
                }

        }
        return sortedArray;
    }
}
