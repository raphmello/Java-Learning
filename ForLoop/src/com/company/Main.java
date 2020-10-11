package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000,2.0));

        for (int i = 2; i < 9; i += 2 ) {
//            System.out.println("Loop " + i + " hello!");
            System.out.println(calculateInterest(10000,i));
        }

    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * interestRate/100);
    }

}
