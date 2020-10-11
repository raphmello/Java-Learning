package com.company;

public class TimesTable {
    private int x;

    public TimesTable(int x) {
        this.x = x;
    }

    public void printTimesTable () {
        for (int x=1;x<=12;x++) {
            System.out.println(this.x + " times " + x + " = " + this.x*x);
        }
    }
}
