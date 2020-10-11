package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 476;
        myIntArray[5] = 50;

        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};

        int[] myIntArray3 = new int[10];
        for(int i = 0;i < myIntArray3.length;i++) {
            myIntArray3[i] = i*10;
        }
        printArray(myIntArray3);

        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray2[0]);
        System.out.println(myIntArray3[9]);

        //-------------New Practice
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers (int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i = 0;i < values.length;i++) {
            values[i] = scanner.nextInt();
            //scanner.nextLine();
        }
        return values;
    }

    public static void printArray (int[] array) {
        for(int i = 0;i < array.length;i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }
    }

    public static double getAverage (int[] array) {
        double sum = 0;
        for(int i = 0;i < array.length;i++) {
            sum += array[i];
        }
        return (double) (sum / array.length);
    }

}
