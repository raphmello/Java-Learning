package com.company;

public class Penguim extends Bird {
    public Penguim(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I dont fly very well");
    }
}
