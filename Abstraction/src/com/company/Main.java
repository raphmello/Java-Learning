package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Ayla");
        dog.breath();
        dog.eat();
        Bird bird = new Parrot("bird");
        bird.breath();
        bird.eat();
        bird.fly();
        Bird penquim = new Penguim("Penguim");
        penquim.fly();
    }
}
