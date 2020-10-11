package com.company;

import java.util.Scanner;

public class ReadInteger {
    private Scanner x = new Scanner(System.in);

    public ReadInteger() {
    }

    public int returnValue() {
        System.out.println("Type de value: ");
        int x = this.x.nextInt();
        this.x.nextLine();
        return x;
    }
}
