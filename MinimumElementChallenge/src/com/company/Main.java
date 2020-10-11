package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        System.out.println("Enter numbers:");
        int[] integers = readIntegers(count);
        findMin(integers);
    }

    public static int[] readIntegers(int count) {

        int[] array = new int[count];
        for (int i = 0;i < count;i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        return array;
    }

    public static void findMin(int[] array) {

        Arrays.sort(array,0,array.length-1);

        System.out.println("The minimum value is " + array[0]);
    }
}
