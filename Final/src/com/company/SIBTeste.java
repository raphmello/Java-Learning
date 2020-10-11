package com.company;

public class SIBTeste {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTeste() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("Second initialization block called");
    }

    public void someMethod() {
        System.out.println("Some method called");
    }

}


