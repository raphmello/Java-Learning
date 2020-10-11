package com.company;

public class Main {

    public static void main(String[] args) {
        byte newByte = 50;
        short newShort = 5000;
        int calc = 70000;
        long myLong = 50000 + 10*(newByte+newShort+calc);
        System.out.println(myLong);

        short shortTotal = (short)(1000 + 10 * (newByte + newShort + calc));
    }
}
