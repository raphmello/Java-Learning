package com.company;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping wings");
    }

    @Override
    public void eat() {
        System.out.println("Eating "+getName()+" is picking");
    }

    @Override
    public void breath() {
        System.out.println("Bird breath");
    }
}
