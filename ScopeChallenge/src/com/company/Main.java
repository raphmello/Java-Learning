package com.company;

public class Main {

    public static void main(String[] args) {

        ReadInteger x = new ReadInteger();
        TimesTable xx = new TimesTable(x.returnValue());
        xx.printTimesTable();
    }




}
