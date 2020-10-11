package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       //ArrayList<int> intArray = new ArrayList<>(); //cannot be a primitive type
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0;i<=10;i++) {
            integerArrayList.add(Integer.valueOf(i+1));
        }
        System.out.println(integerArrayList.toString());
        System.out.println(integerArrayList.get(10));
        int test = integerArrayList.get(10).intValue();
        System.out.println(test);

        Integer newNumber = Integer.valueOf(56); //works
        Integer newInt = 56; //works too
    }
}
