package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4};
        System.out.println("Array is " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array is " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int temp = 0;
        for (int i = 0;i < (array.length/2);i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
