package com.company;

import java.util.Enumeration;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int counter = 1;

        while (true) {
            System.out.println("Enter number:");
            boolean hasInt = input.hasNextInt();



            if (hasInt) {
                int number = input.nextInt();
                if (counter == 1) {
                    min = number;
                    max = number;
                }
                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }

            } else {
                break;
            }
            counter++;
            input.nextLine();
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        input.close();
    }
}
