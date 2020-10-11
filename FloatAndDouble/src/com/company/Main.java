package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloat);
        System.out.println("Float maximum value = " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDouble);
        System.out.println("Double maximum value = " + myMaxDouble);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDouble Value = " + myDoubleValue);

        double pounds = 200;
        double kilograms = pounds * 0.45359237;
        System.out.println("Converted kilograms = " + kilograms);

        double pi = 3.1415927;
        double anotherNumber = 3_000_000.4_467_890;
        System.out.println(pi + " " + anotherNumber);
    }
}
