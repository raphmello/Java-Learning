package com.company;

import com.series.Series;

public class Main {

    public static void main(String[] args) {
        Series teste = new Series();
        for (int i = 0; i<= 10 ; i++) {
            System.out.println(teste.nSum(i));
        }
        for (int i = 1; i<= 10 ; i++) {
            System.out.println(teste.factorial(i));

        }
        for (int i = 0; i<= 10 ; i++) {
            System.out.println(teste.fibonacci(i));

        }
    }
}
