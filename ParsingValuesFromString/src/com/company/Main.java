package com.company;

public class Main {

    public static void main(String[] args) {
        String string = "2018.125";
        System.out.println(string);

        double number = Double.parseDouble(string);
        System.out.println(number);

        string = string + 1;
        number = number + 1;
        System.out.println(string);
        System.out.println(number);
    }
}
