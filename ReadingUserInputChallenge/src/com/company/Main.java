package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while (counter < 11) {
            System.out.println("Enter number #" + counter + ":");
            boolean hasInt = input.hasNextInt();

            if (hasInt) {
                int number = input.nextInt();
                input.nextLine();
                counter++;
                sum = sum + number;
            } else {
                System.out.println("Invalid Number");
                input.nextLine();
            }



        }
        System.out.println(sum);
        input.close();
    }
}
